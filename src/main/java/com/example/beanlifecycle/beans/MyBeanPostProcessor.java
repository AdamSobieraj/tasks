package com.example.beanlifecycle.beans;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    private static final Logger LOG = LogManager.getLogger(MyBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        LOG.info("Before initialization of bean" + beanName);

        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        LOG.info("After initialization of bean" + beanName);

        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }


}
