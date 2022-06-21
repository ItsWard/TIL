package start.aop.order.log;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Slf4j
@Aspect
public class AspectPointcutAbstractMethod {

    //클래스 단위가 아닌 메소드 단위에서, @Order 순서대로 실행할 수 있는 방법
    //기본적으로는 순서를 보장받지 못한다.
    //트랜잭션 실행 후, LogAspect 실행
    //왜 static을 사용해야하는지??
    @Aspect
    @Order(2)
    public static class LogAspect {
        @Around("start.aop.order.log.pointcut.Pointcuts.allOrder()")
        public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
            log.info("log -> {}", joinPoint.getSignature());
            return joinPoint.proceed();
        }
    }

    @Aspect
    @Order(1)
    public static class TxAspect {
        @Around("start.aop.order.log.pointcut.Pointcuts.orderAndService()")
        public Object doTransaction(ProceedingJoinPoint joinPoint) throws Throwable {

            try {
                log.info("트랜잭션 시작 -> {}", joinPoint.getSignature());
                Object result = joinPoint.proceed();
                log.info("트랜잭션 커밋 -> {}", joinPoint.getSignature());
                return result;
            } catch (Exception e) {
                log.info("트랜잭션 롤백 -> {}", joinPoint.getSignature());
                throw e;
            } finally {
                log.info("리소스 릴리즈 -> {}", joinPoint.getSignature());
            }
        }
    }
}
