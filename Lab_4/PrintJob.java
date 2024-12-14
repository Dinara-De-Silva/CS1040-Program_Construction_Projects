package paper23;

public class PrintJob {
    private int jobID;

    public PrintJob(int jobID) throws TypeNotSupportedException{
        this.jobID = jobID;
    }

    public int getJobID() {
        return jobID;
    }
}
