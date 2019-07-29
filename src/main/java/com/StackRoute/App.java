package com.StackRoute;


import com.StackRoute.Task1.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=(Movie)applicationContext.getBean("movie1");
        System.out.println(movie1.getActor());

        Movie movie3=(Movie)applicationContext.getBean("movie3");
        System.out.println(movie3.getActor());
        System.out.println(movie1==movie3);


    }
}
