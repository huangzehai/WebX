package com.hzh.webx.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by huangzehai on 2016/6/2.
 */
@Aspect
@Component
public class AuthenticationAspect {
    @Before("execution(public * *(..))")
    public void info(){
        System.out.println("==========info===============");
    }
}
