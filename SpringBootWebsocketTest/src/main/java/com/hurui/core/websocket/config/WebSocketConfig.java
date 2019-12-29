package com.hurui.core.websocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * websocket的配置类
 * @author ruihu
 * @date 2019-03-30
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

	/**
	 * 发布和订阅消息的时候，需要连上这个断点
	 * 注册消息一个端点，相当于手机基站的作用，通过这个传输消息
	 * 基站名称：endpoint-websocket
	 * 允许任何站点访问，后面可以加上自己的域名
	 */
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/endpoint-websocket").setAllowedOrigins("*").withSockJS();
		
	}

	/**
	 * 配置消息代理（中介 ）
	 */
	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		//服务端推送给客户端的前缀
		registry.enableSimpleBroker("/topic", "/chat");
		//配置消息前缀,区分路径的划分，
		//客户端连接服务端的一个前缀
		registry.setApplicationDestinationPrefixes("/app");
	}
	
}
