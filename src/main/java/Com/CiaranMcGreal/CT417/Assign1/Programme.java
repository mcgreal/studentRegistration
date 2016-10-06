package Com.CiaranMcGreal.CT417.Assign1;

import org.joda.time.DateTime;

import java.util.*;

public class Programme {

	private String courseName;
	private List<Module> modules = new ArrayList<Module>();
	private DateTime startDate;
	private DateTime endDate;
	
	public Programme(String course, ArrayList mod, DateTime start, DateTime end) {
		this.courseName=course;
		this.modules=mod;
		this.startDate=start;
		this.endDate=end;
	}

	public String getCourseName() {
		return courseName;
	}
}