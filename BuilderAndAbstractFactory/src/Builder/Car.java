package Builder;

import CarBody.carBody;
import CarPart.carPart;
import CarWheel.carWheel;

public class Car {
	private carWheel carWheel;
	private carBody carBody;
	private carPart carPart;
	
	public carWheel getCarWheel() {
		return carWheel;
	}
	public carBody getCarBody() {
		return carBody;
	}
	public carPart getCarPart() {
		return carPart;
	}
	public Car(myBuilder builder) {
		// TODO Auto-generated constructor stub
		this.carBody = builder.carBody;
		this.carPart = builder.carPart;
		this.carWheel = builder.carWheel;
	}
	public static class myBuilder{
		private carWheel carWheel;
		private carBody carBody;
		private carPart carPart;
//		public myBuilder(myBuilder myBuilder) {
//		 this.carBody = myBuilder.carBody;
//		 this.carPart = myBuilder.carPart;
//		 this.carWheel = myBuilder.carWheel;
//		}
		public myBuilder buildercarBody(carBody body) {
			this.carBody = body;
			return this;
			
		}
		public myBuilder buildercarWheel(carWheel carWheel) {
			this.carWheel = carWheel;
			return this;
		}
		public myBuilder buildercarPart(carPart carPart) {
			this.carPart = carPart;
			return this;
		}
		public Car builder() {
			return new Car(this);
		} 
	}
	@Override
	public String toString() {
		return "Car [carWheel=" + carWheel + ", carBody=" + carBody + ", carPart=" + carPart + "]";
	}
	
	
}
