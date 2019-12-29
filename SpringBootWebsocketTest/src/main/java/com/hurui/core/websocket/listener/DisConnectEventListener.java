package com.hurui.core.websocket.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

/**
 * 建立连接的时候，进行监听
 * @author ruihu
 *
 */
@Component
public class DisConnectEventListener implements ApplicationListener<SessionDisconnectEvent> {

	@Override
	public void onApplicationEvent(SessionDisconnectEvent event) {
		//获取消息类型
		StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
		System.out.println("断开连接监听器消息，消息类型：" + headerAccessor.getCommand().getMessageType());
		
	}

}
