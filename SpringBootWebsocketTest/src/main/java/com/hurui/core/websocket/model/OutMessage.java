package com.hurui.core.websocket.model;

import java.util.Date;
/**
 * @title 消息发送类
 * @author ruihu
 * @date 2019-03-30
 */
public class OutMessage {

	/**
	 * 消息从哪里来
	 */
	private String from;
	/**
	 * 消息内容
	 */
	private String content;
	/**
	 * 消息发生时间
	 */
	private Date time = new Date();
	
	public OutMessage() {}
	public OutMessage(String context) {
		this.content = context;
	};
	public OutMessage(String from, String content) {
		this.from = from;
		this.content = content;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
	
	
}
