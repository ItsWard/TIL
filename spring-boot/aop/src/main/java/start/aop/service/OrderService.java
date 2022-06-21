package start.aop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import start.aop.domain.order.OrderRepository;

@Slf4j
@Service
public class OrderService {

    public final OrderRepository orderRepository;

    private OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public void orderItem(String itemId) {
        log.info("[orderService] 실행");
        orderRepository.save(itemId);
    }

}
