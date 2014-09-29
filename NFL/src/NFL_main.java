import java.util.Scanner;

public class NFL_main {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double comPct, ypa, td, inter, qbr, att;
	
		System.out.println("How many attempts were made?");
		att = in.nextDouble();
		System.out.println("How many attempts were completed?");
		comPct = ((in.nextDouble()/att) -.3) * 5;
		System.out.println("How many yards were thrown?");
		ypa = ((in.nextDouble()/att) - 3) * .25;
		System.out.println("How many touchdowns were thrown?");
		td = ((in.nextDouble() /att) * 20);
		System.out.println("How many interceptions were thrown?");
		inter = (2.375 - ((in.nextDouble() /att)* 25));
		
		in.close();
		
		qbr = ((Math.max(0, Math.min(comPct, 2.375)) + Math.max(0, Math.min(ypa, 2.375))
				+ Math.max(0, Math.min(td, 2.375)) + Math.max(0, Math.min(inter, 2.375))) / 6) * 100;
		
		System.out.print("Your QBR is " + qbr);
	}
}
