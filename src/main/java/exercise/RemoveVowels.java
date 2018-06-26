package main.java.exercise;



public class RemoveVowels {
	public static String[] removevw(String [] exe) {
		String [] places1 = new String[exe.length];
		
for (int i = 0; i < exe.length; i++) {
    places1[i] = exe[i].replaceAll("[aeiouAEIOU]","");
//    System.out.println(places1[i]);
    }
  return places1;
	
	}
}
	
	
	

