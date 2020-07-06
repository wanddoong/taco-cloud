package com.wanddoong.tacos.data;

import com.wanddoong.tacos.Order;

public interface OrderRepository {
    Order save(Order order);
}
