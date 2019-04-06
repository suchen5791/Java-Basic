package AccessModifiers1;

/* Java provides a number of access modifiers to set access levels for
 * classes,
 * variables,
 * methods,
 * and constructors
 * 
 * The four are: 
 * Default -- only available in the package
 * Public -- available every where
 * Private -- available to class only MOST RESTRICTIVE
 * Protected -- available to package  & all subclasses
 *  
 */

public class ClassTemplate { // only public or default -- public is the most common
	
	int day = 1; //visible to package only -- (default) -- no modifiers needed
	public int week = 7; //visible to WORLD (public)
	protected int month = 31; //visible to the package and all subclasses (protected)
	private int year = 365; //visible to the class only (private) MOST RESTRICTIVE
	
	public int printWeek () { //methods use all four but PUBLIC most common
		
		return week + day + month + year;
	}

}
