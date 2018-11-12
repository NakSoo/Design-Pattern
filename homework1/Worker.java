package homework1;

import java.util.Vector;

public class Worker {
	private Vector<Plan> plans;
	private String name;
	
	public Worker(String name) {
		this.name = name;
		plans = new Vector<Plan>();
	}
	
	public void addPlan(Plan plan) {
		plans.add(plan);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Vector<Job> getPlans() {
		Vector<Job> myPlans = new Vector<Job>();
		
		for(Plan p : plans) {
			myPlans.add(p.getJob());
		}	
		return myPlans;
	}	 
}
