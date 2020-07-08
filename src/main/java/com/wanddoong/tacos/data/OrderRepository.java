package com.wanddoong.tacos.data;

import com.wanddoong.tacos.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
