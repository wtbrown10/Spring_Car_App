package main.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import main.engine.Engine;

@Component
public class OffRoadCar implements Car{

	@Autowired
	@Qualifier("offRoadEngine")
	private Engine engine;

	@Autowired
	private Environment environment;
	public OffRoadCar() {
		
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
		System.out.println("Transmission: " + environment.getProperty("car.transmission"));

	}
}
