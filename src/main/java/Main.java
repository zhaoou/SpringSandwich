import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.AppConfig;
import beans.Bread;
import beans.Sandwich;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// bean name, 'baseballGame' comes from the component class name
		//Bread bread = context.getBean("ryeBread",Bread.class);
		Sandwich sandwich = context.getBean("sandwich", Sandwich.class);
		System.out.println(sandwich.makeSandwich());

	}

}
