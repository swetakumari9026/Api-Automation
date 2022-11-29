package model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude
public class UserCreate {
    String name;
    String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
