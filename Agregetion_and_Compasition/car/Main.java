package by.http.hw.oop.car;

public class Main {
	

		public static void main(String[] args) {

			int fuel = 20;
			Car car = new Car();
			CarLogic carLogic = car.getCarLogic();
			carLogic.drive(car);
			carLogic.refuel(car, fuel);
			carLogic.changeWheel(car);
			System.out.println(car.getModel());

		}

}
