package com.hurui.core.websocket.model;

import java.util.Date;
/**
 * @title 消息接收类
 * @author ruihu
 * @date 2019-03-30
 */
public class InMessage {

	/**
	 * 消息从哪里来
	 */
	private String from;
	/**
	 * 消息到哪里去
	 */
	private String to;
	/**
	 * 消息内容
	 */
	private String content;
	/**
	 * 消息发生时间
	 */
	private Date time;
	
	public InMessage() {}
	public InMessage(String context) {
		this.content = context;
	}
	public InMessage(String from, String to, String content, Date time) {
		this.from = from;
		this.to = to;
		this.content = content;
		this.time = time;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
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
