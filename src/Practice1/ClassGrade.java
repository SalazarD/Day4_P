package Practice1;

public class ClassGrade {
	
	private int classId;
	private String courseName;
	private String room;
	private int studentId;
	private int grade;
	
	public ClassGrade(int classId, String courseName, String room, int studentId, int grade) {
		
		this.classId = classId;
		this.courseName = courseName;
		this.room = room;
		this.studentId = studentId;
		this.grade = grade;
		
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
