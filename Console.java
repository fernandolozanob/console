package monTravail;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Console {
	//Buffer
	private static BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));

	public static int saisirInt () //nextInt
	{
		int nb = 0;
		String chaine ="";
		boolean ok;
		do{
			ok = false;
			
			
		try{
			chaine = entree.readLine();
			nb = Integer.parseInt(chaine);
			ok= true;
			}
		catch (IOException exp)
		{
			System.out.println("Lecture impossible sur le clavier");
		}
		catch (NumberFormatException exp)
		{
			System.out.println("Format du nombre non respect� !");
		}
		}while (ok == false);
		
		return nb;
	}
	
	public static float saisirFloat () //nextFloat
	{
		float nb = 0;
		String chaine ="";
		boolean ok;
		do{
			ok = false;
			
			
		try{
			chaine = entree.readLine();
			nb = Float.parseFloat(chaine);
			ok= true;
			}
		catch (IOException exp)
		{
			System.out.println("Lecture impossible sur le clavier");
		}
		catch (NumberFormatException exp)
		{
			System.out.println("Format du nombre non respect� !");
		}
		}while (ok == false);
		
		return nb;
	}
	
	public static String saisirString()
	{
		String chaine="";
		try{
			chaine = entree.readLine();
			}
		catch (IOException exp)
		{
			System.out.println("Lecture impossible sur le clavier");
		}
		return chaine;
	}
	
	public static char saisirChar()
	{
		String chaine ="";
		try{
			chaine = entree.readLine();
		}
		catch(IOException exp)
		{
			System.out.println("Lecture impossible sur le clavier");
		}
	return chaine.charAt(0);
	}
	

}
