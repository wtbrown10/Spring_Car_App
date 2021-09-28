package main.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import main.engine.Engine;

@Component
public class OffRoadCar implements Car{

	@Autowired
	@Qualifier("offroadEngine")
	private Engine engine;

	public OffRoadCar() {
		
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public String showEngineHP() {
		return "hp: " + engine.getHp();
	}
}
