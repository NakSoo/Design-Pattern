package homework1;

public class Plan {
	private String workDate;
	private String workingPeriod;
	private Worker worker;
	private Job job;
	
	public Plan(String workDate, String workingPeriod, Worker worker, Job job) {
		this.workDate = workDate;
		this.workingPeriod = workingPeriod;
		this.worker = worker;
		this.job = job;
	}
	
	public String getWorkDate() {
		return workDate;
	}
	
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	
	public String getWorkingPeriod() {
		return workingPeriod;
	}
	
	public void setWorkingPeriod(String workingPeriod) {
		this.workingPeriod = workingPeriod;
	}
	
	public Worker getWorker() {
		return worker;
	}
	
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	
	public Job getJob() {
		return job;
	}
	
	public void setJob(Job job) {
		this.job = job;
	}
}