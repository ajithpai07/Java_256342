import java.util.*;
class Innings{
	private String teamname;
	private String inningsname;
	private int runs;

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public void setInningsname(String inningsname) {
		this.inningsname = inningsname;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public String getTeamname() {
		return teamname;
	}

	public String getInningsname() {
		return inningsname;
	}

	public int getRuns() {
		return runs;
	}


	public  void displayInningsDetails() {
		 System.out.println("Name: " + teamname);
		 String strn = inningsname;
		 String first = "First";
		 int r = runs;
		 System.out.println("Scored: "+ r);
		 if(strn.equals(first)){
			 System.out.print("Need ");
			 System.out.print((r+1));
			 System.out.println(" to win"); 
		 }else{
			 System.out.println("Match Ended");
		 }		
	}
}

public class InningsMain {
	public static void main(String[] args) {
		Innings i = new Innings();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the team name:");
		String teamName = sc.nextLine();
		i.setTeamname(teamName);
		System.out.println("Enter session:");
		String session = sc.nextLine();
		i.setInningsname(session);
		System.out.println("Enter runs:");
		int runs = sc.nextInt();
		i.setRuns(runs);
		i.displayInningsDetails();
	    sc.close();
	}
}