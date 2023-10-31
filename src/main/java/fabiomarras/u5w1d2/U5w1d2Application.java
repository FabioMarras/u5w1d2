package fabiomarras.u5w1d2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5w1d2Application {

	public static void main(String[] args) {
		SpringApplication.run(U5w1d2Application.class, args);
		configurationClass();
	}
	public static void configurationClass() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5w1d2Application.class);
//		System.out.println(ctx.getBean("allPizzas"));
//		System.out.println(ctx.getBean("allDrinks"));
//		System.out.println(ctx.getBean("allTopings"));
//		System.out.println(ctx.getBean("allMenù"));
		System.out.println(ctx.getBean("PizzaIMargherita"));

		ctx.close();
	}
}
