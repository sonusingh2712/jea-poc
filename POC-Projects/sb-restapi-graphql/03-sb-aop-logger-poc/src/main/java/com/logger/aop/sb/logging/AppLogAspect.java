package com.logger.aop.sb.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AppLogAspect {

    private static final Logger log = LogManager.getLogger(AppLogAspect.class);

    //execution(access_specifier package_name class_name method_name (arguments_list))
    @Pointcut("execution(* com.logger.aop.sb.*.*.*(..))")
    private void loggerPointCut(){
        /* This method implementation is skipped because it only for redirecting
         to the specific package */
    }

    @Before("loggerPointCut()")
    public void logBeforeAdvice(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        log.info("Start : {} {}() with arguments as {}",joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(), args);
    }

    @After("loggerPointCut()")
    public void logAfterAdvice(JoinPoint joinPoint){
        log.info("End : {} , {}()",joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "loggerPointCut()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result){
        log.info("{}() is returned with {}", joinPoint.getSignature().getName(), String.valueOf(result));
    }

    @AfterThrowing(pointcut = "loggerPointCut()", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, Exception exception){
        log.error("Exception in {}(), because of {}", joinPoint.getSignature().getName(), exception.getMessage());
    }

    //@Around
}
