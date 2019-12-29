package com.hurui.core.websocket.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionSubscribeEvent;

/**
 * SessionSubscribeEvent 这个是泛型，可以指定，也可以自己实现
 * @author ruihu
 * @date 2019-12-30
 */
@Component
public class SubscirbeEvnetListener implements ApplicationListener<SessionSubscribeEvent> {

	@Override
	public void onApplicationEvent(SessionSubscribeEvent event) {
		//用消息头，先包一层,然后可以获取消息的很多东西
		StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
		//获取消息类型
		System.out.println("监听器消息，消息类型：" + headerAccessor.getCommand().getMessageType());
	}

}
