/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scms.model;

/**
 *
 * @author sumitchaudhary
 */
public class Student {
    int studentID;
    String name;
    private int age;
    String major;
    int semester;
    protected double percentageOfMarks;
    protected double attendancePercentage;
    
    public Student (int studentID,String name, int age,String major,int semester,double percentageOfMarks,
     double attendancePercentage){
        this.studentID = studentID;
        this.age = age;
        this.name = name;
        this.major = major;
        this.semester = semester;
        this.attendancePercentage = attendancePercentage;
        this.percentageOfMarks = percentageOfMarks;
        
    }
    public double getpercentageOfMarks(){
        return percentageOfMarks;
    }
    public void setpercentageOfMarks(double percentageOfMarks){
        this.percentageOfMarks = percentageOfMarks;
    }
    public String toString(){
        return "Student [ ID = " + studentID +",Name = " + name + ",Major = " + 
                major + ",Semester = " + semester + ",AttendancePercentage = " + 
                attendancePercentage + ",PercentageOfMarks = " + percentageOfMarks + "]";
    }
    
    
}