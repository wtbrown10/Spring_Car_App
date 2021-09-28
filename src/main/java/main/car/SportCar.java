package main.car;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import main.engine.Engine;

@Component
public class SportCar implements Car {
	
	private Engine engine;

	@Value("${car.color: red}")
	private String color;

	public SportCar(@Qualifier("offRoadEngine") Engine engine) {
		this.engine = engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public String showEngineHP() {
		return "hp: " + engine.getHp();
	}

	@Override
	public void showInfo() {
		System.out.println("Color: " + color);

	}


}
