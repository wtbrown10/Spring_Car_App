package main.car;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import main.engine.Engine;

@Component
public class SportCar implements Car {
	
	private Engine engine;

	public SportCar(@Qualifier("offroadEngine") Engine engine) {
		this.engine = engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public String showEngineHP() {
		return "hp: " + engine.getHp();
	}
	

}
