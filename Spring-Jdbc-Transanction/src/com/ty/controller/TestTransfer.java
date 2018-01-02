package com.ty.controller;
import static org.junit.Assert.*;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.ty.entity.Person;
import com.ty.service.TransferService;

public class TestTransfer {
	
	
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		TransferService transferService = context.getBean(TransferService.class);
//		Person person = transferService.queryOnePeopel(1);
//		System.out.println(person);
		
//		transferService.createOnePerson("唐宇", 10000);
		
//		transferService.deleteOnePerson(3);
		
//		transferService.updateOnePerson("唐宇", 50000, 1);
		
//		List<Person> persons = transferService.queryAllPerons();
//		System.out.println(persons);
		
		transferService.TranstMoney();
	}
}
