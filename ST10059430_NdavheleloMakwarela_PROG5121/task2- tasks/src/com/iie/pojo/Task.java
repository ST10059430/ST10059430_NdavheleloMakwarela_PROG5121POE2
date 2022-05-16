package com.iie.pojo;

public class Task {
    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private DeveloperDetails developerDetails;
    private int taskDuration;
    private String taskId;
    private String taskStatus;


    public void setTaskName(String taskName){
        this.taskName = taskName;
    }
    public String getTaskName(){
        return this.taskName;
    }
    public void setTaskNumber(int taskNumber){
        this.taskNumber = taskNumber;
    }
    public int getTaskNumber(){
        return this.taskNumber;
    }
    public void setTaskDescription(String taskDescription){
        this.taskDescription = taskDescription;
    }

    public String getTaskDescription() {
        return this.taskDescription;
    }
    public void setDeveloperDetails(DeveloperDetails developerDetails){
        this.developerDetails = developerDetails;
    }
    public DeveloperDetails getDeveloperDetails(){
        return this.developerDetails;
    }
    public void setTaskDuration(int taskDuration){
        this.taskDuration = taskDuration;
    }
    public int getTaskDuration(){
        return this.taskDuration;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
    public String getTaskId(){
        return this.taskId;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskStatus() {
        return this.taskStatus;
    }

    @Override
    public String toString() {
        return "taskName='" + taskName + '\'' +
                "\ntaskNumber=" + taskNumber +
                "\ntaskDescription='" + taskDescription + '\'' +
                "\ndeveloperDetails=" + developerDetails.getFirstName() + " " + developerDetails.getLastName() +
                "\ntaskDuration=" + taskDuration +
                "\ntaskId='" + taskId + '\'' +
                "\ntaskStatus='" + taskStatus + '\'';
    }
}
