/*//SubhamChaudharyTharu-32100450
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scms.model;

/**
 *
 * @author sumitchaudhary
 */
public class Course {
    public String courseId;
    public String courseName;
    private int credits;
    public String program;
    
    public Course( String courseId, String courseName, int credits, String program){
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.program = program;
    }
    
    public int getcredits(){
        return credits;
    }
    
    public void setcredits(int credits){
        this.credits = credits;
    }
    
    
    public String toString(){
       return(" Course [ ID = " + courseId + ", Name = " + courseName +
                ", Credits = " + credits + ", Program = " + program + "]");
    }
    
}
