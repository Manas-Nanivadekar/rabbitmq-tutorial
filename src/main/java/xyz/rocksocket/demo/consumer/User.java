package xyz.rocksocket.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import xyz.rocksocket.demo.dto.OrderStatus;
import xyz.rocksocket.demo.config.MessagingConfig;

@Component
public class User {

    @RabbitListener(queues = MessagingConfig.QUEUE_NAME)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message recieved from queue : " + orderStatus);
    }
}
