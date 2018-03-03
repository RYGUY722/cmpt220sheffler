
public class Location {
	public int row, column;
	public double maxValue;
	Location(double max, int row1, int column1){
		row=row1;
		column=column1;
		maxValue=max;
	}
	public String toString(){
		return maxValue+" at ("+row+", "+column+")";
	}

}
