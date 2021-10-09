package xyz.rocksocket.demo.publisher;

import xyz.rocksocket.demo.config.MessagingConfig;
import xyz.rocksocket.demo.dto.Order;
import xyz.rocksocket.demo.dto.OrderStatus;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderPublisher {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/{restaurantName}")
    public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName) {
        OrderStatus orderStatus = new OrderStatus(order, "PROCESSING", "order placed succesfully in " + restaurantName);
        template.convertAndSend(MessagingConfig.EXCHANGE_NAME, MessagingConfig.ROUTING_KEY, orderStatus);
        return "Success !!";
    }
}
