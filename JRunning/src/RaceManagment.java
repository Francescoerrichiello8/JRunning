import java.util.ArrayList;

public class RaceManagment
{

	public static void main(String[] args) 
	{
	
		Athlete atleta1 = new Athlete( "Piccolo", "Catso", "Junior", 23.88);
		Athlete atleta2 = new Athlete("Massimo", "Velocissimo", "Senior", 26.99);
		Athlete atleta3 = new Athlete("Fausto", "Vecchioni", "Master", 31.35);
		Athlete atleta4 = new Athlete("Don", "Zomboid", "Master", 12.22);
		Athlete atleta5 = new Athlete("Martina", "Visco", "Senior", 14.54);
		Athlete atleta6 = new Athlete("Dario", "Masellone", "Junior", 18.88);
		
		ArrayList<Athlete> partecipanti1 = new ArrayList<Athlete>();
		partecipanti1.add(atleta1);
		partecipanti1.add(atleta2);
		partecipanti1.add(atleta3);
		
		ArrayList<Athlete> partecipanti2 = new ArrayList<Athlete>();
		partecipanti2.add(atleta4);
		partecipanti2.add(atleta5);
		partecipanti2.add(atleta6);
		
		
		Organizer orga1 = new Organizer("Mario", "Rossi");
		Organizer orga2 = new Organizer("Julio", "Baptista");
		
		Race gara1 = new Race("Sprintino", 10, orga1, partecipanti1);
		Race gara2 = new Race("Ruzzolone in Discesa", 5, orga2, partecipanti2);
		
		double winnerTime1 = 1000;
		String winner1A = null;
		String winner1B = null;
		
		System.out.println("La prima gara di oggi si chiama " + gara1.getName() + ". Gara e organizzazione a cura di " + gara1.getOrganizer().getName() + " " + gara1.getOrganizer().getLastname() + ".");
		System.out.println("I partecipanti attualmente iscritti sono: ");

			for( int i = 0; i < partecipanti1.size(); i++)
			{
				System.out.println(partecipanti1.get(i).getName() + " " + partecipanti1.get(i).getLastname() + ", di Categoria: " + partecipanti1.get(i).getCategory());
				if (winnerTime1 > partecipanti1.get(i).getRecord())
				{
					winnerTime1 = partecipanti1.get(i).getRecord();
					winner1A = partecipanti1.get(i).getName();
					winner1B = partecipanti1.get(i).getLastname();
				}
					
				}
				System.out.println("Il vincitore è " + winner1A + " " + winner1B + " con un tempo di " + winnerTime1 + " secondi! Congratulazioni!");
		
				double winnerTime2 = 1000;
				String winner2A = null;
				String winner2B = null;
				
				System.out.println("La prima gara presentata è " + gara2.getName() + "!" + " Gara e Organizzazione a cura di " + orga2.getName() + " " + orga2.getLastname() + ".");			
				System.out.println("I partecipanti sono: ");
				for( int r = 0; r < partecipanti2.size(); r++)
				{
						System.out.println(partecipanti2.get(r).getName() + " " + partecipanti2.get(r).getLastname() + ", di Categoria: " + partecipanti2.get(r).getCategory());
						if (winnerTime2 > partecipanti2.get(r).getRecord())
						{
							winnerTime2 = partecipanti2.get(r).getRecord();
							winner2A = partecipanti2.get(r).getName();
							winner2B = partecipanti2.get(r).getLastname();
						}						
					}				System.out.println("Il vincitore è " + winner2A + " " + winner2B + " con un tempo di " + winnerTime2 + " secondi! Congratulazioni!");
	}
}
