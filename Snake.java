package petsassignment;

class Snake extends Pet {
	private double length;
	
	public void setLength(double newLength) {
		length = newLength;
	}
	
	public double getLength() {
		return length;
	}
	
	public String speak() {
		return "Hiss! Hiss! ";
	}
}
