package com.StackRoute;


import com.StackRoute.domain.Movie;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();
//        BeanLifeCycleDemo beanLifeCycleDemo = (BeanLifeCycleDemo)applicationContext.getBean("lifeCycle");
//        System.out.println(beanLifeCycleDemo.toString());
//        Movie movie1=(Movie)applicationContext.getBean("movie1");
//        System.out.println(movie1.getActor());
        BeanPostProcessorDemo beanPostProcessorDemo=(BeanPostProcessorDemo)applicationContext.getBean("postProcessing");



    }
}
