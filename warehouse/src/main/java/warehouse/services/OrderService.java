package warehouse.services;

import warehouse.models.Order;

public interface OrderService {

    Order createOrder(Order order);

    void deleteOrderById(Integer orderId);

}
