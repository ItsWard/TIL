package start.aop.order.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import start.aop.order.domain.OrderRepository;
import start.aop.order.domain.OrderRepositoryImpl;

@Slf4j
@Service
public class OrderService {

    private final OrderRepositoryImpl orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void orderItem(String itemId) {
        log.info("[orderService] 실행");
        orderRepository.save(itemId);
    }

}
