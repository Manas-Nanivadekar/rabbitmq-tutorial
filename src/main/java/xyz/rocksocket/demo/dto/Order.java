package xyz.rocksocket.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

    public Order(String id, String name, int qty, double price) {
        this.orderId = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String orderId;
    public String name;
    public int qty;
    public double price;
}
