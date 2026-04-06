/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scms.model;

/**
 *
 * @author sumitchaudhary
 */
public class UnderGraduate extends Student {
    public String program;
    public int duration;
    public String adminName;
    private int contactNo;
    
    public UnderGraduate(int studentID, String name, int age, String major, int semester, double percentageOfMarks,
     double attendancePercentage, String program, int duration, String adminName, int contactNo){
        super(studentID, name, age, major, semester, percentageOfMarks, attendancePercentage);
        this.program = program;
        this.duration = duration;
        this.adminName = adminName;
        this.contactNo = contactNo;
    }
    
    public int getcontactNo(){
        return contactNo;
    }
    
    public void setcontactNo(int contactNo){
        this.contactNo = contactNo;
    }
   
    
    public String toString(){
        return " Graduate Student [ ID = " + studentID +",Name = " + name + ",Major = " + 
                major + ",Semester = " + semester + ",AttendancePercentage = " + 
                attendancePercentage + ",PercentageOfMarks = " + percentageOfMarks + ",Progam = "
                + program + ",Duration = " + duration + ",AdminName = " + adminName + "ContactNo = " 
                + contactNo + "]";
    }
    
    
}
