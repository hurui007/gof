package com.hurui.core.websocket.service;
/**
 * @title 简单消息模板，用来推送消息
 * @author ruihu
 * @date 2019-03-30
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.hurui.core.websocket.model.InMessage;
import com.hurui.core.websocket.model.OutMessage;

@Service
public class WebSocketService {
	@Autowired
	private SimpMessagingTemplate template;
	
	public void sendTopicMessage(String dest, InMessage message) {
		for(int i=0;i<10;i++) {
			//第一个参数是目的地(/topic/game_rank)，然后把消息直接转出去
			template.convertAndSend(dest, new OutMessage(message.getContent() + "\t " + i));
		}
	}
	
	public void sendChatMessage(InMessage message) {
		template.convertAndSend("/chat/single/" + message.getTo(),
				new OutMessage(message.getFrom() + " 发送：" + message.getTo() + ",内容：" + message.getContent()));
	}
	
	public void sendChatMessage2(InMessage message) {
		template.convertAndSendToUser(message.getTo(), "/chat/single/", new OutMessage(message.getFrom() + " 发送：" + message.getTo() + ",内容：" + message.getContent()));
	}

	
}
