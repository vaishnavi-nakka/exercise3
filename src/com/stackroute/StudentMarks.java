package com.stackroute;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class InvalidGradesException extends Exception{
	
}

public class StudentMarks {
    public int numOfStudents;
    
	public static void main(String[] args) {
		try{
			BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
			StudentMarks studentMarks = new StudentMarks();
			studentMarks.numOfStudents=Integer.parseInt(scan.readLine());
			int[] stuGrades=new int[studentMarks.numOfStudents];
			for(int i=0;i<studentMarks.numOfStudents;i++){
				stuGrades[i]=Integer.parseInt(scan.readLine());
				if(stuGrades[i] <= 0 || stuGrades[i] >= 100){
					InvalidGradesException ob = new InvalidGradesException();
					throw ob;
				}
			}
			
		}
		
		catch(InvalidGradesException e){
			System.out.println("no should be between 0 and 100");
		}
		catch(Exception e){
			System.out.println("Invalid Input");
		}
		
	}

}
