//package com.bam.billingsystem.aspect;
//
//import java.util.Objects;
//
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import com.bam.billingsystem.exception.CommonException;
//
//@Aspect
//@Component
//public class LoggingAspect {
//	final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
//
////	@Pointcut("within(com.bam.billingsystem..*)")
////    public void allLayerExecution() {}
//
//	@Pointcut("@target(org.springframework.web.bind.annotation.RestController)")
//    public void controllerMethods() {}
//	
//	@AfterThrowing("controllerMethods()")
//	public void logAfterThrowingAllMethods(CommonException commonException) throws Throwable {
////		final Logger LOGGER = LoggerFactory.getLogger(jp.getTarget().getClass());
//
//		LOGGER.error("{}", commonException);
//	}
//
//	@AfterThrowing("controllerMethods()")
//	public void logAfterThrowingAllMethods(Exception exception) throws Throwable {
////		final Logger LOGGER = LoggerFactory.getLogger(jp.getTarget().getClass());
//
//		LOGGER.error("{}", exception);
//		
//		StackTraceElement[] stackTaces = exception.getStackTrace();
//
//		if (Objects.nonNull(stackTaces) && stackTaces.length > 0) {
//			for (StackTraceElement s : stackTaces) {
//				if (s.getClass().getPackage().toString().startsWith("com.bam.billingsystem")) {
//					LOGGER.error("{}", s);
//				}
//			}
//		}
//
//	}
//}