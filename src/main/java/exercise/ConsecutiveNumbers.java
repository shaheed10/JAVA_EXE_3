package main.java.exercise;


public class ConsecutiveNumbers {
	public static boolean consecutiveCheck(String digits)
	{
		String[] str = digits.split(",");
		for(int i=0;i<str.length-1;i++)
		{
			if(Integer.parseInt(str[i])!=Integer.parseInt(str[i+1])+1 && Integer.parseInt(str[i])!=Integer.parseInt(str[i+1])-1)
				{
				return false;
				}
		}
		return true;
	}
}