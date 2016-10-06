package Com.CiaranMcGreal.CT417.Assign1;

import java.util.*;

public class Module{

	private String module;
	private String moduleID;
	private ArrayList<Student> students = new ArrayList<Student>();  
	
	public Module(String mod, String modID, ArrayList stud) {
		this.module=mod;
		this.moduleID=modID;
		this.students=stud;
	}
 
	public String getModule() {
		return module;
	}
}