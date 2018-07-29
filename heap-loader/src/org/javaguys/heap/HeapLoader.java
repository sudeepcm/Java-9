package org.javaguys.heap;

import java.util.ArrayList;
import java.util.List;

import org.javaguys.heap.entity.School;
import org.javaguys.heap.entity.Student;

public class HeapLoader {
	
	private static List<School> schools = new ArrayList<>();
	
	/**
	 * School count and student count can be passed as command line arguments
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		/**
		 * No of schools
		 */
		int schoolCount = 10;
		/**
		 * No of students per school
		 */
		int studentCount = 10;
		
		if(args.length == 2) {
			schoolCount = Integer.valueOf(args[0]);
			studentCount = Integer.valueOf(args[1]);
		}
		
		System.out.println("Data Loading Started ........");
		for(int i=0;i<schoolCount;i++) {
			School school = new School("School"+(i+1),"KERALA","INDIA");
			for(int j=0;j<studentCount;j++) {
				Student student = new Student("Student" + (j+1), 10, "ENGLISH");
				school.addStudent(student);
			}
			schools.add(school);
		}
		System.out.println("Data Loading Completed ........");
		while(true){
			System.out.println("Wating for exit!!");
			Thread.sleep(60000);			
		}
	}

}
