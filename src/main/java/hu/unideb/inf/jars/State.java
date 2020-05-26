package hu.unideb.inf.jars;
public class State {

	int a[] = new int[4];
	
	public State() { // start state
		a[1] = 5;
		a[2] = 0;
		a[3] = 0;
	}
	
	public boolean isGoal() { // goal condition
		return a[1] == 4;
	}
	
	@Override
	public String toString() {
		return "("+a[1]+","+a[2]+","+a[3]+")";
	}
}