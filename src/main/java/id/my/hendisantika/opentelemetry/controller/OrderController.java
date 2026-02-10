package id.my.hendisantika.opentelemetry.controller;

import id.my.hendisantika.opentelemetry.entity.Order;
import id.my.hendisantika.opentelemetry.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : opentelemetry
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 11/02/26
 * Time: 06.34
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository orderRepository;

    @GetMapping("/{id}")
    public Order findById(@PathVariable Long id) {
        return this.orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid id: %d".formatted(id)));
    }
}
