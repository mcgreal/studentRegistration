package Com.CiaranMcGreal.CT417.Assign1;

public class Student {

	String studName;
	String studAge;
	String studDOB;
	String studID;
	static String studUsername;
	
	public Student(String name, String age, String dob, String id) {
	    this.studName=name;
		studAge=age;
		studDOB=dob;
		studID=id;
	}

	public String getStudName() {
		return studName;
	}
	
	public static String getUsername(String name, String age) {
		studUsername = name+age;
		return studUsername;
	}
}