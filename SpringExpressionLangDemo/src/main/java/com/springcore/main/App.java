package com.springcore.main;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.springcore.model.Sum;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Sum sum = context.getBean("sum", Sum.class);
		System.out.println(sum);

		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression = temp.parseExpression("34+45");
		System.out.println(expression.getValue());

	}
}
