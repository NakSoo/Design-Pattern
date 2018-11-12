package homework1;

import java.util.Vector;

public class Main {
	public static void main(String [] args) {
		Worker w1 = new Worker("Naksoo");
		Worker w2 = new Worker("Chung");
		Worker w3 = new Worker("SangEun");
		
		Job j1 = new Job("AI Project");
		Job j2 = new Job("Game Project");
		Job j3 = new Job("Pattern Design Project");
		Job j4 = new Job("Network Project");
		
		Plan p1 = new Plan("30","18/12/20", w1, j1 );
		Plan p2 = new Plan("30", "18/12/20",w3, j1 );
		
		Plan p3 = new Plan("60", "18/12/31", w2, j2);
		Plan p4 = new Plan("60", "18/12/31", w3, j2);
		
		Plan p5 = new Plan("50", "18/12/25", w1, j3);
		Plan p6 = new Plan("50", "18/12/25", w2, j3);
		Plan p7 = new Plan("50", "18/12/25", w3, j3);
		
		Plan p8 = new Plan("40", "18/12/01", w2, j4);
		
		w1.addPlan(p1);
		w1.addPlan(p5);
		j1.addPlan(p1);
		j1.addPlan(p5);
		
		w2.addPlan(p2);
		w2.addPlan(p6);
		w2.addPlan(p8);
		j2.addPlan(p2);
		j2.addPlan(p6);
		j2.addPlan(p8);
		
		w3.addPlan(p2);
		w3.addPlan(p4);
		w3.addPlan(p7);
		j3.addPlan(p2);
		j3.addPlan(p4);
		j3.addPlan(p7);
		
		System.out.println(">>"+ w1.getName() + "'s job");
		Vector<Job> plans1 = w1.getPlans();
		for(Job p : plans1) {
			System.out.println(p.getName());
		}
		
		System.out.println(">>"+ w2.getName() + "'s job");
		Vector<Job> plans2 = w2.getPlans();
		for(Job p : plans2) {
			System.out.println(p.getName());
		}
		
		System.out.println(">>"+ w3.getName() + "'s job");
		Vector<Job> plans3 = w3.getPlans();
		for(Job p : plans3) {
			System.out.println(p.getName());
		}
	}
}
