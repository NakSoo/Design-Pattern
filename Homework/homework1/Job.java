package homework1;

import java.util.Vector;

public class Job {
	private Vector<Plan> plans;
	private String name;
	
	public Job(String name) {
		this.name = name;
		plans = new Vector<Plan>();
	}
	
	public void addPlan(Plan plan) {
		plans.add(plan);
	}

	public String getName() {
		return name;
	}
}