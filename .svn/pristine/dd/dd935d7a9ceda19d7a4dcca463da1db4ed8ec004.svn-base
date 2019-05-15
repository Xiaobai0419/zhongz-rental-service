package com.zhongz.rental.common.aop;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

@Component
@Aspect
public class RestAop {

	private static Log log = LogFactory.getLog(RestAop.class);
	
	private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	@Around(value = "execution(public * com.zhongz.rental.rest..*.*(..))")
	public Object beforeRest(ProceedingJoinPoint joinPoint){
		try {
			MethodSignature signature = (MethodSignature) joinPoint.getSignature();
	        Method method = signature.getMethod();
	        Class<?> targetClass = method.getDeclaringClass();
	
	        StringBuffer classAndMethod = new StringBuffer();
	
	        String target = targetClass.getName() + "#" + method.getName();
	        Object[] args = joinPoint.getArgs();
	        StringBuilder builder = new StringBuilder();
	        if(args != null && args.length > 0) {
				for(Object arg : args) {
					String param = null;
					try {
						param = JSONObject.toJSONStringWithDateFormat(arg, DATE_FORMAT, SerializerFeature.WriteMapNullValue);
					}catch (Exception e) {
						param = arg.toString();
					}
					builder.append(param).append(",");
				}
				builder.deleteCharAt(builder.length() - 1);
			}
//	        String params = JSONObject.toJSONStringWithDateFormat(joinPoint.getArgs(), DATE_FORMAT, SerializerFeature.WriteMapNullValue);
			String params = builder.toString();
			log.info(classAndMethod.toString() + "==> START REST: " + target + " PARAMS:" + params);
	
	        long start = System.currentTimeMillis();
	        Object result = joinPoint.proceed();
	        long timeConsuming = System.currentTimeMillis() - start;
	
	        log.info(classAndMethod.toString() + "<== END REST: " + target + 
	        		" RETURN:" + JSONObject.toJSONStringWithDateFormat(result, DATE_FORMAT, SerializerFeature.WriteMapNullValue) +" COST TIME:" + timeConsuming + "ms");
	        return result;
		} catch(Throwable throwable) {
            log.error(throwable.getMessage(), throwable);
        }
		return null;
	}
}
