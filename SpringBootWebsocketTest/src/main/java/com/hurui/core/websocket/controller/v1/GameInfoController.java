package com.hurui.core.websocket.controller.v1;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.hurui.core.websocket.model.InMessage;
import com.hurui.core.websocket.model.OutMessage;
/**
 * @title 游戏公告
 * @author ruihu
 * @date 2019-03-30
 */
@Controller
public class GameInfoController {
	
	/**
	 * @title 定义mapping和发送出去的路由
	 * @param message
	 * @return
	 */
	@MessageMapping("/v1/chat")
	@SendTo("/topic/game_chat")
	public OutMessage gameInfo(InMessage message) {
		System.out.println("v1----接收到的消息:" + message.getContent());
		return new OutMessage(message.getContent()); 
	}

}
