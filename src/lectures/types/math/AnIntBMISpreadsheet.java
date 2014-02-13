package lectures.types.math;

import bus.uigen.ObjectEditor;

public class AnIntBMISpreadsheet implements IntBMISpreadsheet {
	int height;
	int weight;	
	public AnIntBMISpreadsheet() { }	
	public AnIntBMISpreadsheet(
			int theInitialHeight, int theInitialWeight) {
		setHeight(theInitialHeight);
		setWeight(theInitialWeight);
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int newWeight) {
		weight = newWeight;
	}	
	public int getHeight() {
		return height;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}	
	public int getBMI() {
		return weight/(height*height);
	}
	public static void main(String[] args) {
		ObjectEditor.edit(new AnIntBMISpreadsheet ((int) 1.77, 75));
	}
	
}
