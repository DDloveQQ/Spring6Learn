package com.ygq.spring.AnnoAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect  // 表示这个类是一个切面类
@Component  // 保证这个切面类能够放入IOC容器
public class LogAspect {
    // 重用切入点表达式声明
    @Pointcut("execution(* com.ygq.spring.AnnoAop.CalculatorImpl.*(..))")
    public void pointcut(){}

    // 在被代理的目标方法前执行
    @Before("execution(public int com.ygq.spring.AnnoAop.CalculatorImpl.*(..))")  // 切入点表达式, * 表示方法名任意,(..)表示参数列表任意
    public void beforeMethod(JoinPoint joinPoint) {  // 形参:连接点
        // 获取连接点签名信息
        String methodName = joinPoint.getSignature().getName();
        // 获得目标方法的实参信息
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("Logger-->前置通知，方法名：" + methodName + "，参数：" + args);
    }

    // 在被代理的目标方法最终结束后执行(盖棺定论)
    @After("execution(* com.ygq.spring.AnnoAop.CalculatorImpl.*(..))")  // 切入点表达式,前面的 * 表示“权限修饰符”和“返回值”不限
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->后置通知，方法名：" + methodName);
    }

    // 在被代理的目标方法成功运行后执行(寿终正寝)
    @AfterReturning(value = "pointcut()", returning = "result")  // 切入点表达式重用,属性returning用来将接收目标方法的返回值映射到通知方法的某个形参
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->返回通知，方法名：" + methodName + "，结果：" + result);
    }

    // 在被代理的目标方法异常结束后执行(死于非命)
    @AfterThrowing(value = "pointcut()", throwing = "ex")  // 切入点表达式重用, 属性throwing用来将接收目标方法的异常映射到通知方法的某个形参
    public void afterThrowing(JoinPoint joinPoint, Throwable ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->异常通知，方法名：" + methodName + "，结果：" + ex);
    }

    // 环绕通知, 使用try...catch...finally结构围绕整个被代理的目标方法
    @Around("pointcut()")  // 切入点在同一个切面中重用
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        Object result = null;

        try {
            System.out.println("环绕通知-->目标对象方法执行之前");
            //目标对象（连接点）方法的执行
            result = joinPoint.proceed();
            System.out.println("环绕通知-->目标对象方法返回值之后");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知-->目标对象方法出现异常时");
        } finally {
            System.out.println("环绕通知-->目标对象方法执行完毕");
        }
        return result;
    }
}
