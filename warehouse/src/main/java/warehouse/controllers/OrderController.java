package warehouse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import warehouse.entities.OrderEntity;
import warehouse.services.OrderService;

@RestController
@RequestMapping("/order/")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public OrderEntity createOrder(@RequestBody OrderEntity order) {
        return orderService.createOrder(order);
    }

    @DeleteMapping("{order_id}")
    void deleteOrderById(@PathVariable("order_id") Integer orderId) {
        orderService.deleteOrderById(orderId);
    }

}
