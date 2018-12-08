package com.multimodule.activemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

/**
 * @ClassName: MessageListener
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/12/3 16:12
 * @Version: 1.0
 */
@Service
public class MessageListener {

    /**
     * @MethodName gainMessage
     * @Description 监听modules队列的消息
     * @param message
     * @Return void
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/12/3 16:13
     */
    @JmsListener(destination = "modules", containerFactory = "jmsListenerContainerQueue")
    public void gainMessage(String message){
        System.out.println("接受到的消息为："+message);
    }

    /**
     * @MethodName gainMessageOfTranfor
     * @Description 将消息处理完成之后，还需要继续消息的化使用@SendTo
     * @param message
     * @Return java.lang.String
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/12/3 16:28
     */
    @JmsListener(destination = "modules", containerFactory = "jmsListenerContainerQueue")
    @SendTo("test")
    public String gainMessageOfTranfor(String message){
        System.out.println("接受到的消息为关于modules队列："+message);
        return "向test队列发送这条消息；"+message;
    }
}
