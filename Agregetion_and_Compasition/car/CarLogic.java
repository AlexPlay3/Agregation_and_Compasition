package by.http.hw.oop.car;

public class CarLogic {
	
	
	public CarLogic() {
	}

	public void startEngine(Car car) {
		Engine engine = car.getEngine();
		EngineLogic logic = car.getEngineLogic();
		logic.start(engine);
	}

	public void stopEngine(Car car) {
		Engine engine = car.getEngine();
		EngineLogic logic = car.getEngineLogic();
		logic.stop(engine);
	}

	public void drive(Car car) {
		startEngine(car);
		// add accelerate, steer, break etc
	}

	public void refuel(Car car, int fuel) {
		car.addFuel(fuel);
	}

	public void changeWheel(Car car) {

		Wheel[] wheel = car.getWheels();
		int i = 0;
		for (i = 0; i < wheel.length; i++) {

			
			if (wheel[i].isFlat()) {
				
				wheel[i] = new Wheel(18, "All season", "Sportline 8S 18");
				car.setWheel(wheel);
			}

		}

	}


}
