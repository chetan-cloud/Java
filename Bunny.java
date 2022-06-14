package petsassignment;

class Bunny extends Pet {
	private String color;
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public String getColor() {
		return color;
	}
	
	public String speak() {
		return "Purr purr";
	}
}
