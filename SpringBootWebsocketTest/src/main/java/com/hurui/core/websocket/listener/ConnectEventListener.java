package com.hurui.core.websocket.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectEvent;

/**
 * 建立连接的时候，进行监听
 * @author ruihu
 *
 */
@Component
public class ConnectEventListener implements ApplicationListener<SessionConnectEvent> {

	@Override
	public void onApplicationEvent(SessionConnectEvent event) {
		//用消息头，先包一层,然后可以获取消息的很多东西
		StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
		//获取消息类型
		System.out.println("连接监听器消息，消息类型：" + headerAccessor.getCommand().getMessageType());
		
	}

}
