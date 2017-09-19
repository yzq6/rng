package com.zhiyou100.ssm.action;



import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhiyou100.ssm.service.IMessageService;
import com.zhiyou100.ssm.service.IUserService;
import com.zhiyou100.ssm.util.ConstantUtils;
import com.zhiyou100.ssm.vo.Message;
import com.zhiyou100.ssm.vo.User;

@Controller
@Scope(scopeName="prototype")
@RequestMapping
public class MessageAction {
	Logger log =Logger.getLogger(MessageAction.class);
	
	@Autowired
	private IUserService userService;
	@Autowired
	private IMessageService messageService;
	
	@RequestMapping("/message/save")
	public String save(Message vo,ModelMap map,HttpServletRequest request){
		log.info("=======save===="+vo);
		String send=request.getParameter("send");
		String save=request.getParameter("save");
		if ("发送".equals(send)) {// 发送状态..
			log.info("====发送====");
			vo.setSender(1);
			vo.setSaveTime(new Date());
			vo.setSendTime(new Date());
			vo.setSendDelete(ConstantUtils.SEND_DELETE_NORMAL);
			vo.setSendStatus(ConstantUtils.SEND_STATUS_SUCCESS);
			vo.setSendUpdateTime(new Date());
			vo.setReceiveDelete(ConstantUtils.RECEIVE_DELETE_NORMAL);
			vo.setReceiveStatus(ConstantUtils.RECEIVE_STATUS_UNREAD);
			vo.setReceiveUpdateTime(new Date());
			
			boolean flag=messageService.add(vo);
			if (flag) {
				log.info("====message====listSend====");
				List<Message> list=messageService.findAllSend(vo);
				map.put("list", list);
				return "/message/listSend";
			}else {
				return "redirect:/message/save.action";
			}
		}else if("保存草稿".equals(save)){
			vo.setSender(1);
			vo.setSaveTime(new Date());
			vo.setSendTime(new Date());
			vo.setSendDelete(ConstantUtils.SEND_DELETE_NORMAL);
			vo.setSendStatus(ConstantUtils.SEND_STATUS_DRAFT);
			vo.setSendUpdateTime(new Date());
			vo.setReceiveDelete(ConstantUtils.RECEIVE_DELETE_NORMAL);
			vo.setReceiveStatus(ConstantUtils.RECEIVE_STATUS_UNREAD);
			vo.setReceiveUpdateTime(new Date());
			boolean flag=messageService.add(vo);
			if (flag) {
				List<Message>list=messageService.findAllSave(vo);
				map.put("list", list);
				return "/message/listSave";
			}
			
		}else {
			List<User>list=userService.findAllReceiver();
			map.put("users", list);
		}
		return "/message/save";
	}
	
	@RequestMapping("/message/listReceive")
	public String listReceive(ModelMap map){
		Message vo=new Message();
		vo.setReceiver(1);
		vo.setReceiveStatus(ConstantUtils.RECEIVE_STATUS_UNREAD);
		vo.setReceiveDelete(ConstantUtils.RECEIVE_DELETE_NORMAL);
		List<Message> list=messageService.findAllReceive1(vo);
		
		map.put("list", list);
		return "/message/listReceive";
	}
	@RequestMapping("message/listReceive1")
	public String listReceive(ModelMap map,String keyword,String searchField){
		Message vo=new Message();
		vo.setReceiver(1);
		vo.setReceiveStatus(ConstantUtils.RECEIVE_STATUS_UNREAD);
		vo.setReceiveDelete(ConstantUtils.RECEIVE_DELETE_NORMAL);
		Map<String, Object>map1=new HashMap<>();
		map1.put("receiver", vo.getReceiver());
		map1.put("receiveStatus", vo.getReceiveDelete());
		//map1.put("receive", vo.get)
		return searchField;
	}
	@RequestMapping("message/listSend1")
	public String listsend1(ModelMap map, Message vo,String keyword,String searchField){
		vo.setSender(1);
		vo.setSendStatus(ConstantUtils.SEND_STATUS_SUCCESS);
		vo.setSendDelete(ConstantUtils.SEND_DELETE_NORMAL);
		
		Map<String, Object> map1=new HashMap<>();
		map1.put("columns", searchField);
		map1.put("keyword", "%"+keyword+"%");
		map1.put("sender", vo.getSender());
		map1.put("sendStatus", vo.getSendStatus());
		map1.put("sendDelete", vo.getSendDelete());
		
		List<Message> list=messageService.findAlllike(map1);
		map.put("list", list);
		return "message/listSend";
	}
	
	@RequestMapping("/message/listSend")
	public String listSend(ModelMap map){
		Message vo=new Message();
		vo.setSender(1);
		vo.setSendStatus(ConstantUtils.SEND_STATUS_SUCCESS);
		vo.setSendDelete(ConstantUtils.SEND_DELETE_NORMAL);
	List<Message>list=messageService.findAllSend(vo);
	map.put("list", list);
	return "message/listSend";
	}
	@RequestMapping("message/listSave1")
	public String listSave1(ModelMap map,String keyword,String searchField){
		Message vo=new Message();
		vo.setSender(1);
		vo.setSendStatus(ConstantUtils.SEND_STATUS_DRAFT);
		vo.setSendDelete(ConstantUtils.SEND_DELETE_NORMAL);
		Map<String, Object>map1=new HashMap<>();
		map1.put("sender", vo.getSender());
		map1.put("sendStatus", vo.getSendStatus());
		map1.put("sendDelete", vo.getSendDelete());
		map1.put("columns", searchField);
		map1.put("keyword", "%"+keyword+"%");
		List<Message>list=messageService.findAlllike(map1);
		map.put("list", list);
		return "message/listSave";
	}
	
	@RequestMapping("message/listSave")
	public String listSave(ModelMap map){
		Message vo=new Message();
		vo.setSender(1);
		vo.setSendStatus(ConstantUtils.SEND_STATUS_DRAFT);
		vo.setSendDelete(ConstantUtils.SEND_DELETE_NORMAL);
		log.info("========="+vo);
		List<Message>list=messageService.findAllSave(vo);
		map.put("list", list);
		return "message/listSave";
	}
	
	@RequestMapping("message/listRemove")
	public String listRemove(ModelMap map){
		Message vo=new Message();
		vo.setReceiver(1);
		vo.setSender(1);
		vo.setSendDelete(ConstantUtils.SEND_DELETE_DUST);
		vo.setReceiveDelete(ConstantUtils.RECEIVE_DELETE_DUST);
		
		List<Message>list=messageService.findAllRemove(vo);
		map.put("list", list);
		return "message/listRemove";
	}
	@RequestMapping("message/remove")
	public String listremove(ModelMap map,Message vo){
		vo.setSendDelete(ConstantUtils.SEND_DELETE_DUST);
		boolean falg=messageService.update(vo);
		if (falg) {
			vo.setSendDelete(ConstantUtils.SEND_DELETE_NORMAL);
			vo.setSender(1);
			vo.setSendStatus(ConstantUtils.SEND_STATUS_SUCCESS);
			List<Message>list=messageService.findAllSend(vo);
			map.put("list", list);
		}
		return "message/listSend";
	}
	@RequestMapping("message/remove1")
	public String remove1(ModelMap map,Message vo){
		//Message vo=new Message();
		vo.setSendDelete(ConstantUtils.SEND_DELETE_DUST);
		boolean falg=messageService.update(vo);
		if (falg) {
			vo.setSender(1);
			vo.setSendStatus(ConstantUtils.SEND_STATUS_DRAFT);
			vo.setSendDelete(ConstantUtils.SEND_DELETE_NORMAL);
			List<Message> list=messageService.findAllSave(vo);
			map.put("list", list);
		}
		return "message/listSave";
	}
	@RequestMapping("message/remove2")
	public String remove2(ModelMap map,Message vo){
		
		vo.setReceiveDelete(ConstantUtils.RECEIVE_DELETE_DUST);
		boolean falg=messageService.update2(vo);
		if (falg) {
			vo.setReceiver(1);
			vo.setReceiveStatus(ConstantUtils.RECEIVE_STATUS_UNREAD);
			vo.setReceiveDelete(ConstantUtils.RECEIVE_DELETE_NORMAL);
			List<Message> list=messageService.findAllReceive1(vo);
			map.put("list", list);
		}
		return "message/listSave";
	}
	@RequestMapping("message/remove3")
	public String remove3(ModelMap map,Message vo){
		boolean falg=messageService.delete(vo.getMessageId());
		if (falg) {
			
			vo.setReceiver(1);
			vo.setSender(1);
			vo.setSendDelete(ConstantUtils.SEND_DELETE_DUST);
			vo.setReceiveDelete(ConstantUtils.RECEIVE_DELETE_DUST);
			List<Message>list=messageService.findAllRemove(vo);
			map.put("list", list);
		}
		return "message/listRemove";
	}
	
}
