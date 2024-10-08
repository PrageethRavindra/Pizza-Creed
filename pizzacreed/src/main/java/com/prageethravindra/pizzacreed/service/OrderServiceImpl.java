package com.prageethravindra.pizzacreed.service;

import com.prageethravindra.pizzacreed.dao.Order;
import com.prageethravindra.pizzacreed.dao.ShoppingBasket;
import com.prageethravindra.pizzacreed.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Transactional
    public Order checkout(ShoppingBasket shoppingBasket) {
        //TODO: Implement this method
        return null;
    }
}
