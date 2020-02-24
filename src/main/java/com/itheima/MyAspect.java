package com.itheima;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 包名:com.itheima
 * 作者:Leevi
 * 日期2020-02-17  14:20
 * aop配置中有三个重要的东西:
 * 1. 切面
 * 2. 切入点
 * 3. 通知
 */
@Component//在其他类上使用的就是Component这个注解
@Aspect//定义这个类是切面的类
public class MyAspect {
    //这个是指点切点
    @Pointcut("execution(* com.itheima.service.impl.AccountServiceImpl.transfer(..))")
    public void pt1(){
        //这个里面不需要写东西
    }

    @Before("pt1()")//在通知的上面定义自己的方法进行判断是否有
    public void security(){
        System.out.println("校验是否有权限....");
    }
}
