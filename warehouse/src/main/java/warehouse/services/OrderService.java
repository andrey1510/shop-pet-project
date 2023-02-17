package warehouse.services;

import warehouse.entities.OrderEntity;

public interface OrderService {

    OrderEntity createOrder(OrderEntity order);

    void deleteOrderById(Integer orderId);

}
