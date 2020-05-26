
package hu.unideb.inf.jars;
import java.util.HashSet;

public class Operator {

	int i, j;
	
	public Operator(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	static HashSet<Operator> OPERATORS = new HashSet<Operator>();
	static {
		for (int i=1; i<=3; i++)
			for (int j=1; j<=3; j++)
				if ( i!=j )
					OPERATORS.add( new Operator(i, j));
	}
	
	static int max[] = {0, 5, 3, 2};
	
	public boolean isApplicable(State state) {
		int a[] = state.a;
		return a[i] != 0 && a[j] != max[j];
	}
	
	public State apply(State state) {
		int a[] = state.a;
		State newState = new State();
		int b[] = newState.a;
		int m = Math.min(a[i], max[j]-a[j]);
		for (int k=1; k<=3; k++) 
			if ( k==j )
				b[k] = a[k] + m;
			else if ( k==i )
				b[k] = a[k] - m;
			else
				b[k] = a[k];
		return newState;
	}
	
}