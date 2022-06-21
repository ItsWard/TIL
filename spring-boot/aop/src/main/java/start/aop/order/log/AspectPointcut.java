package start.aop.order.log;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class AspectPointcut {

    @Around("execution(* start.aop.order..*(..))") //start.aop.order.. 내의 클래스 메소드들이 모두 대상
    public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("log -> {}", joinPoint.getSignature()); //호출되는 메소드에 대한 정보
        return joinPoint.proceed();
    }
}

