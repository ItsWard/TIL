package start.aop.order.log;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Slf4j
@Aspect
public class AspectPointcutAbstract {
//@Around에 포인트컷 표현식을 직접 넣지않고  @Pointcut 애너테이션을 사용해서 분리하는 클래스
    @Pointcut("execution(* start.aop.order..*(..))")
    private void allOrder(){} //포인트 컷 반환타입은 void

    @Around("allOrder()") //특정 기능을 대상으로 하는 포인트컷
    public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("log -> {}", joinPoint.getSignature());
        return joinPoint.proceed();
    }
}

