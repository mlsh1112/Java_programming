
public class misPointX extends Exception {

	public String toString() {
		return "Error: x-coordinate of upper left vertex should be less than x-coordinate of lower right vertex.\r\n" + 
				"Please enter valid coordinates.\r\n";
	}

}
