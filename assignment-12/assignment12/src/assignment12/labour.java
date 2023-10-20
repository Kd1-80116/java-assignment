package assignment12;

public class labour implements Emp {
	
private double hrs;
 private double rate;

public labour(double hrs, double rate) {
	super();
	this.hrs = hrs;
	this.rate = rate;
}
public double getsal() {
	
	return hrs*rate;
}
double calcInce() {
	if(hrs>300)
		return 0.05*hrs*rate;
	return 0.0;
	
}
}
