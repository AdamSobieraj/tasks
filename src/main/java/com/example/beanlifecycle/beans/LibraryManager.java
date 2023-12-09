package com.example.beanlifecycle.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LibraryManager implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {

//      pierwsza opcja

//      klkasa
//    public class LibraryManager implements BeanNameAware {
//
//

//    private String beanName;
//
//    @Override
//    public void setBeanName(String s) {
//        beanName = s;
//        System.out.println("name of the bean: " + s);
//    }

//  druga opcja

    private String beanName;

    @Override
    public void setBeanName(String s) {
        beanName = s;
        System.out.println("name of the bean: " + s);
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("ClassLoader instance passed");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory instance passed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties are set");
    }

    @PostConstruct
    public void exampleConstructMethod() {
        System.out.println("Method with @PostConstruct annotation");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Method destroy has been called");
    }

    @PreDestroy
    public void exampleDestroyMethod() {
        System.out.println("Method with @PreDestroy annotation");
    }


}
