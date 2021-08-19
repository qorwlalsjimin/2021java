import java.util.Scanner;

public class Score_1104_1{
	public static void main( String agrs[]){

	Scanner scan = new Scanner(System.in);

	String ch = "가을";
	switch(ch){
		case "봄":
		case "여름": System.out.println("A"); break;
		case "가을": System.out.println("B"); break;
		case "겨울": System.out.println("C"); break;

	}

	switch(ch){
		case 'A':
		case 'B': System.out.println("A"); break;
		case 'C': System.out.println("B"); break;
		case 'D': System.out.println("C"); break;

	}



	/*
	if(average>=90) System.out.println("A");
	else	if(average>=80) System.out.println("B");
		else	if(average>=70) System.out.println("C");
			else	if(average>=60) System.out.println("D");
				else	System.out.println("E");
	*/
	
	}
}