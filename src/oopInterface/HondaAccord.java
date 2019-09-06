package oopInterface;

public class HondaAccord implements Vehicle {

	@Override
	public void accelerate() {
		System.out.println("Honda Accelerate");
	}

	@Override
	public void brake() {
		System.out.println("Honda brake");
	}

	@Override
	public void steer() {
		System.out.println("Honda steer");
	}

}
