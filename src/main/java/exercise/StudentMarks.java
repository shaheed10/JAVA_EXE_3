package main.java.exercise;


public class StudentMarks {
	public static String[] checkmarks(int []grade) {
		int i=0,lencheck=grade.length;
		String[] gradeStatus = new String[lencheck];
		for(int f:grade) {
			if(f<0||f>100)
			{
				gradeStatus[i]="False";
			}
			else {
				gradeStatus[i]="True";
			}
			i++;
		}
		
		return gradeStatus;
		
		
	}

}
