package com.techelevator;

public class HomeworkAssignment {
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	
	public HomeworkAssignment(int possibleMarks, String submitterName) {
		this.possibleMarks = possibleMarks;
		this.submitterName = submitterName;
	}
	
	public int getEarnedMarks() {
		return earnedMarks;
	}
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public String getLetterGrade() {
		double percent = (double) earnedMarks/possibleMarks * 100;
		
		if (percent >=90.0) {
			 letterGrade = "A";	
		}
		else if  (percent <= 89.0 && percent >=80.0) {
			 letterGrade = "B";			
		}	
		else if  (percent <= 79.0 && percent >=70.0) {
			 letterGrade = "C";			
		}
		else if  (percent <= 69.0 && percent >=60.0) {
			 letterGrade = "D";			
		}
		else {
			 letterGrade = "F";		
		}
			return letterGrade;
		}	
		}

	
	


