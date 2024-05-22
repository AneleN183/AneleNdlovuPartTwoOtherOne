/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task;

import javax.swing.JOptionPane;


public class Task {
    public String taskName;
    public int taskNumber;
    public String taskDescription;
    public int taskDuration;
    public String taskStatus;
    public int total;
    
    public Task(){
        this.total = 0;
    }
    public String getTaskName() {
        return this.taskName;
    }
    public String setTaskName( String taskName) {
        this.taskName = taskName; 
    }
    public int getTaskNumber  (){
        return this.taskNumber; 
   
    }
    public void setTaskNumber (int taskNumber){
        this.taskNumber = taskNumber;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }    
    public void setTaskDescription (String taskDescription) {
        this.taskDescription = taskDescription; 
        
    }
    public String getDeveloperDetails(){
        return this.Developerdetails; 
    }
    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails; 
    }
    public int getTaskDuration (){
        return this.taskDuration;
    }
    public void setTaskduration (int taskduration){ 
        this.taskDuration = taskDuration; 
    }
    public String getTaskStatus () {
        return this.taskStatus;
    }
    public void setTaskStatus(final String taskStatus){
        this.taskStatus = taskStatus;
    }
    public int getTotal (){ 
        return this.total;
    }
    public String checkTaskDescription(String taskDescription){
        int description = taskDescription.length();
        String output = "";
        if (description <-50){
            output = "Task successfully captured";
        }
        else{
            output = "Please enter a task description of less than 50 characters";
        }
        return output;
    }
    public String createTaskID (String taskName, int taskNumber,String developer){
        String firstName = developer.substring(0, developer.indexOf(" "));
        String taskId = taskName.substring(0, 2).toUpperCase()+ " " + firstName.substring(taskNumber);
                
       return taskId;         
    }
    
    public int returnTotalHours(int numTasks, int taskDuration){
        int count = 0; 
        
        if (count < numTasks){
            this.total = taskDuration;
        }
        return this.total; 
    }
    
    public int returnTotalHours( int numTasks, int taskDuration){ 
        int count = 0;
        
        if (count < numTasks){ 
            this.total = taskDuration;
        }
        return this.total;
    }
    public String printTaskDetails (String taskID){
        String output = "Task Details: " + "/n" + "Task status:  " + getTaskStatus() + "/n" + "Developer Details:  "+ "Task Name:  " + getTaskName()+ "/n"+ "Task Description:  + getTaskDescription()"
                + "/n" + "Task ID: "+ taskID + "/n" + "Task Duration:" + getTaskDuration();
        return output; 
    }
    public void display(){
        JOptionPane.showMessageDialog(null, "Total hours for all tasks:" + this.total);
    }
    

   
    
    public static void main(String[] args) {
       
    }
    
}
