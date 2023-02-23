package warehouse.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import warehouse.models.Order;
import warehouse.services.OrderService;

@RestController
@RequestMapping("/order/")
@Tag(name = "Order operations", description = "Order controller of Warehouse service")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @DeleteMapping("{order_id}")
    void deleteOrderById(@PathVariable("order_id") Integer orderId) {
        orderService.deleteOrderById(orderId);
    }

}
