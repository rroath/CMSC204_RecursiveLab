
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
	
	public int fibonacchi(Integer[] value, int n) {
		if(n==0) return 1;
		if(value[n]!=0) return value[n];
		if(value[n-1]!=0){
			value[n]=n*value[n-1];
			return value[n];
		}
		else{
			value[n-1]=fact(n-1);
			value[n]=n*value[n-1];
			return value[n];
		}
	}

}
