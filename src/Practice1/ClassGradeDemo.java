package Practice1;

import java.util.HashSet;

public class ClassGradeDemo {
	
	public static void main(String[] args) {
		int arraySize = 7;
		ClassGrade[] grades = new ClassGrade[arraySize];
		grades[0] = new ClassGrade(1, "Calculus", "B2", 15, 85);
		grades[1] = new ClassGrade(2, "Biology", "A5", 12, 92);
		grades[2] = new ClassGrade(3, "Calculus", "B2", 14, 65);
		grades[3] = new ClassGrade(4, "World History", "C4", 14, 70);
		grades[4] = new ClassGrade(5, "Band", "A1", 12, 100);
		grades[5] = new ClassGrade(6, "Calculus", "B2", 9, 73);
		grades[6] = new ClassGrade(7, "Spanish", "A2", 15, 81);
		System.out.println(adjustGradeScore(grades[6], 10));
		System.out.println(grades[6].getGrade());
		ClassGrade[] calculusGrades = getGradesForClass(grades, "calculus");
		for (ClassGrade cg: calculusGrades) {
		System.out.println("Student id:"+cg.getStudentId()+
		" Score: "+cg.getGrade());
		}
		
		
		HashSet<String> even = getClassesInEvenNumberedRoom(grades);
		
		
		System.out.println("\n Even # Rooms \n");
		
		for(String room: even) {
			System.out.println(room);
		}
	}
	
	
	
	
	public static HashSet<String> getClassesInEvenNumberedRoom(ClassGrade[] grades){
		
		HashSet<String> classes = new HashSet<String>();
		
		for(int i = 0; i < grades.length; i++) {
			
			if(Integer.valueOf(grades[i].getRoom().substring(1)) % 2 == 0) {
				
				classes.add(grades[i].getCourseName());
				
			}
			
		}
		
		return classes;
		
		
	}
	
	
	
	public static int adjustGradeScore(ClassGrade sample, int gradeIncrease) {
		
		sample.setGrade(sample.getGrade() + gradeIncrease);
		return sample.getGrade();
		
		
	}
	
	public static ClassGrade[] getGradesForClass(ClassGrade[] classes, String name) {
		
		int count = 0;
		
		for(int i = 0; i < classes.length; i++) {
			
			if(classes[i].getCourseName().equalsIgnoreCase(name)) {
				count++;
			}
			
		}
		
		ClassGrade[] matches = new ClassGrade[count];
		
		int pos = 0;
		
		for(int i = 0; i < classes.length; i++) {
			
			if(classes[i].getCourseName().equalsIgnoreCase(name)) {
				matches[pos] = classes[i];
				pos++;
			}
			
		}
		
		return matches;
		
		
	}

}
