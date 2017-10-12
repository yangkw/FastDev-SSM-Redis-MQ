package mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class QueueMessageListener implements MessageListener {
	private Logger logger = LoggerFactory.getLogger(QueueMessageListener.class);




	// 当收到消息时，自动调用该方法
	public void onMessage(Message message) {
		TextMessage tm = (TextMessage) message;

	}

}