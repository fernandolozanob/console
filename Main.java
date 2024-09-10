package Fr.Morpion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in)	;
		
		char [] grid = 
			{
				'1','2','3',
				'4','5','6',
				'7','8','9'
				
				
			};
		
		
		
		char p1='O';
		char p2='x';
                String imput; 
		
		

		while (true){
		
		System.out.println("["+ grid[0]+ '|'+ grid[1] + '|'+ grid[2]+ ']');
		System.out.println("["+ grid[3]+ '|'+ grid[4] + '|'+ grid[5]+ ']');
		System.out.println("["+ grid[6]+ '|'+ grid[7] + '|'+ grid[8]+ ']');
		
		
		//demande de la casse à jouer 
		
		while(true){
		System.out.println("saisir la casse");
		imput=sc.nextLine();
		int c ; 
		try
		{
			c=Integer.parseInt(imput);
			if(1<= c && c <= 9)
			break; 
		}catch(Exception e){
			
		}
		}
		
		//placer le jeton du jouador de la casse 
		
		
		
		
		//verifier si le juador a gagné
		//changer le jouer 
		}

	}

}
