public class Car extends Vehicle{
	
	private int numDoors;
	private int numPassengers;
	
	public Car(String aMake, String aModel, String aPlate, int doors, int passengers){
		super(aMake, aModel, aPlate);
		this.numDoors = doors;
		this.numPassengers = passengers;
	}
	
	public int getNumDoors() {
		return this.numDoors;
	}
	
	public int getNumPassengers() {
		return this.numPassengers;
	}
	@Override
	public String toString() {
		String result = String.format("%d-door %s %s with license %s.",this.numDoors, getMake(), getModel(), getPlate());
		return result;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Vehicle)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		
		if(otherCar.getNumDoors() == this.numDoors && otherCar.getNumPassengers() == this.numPassengers){
			return super.equals(other);
		}
		
		return false;
	}
	
	public Car copy() {
		String theMake = getMake();
		String theModel = getModel();
		String thePlate = getPlate();
		int theDoors = this.numDoors;
		int thePassengers = this.numPassengers;
		
		Car result = new Car(theMake, theModel, thePlate, theDoors, thePassengers);
		return result;
	}
}
		
