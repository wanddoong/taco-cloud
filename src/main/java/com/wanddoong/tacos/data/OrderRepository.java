package com.wanddoong.tacos.data;

import com.wanddoong.tacos.Order;
import com.wanddoong.tacos.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}
