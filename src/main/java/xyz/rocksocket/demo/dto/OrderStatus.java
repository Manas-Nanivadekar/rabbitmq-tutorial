package xyz.rocksocket.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderStatus {
    public OrderStatus(Order order, String status, String message) {
        this.order = order;
        this.status = status;
        this.message = message;
    }

    public Order order;
    public String status;// progress,completed
    public String message;
}
