package com.training.advices;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//import java.util.logging.Logger;


@Aspect
@Component
public class LoggingAdvice {
    Logger log= LogManager.getLogger();
    //Logger log= Logger.getAnonymousLogger();
    @Around("execution(* com.training.beans.PaymentImpl.*(..))")
    public Object loggingAdvice(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println(pjp.getSignature());
        System.out.println(pjp.getArgs()[0]);
        log.info("Before executing method");
        Object obj=pjp.proceed();
        obj=(double)obj*1.1;
        log.info("After executing method");
        return obj;
    }
}
