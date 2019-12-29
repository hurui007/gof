package com.hurui.core.websocket.controller.v3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import com.hurui.core.websocket.model.InMessage;
import com.hurui.core.websocket.service.WebSocketService;

/**
 * 点对点聊天
 * @author ruihu
 *
 */
@Controller
public class ChatRoomController {
	
	@Autowired
	private WebSocketService webSocket;
	
	@MessageMapping("/v3/chat/single")
	public void singleChat(InMessage message) {
		System.out.println("v3--接收到的消息:" + "from--" + message.getFrom() + ",to:" + message.getTo() + ",message:" + message.getContent());
		webSocket.sendChatMessage(message);
		//webSocket.sendChatMessage2(message);
	}

}
