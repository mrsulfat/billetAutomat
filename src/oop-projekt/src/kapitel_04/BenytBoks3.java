package kapitel_04;
public class BenytBoks3
{
	public static void main(String[] arg)
	{
            
          
		Boks3 enBoks = new Boks3();             // brug konstruktøren uden parametre
		System.out.println("Volumen er: "+ enBoks.volumen());

		Boks3 enAndenBoks = new Boks3(5, 5, 10);  // brug den anden konstruktør
		System.out.println("Volumen er: "+ enAndenBoks.volumen());
                
                Boks3 enTredjeBoks = new Boks3(5, 5, 5, 1);
                System.out.println("Vægten er: " + enTredjeBoks.vægt());
                        
	}
}