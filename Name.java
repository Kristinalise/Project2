package for_birthday_database;

import java.io.Serializable;

public class Name implements Serializable{
	

	private String first;
	private String middle; 
	private String last;
	
	
	public Name(String theFirst, String theMiddle, String theLast) {
		first = theFirst;
		middle = theMiddle;
		last = theLast;
	}
	
	public Name(String theFirst, String theLast) {
		first = theFirst;
		middle = "";
		last = theLast;
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getMiddle() {
		return middle;
	}
	
	public String getLast() {
		return last;
	}
	
	public void setFirst(String theNewFirst) {
		first = theNewFirst;
	}
	
	
	public void setMiddle(String theNewMiddle) {
		middle = theNewMiddle;
	}
	
	public void setLast(String theNewLast) {
		last = theNewLast;
	}
	
	public String toString() {
		if(middle.isEmpty()) {
			return first + " " + last;
		}else {
			return first + " " + middle + " " + last;
		}
	}
	
	

}