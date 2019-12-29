package com.hurui.core.websocket.controller.v2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import com.hurui.core.websocket.model.InMessage;
import com.hurui.core.websocket.model.OutMessage;
import com.hurui.core.websocket.service.WebSocketService;
/**
 * @title 游戏公告
 * @author ruihu
 * @date 2019-03-30
 */
@Controller
public class V2GameInfoController {
	
	@Autowired
	private WebSocketService webSocket; 
	
	/**
	 * @title 定义mapping和发送出去的路由
	 * @param message
	 * @return
	 */
	@MessageMapping("/v2/chat")
	//@SendTo("/topic/game_chat")
	public void gameInfo(InMessage message) {
		System.out.println("v2----接收到的消息:" + message.getContent());
		//发送到这个订阅用户
		webSocket.sendTopicMessage("/topic/game_rank", message);
	}

}
