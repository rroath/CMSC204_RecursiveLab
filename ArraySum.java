
public class ArraySum {
	
	public String getArray(Integer[] x, int y) {
		if(y!=-1)
			return(x[y]+" "+getArray(x, y-1));
		else return " ";
	}
	
	public int sumOfArray( Integer[] x, int y) {
		if(y!=-1)
			return (x[y] + sumOfArray(x, y-1));
		else
			return 0;
	}
	
	public int fibonacchi() {
		
	}

}
