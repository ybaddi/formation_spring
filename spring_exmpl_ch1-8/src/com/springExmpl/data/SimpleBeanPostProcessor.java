package com.springExmpl.data;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SimpleBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof ProduitData) {
			((ProduitData) bean).setCreationDate(new Date());
			System.out.println("postProcessAfterInitialization");
		}
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof ProduitData) {
			System.out.println("postProcessBeforeInitialization");
		}
		return bean;
	}

}
