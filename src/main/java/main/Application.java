package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.car.Car;
import main.car.OffRoadCar;
import main.car.SportCar;
import main.config.Config;

public class Application {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		Car sportCar = ctx.getBean(SportCar.class);
		Car offRoadCar = ctx.getBean(OffRoadCar.class);
		
		System.out.println("SportCar engine: " + sportCar.showEngineHP());
		System.out.println("OffroadCar engine: " + offRoadCar.showEngineHP());
		
		((AnnotationConfigApplicationContext)ctx).close();
		
	}

}
