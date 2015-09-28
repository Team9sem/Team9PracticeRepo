

/**
 * TEAM 9 SEM
 * PRACTICE REPO
 */
 
 public class TeamNine{
 
 
 	
	
	public static void main(String[] args){
		
		// Strings to hold names
		String pontus, nima, filip, geraldin, olle, alemeseged;
		// insert your name in corresponding variable
		pontus = "pontus";
		nima = "";
		filip= "";
		geraldin = "";
		olle = "";
		alemeseged = ""; 
		
		
		
		// Array for member names
		String[] members = new String[6];
		members[0] = pontus;
		members[1] = nima;
		members[2] = filip;	
		members[3] = geraldin;
		members[4] = olle;
		members[5] = alemeseged;	
		
		System.out.println("\nTeam 9 Consists of the following members:\n");
		
		// Enhanced version of for Loop, check out online!
		for(String member : members){
			System.out.println(member);
			
			
		}
		System.out.println("\nGoodBye!\n");
	
	
	}
 
 
 }
 