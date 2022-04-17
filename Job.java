package mm;

public class Job {
	private int jobId;
	private String jobTitle;
	private String jobDescription;
	private String jobType;
	private int budget;
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	Job(int jobId, String jobTitle, String jobDescription, String jobType, int budget) {
		super();
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.jobType = jobType;
		this.budget = budget;
	}
	private Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Job [jobId=" + jobId +"      "+ ", jobTitle=" + jobTitle +"                 "+ ", jobDescription=" + jobDescription +"                "+ ", jobType="
				+ jobType +"            "+ ", budget=" + budget + "]";
	}
}
