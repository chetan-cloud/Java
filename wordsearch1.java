package Assignments;
import java.util.*;
public class wordsearch1 {

	public static void main(String[] args) 
	{
		int t = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 10");
		int length = input.nextInt();
		String [] words = new String[length];
		for (int i = 0; i < length; i++)
		{
			System.out.println("Please enter the next word, then press enter.");
			words[i] = input.next();
		}
		System.out.println("Enter the word you would like to search for");
		String searched = input.next();
		
		for (int i = 0; i < words.length; i++)
		{
			if (words[i].contains(searched))
			{
				t++;
				
			}
		}
		if (t > 0)
		{
			for (int i=0; i < words.length; i++)
			{
				System.out.println(words[i]);
			}
			System.out.println(searched);
			System.out.println(searched + " exists in the Array");
			System.out.println(searched + " was found in the array " + t + " times.");
		}
		else 
		{
			for (int i=0; i < words.length; i++)
			{
				System.out.println(words[i]);
			}
			System.out.println(searched);
			System.out.println(searched + " does not exist in the Array");
		}
		input.close();

		}
		

	}


