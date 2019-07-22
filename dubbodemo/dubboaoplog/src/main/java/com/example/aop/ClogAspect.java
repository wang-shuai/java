package com.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.lang.reflect.Method;

/**
 * extends LogAspect
 *
 * @author wangshuai
 * @date 2019/7/22
 */
@Aspect
public class ClogAspect {
    @Pointcut("@annotation(com.example.aop.LogAnnotation)")
    public void logPointCut() {
        System.out.println("log point cut");
    }

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) {
        System.out.println("enter around log start");
//        LogHelper.error("enter around log start");

        Object result = null;
        try {
            result = point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        handle(point,null);
        System.out.println("exit around log end");
//        LogHelper.error("exit around log end");

        return result;
    }

    private void handle(JoinPoint joinPoint, Exception e) {
        // 获取目标方法的签名
        String signature = joinPoint.getSignature().toString();
        //根据的带的签名去截取方法名
        //在目标方法的签名当中以最后一个点加1开始，以包裹参数的第一个尖括号结尾截取方法名
        String methodName = signature.substring(signature.lastIndexOf(".") + 1, signature.indexOf("("));
        // 再通过得到调用方法的目标对象，从而获取它的类名
        String classType = joinPoint.getTarget().getClass().getName();
        //再通过反射来得到这个类对象
        Class<?> clazz = null;
        try {
            clazz = Class.forName(classType);
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        //得到它内部所有的方法
        Method[] methods = clazz.getDeclaredMethods();
        System.out.println("methodName: " + methodName);

        //对得到的方法集合进行变脸
        for (Method method : methods) {
            // 如果以这个方法上面的注解值日志注解并且方法的名称是之前截取到的方法名
            if (method.isAnnotationPresent(LogAnnotation.class) && method.getName().equals(methodName)) {
                //这个时候就可以通过这个方法去获取其上面的注解
                //我们将获取主借注解的功能封装成一个方法，将之前反射得到的类对象当作参数传递过去
                String clazzName = clazz.getName();
                System.out.println("clazzName: " + clazzName + ", methodName: " + methodName);
//                LogHelper.error("clazzName: " + clazzName + ", methodName: " + methodName);

                LogAnnotation la = method.getAnnotation(LogAnnotation.class);
                System.out.println(la.actionName() + ":" + la.description());
//                LogHelper.error(la.actionName() + ":" + la.description());

                //这里就调用我们的服务层去将得到的数据写入数据库
                //loggerService.addLogger(process,methodName);
            }
        }
    }
}
