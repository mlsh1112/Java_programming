
public class misPointY extends Exception {

	public String toStirng() {
		return "Error: y-coordinate of upper left vertex should be less than y-coordinate of lower right vertex.\r\n" + 
				"Please enter valid coordinates\r\n";
	}
}
