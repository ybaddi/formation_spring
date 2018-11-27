package com.springExmpl.data;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class SimpleBeanPostProcessor implements BeanPostProcessor, Ordered {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof ProduitData) {
			((ProduitData) bean).setCreationDate(new Date());
			System.out.println("postProcessAfterInitialization1");
		}
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof ProduitData) {
			System.out.println("postProcessBeforeInitialization1");
		}
		return bean;
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
