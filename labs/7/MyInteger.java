
public class MyInteger {
	int value;
	//Constructors
	MyInteger(int num){
		value=num;
	}
	//Getters/Setters
	public int getValue() {
		return value;
	}
	//Simple Methods
	public boolean isEven() {
		if(value%2==0) return true;
		else return false;
	}
	public boolean isOdd() {
		if(value%2==1) return true;
		else return false;
	}
	public boolean isPrime() {
		for(int x=2; x<=value/2;x++) {
			if(value%2==0) return false;
		}
		return true;
	}
	public boolean isEven(int n) {
		if(n%2==0) return true;
		else return false;
	}
	public boolean isOdd(int n) {
		if(n%2==1) return true;
		else return false;
	}
	public boolean isPrime(int n) {
		for(int x=2; x<=value/2;x++) {
			if(n%2==0) return false;
		}
		return true;
	}
	public boolean isEven(MyInteger n) {
		if(n.getValue()%2==0) return true;
		else return false;
	}
	public boolean isOdd(MyInteger n) {
		if(n.getValue()%2==1) return true;
		else return false;
	}
	public boolean isPrime(MyInteger n) {
		for(int x=2; x<=value/2;x++) {
			if(n.getValue()%2==0) return false;
		}
		return true;
	}
	//Somewhat Complex Methods
	public boolean equals(int b) {
		if(b==value) return true;
		else return false;
	}
	public boolean equals(MyInteger b) {
		if(b.getValue()==value) return true;
		else return false;
	}
	public int parseInt(char[] c) {
		String d="";
		for(int x=0;x<c.length;x++) {
			d+=c[x];
		}
		return parseInt(d);
	}
	public int parseInt(String s) {
		return Integer.parseInt(s);
	}
}
