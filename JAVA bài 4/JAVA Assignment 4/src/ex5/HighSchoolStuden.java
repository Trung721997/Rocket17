package ex5;

public class HighSchoolStuden extends Student {
	private String clazz;
	private String desiredUniversity;

	public String getClazz() {
		return clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getDesiredUniversity() {
		return desiredUniversity;
	}

	public void setDesiredUniversity(String desiredUniversity) {
		this.desiredUniversity = desiredUniversity;
	}

	public HighSchoolStuden(String name, int id, String clazz, String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}

	@Override
	public String toString() {
		return super.toString() + "Class: " + clazz + "\n" 
		+ "Desired University: " + desiredUniversity;
	}
}
