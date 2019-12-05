package com.jpmc.collection;

public class JobRole {

    String jobId,jobName,payScale;

/*    public JobRole(String jobId, String jobName, String payScale) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.payScale = payScale;
    }*/

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getPayScale() {
        return payScale;
    }

    public void setPayScale(String payScale) {
        this.payScale = payScale;
    }
}
