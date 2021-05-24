package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    //  Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString(){
        String courseReport = String.format("These many " + this.enrolledStudents + " are enrolled in " + this.topic +
                " instructed by " + this.instructor);
        return courseReport;
    }

    //Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public boolean equals(Object tobeCompared){
        if (tobeCompared == this){
            return true;
        }
        if(tobeCompared == null){
            return false;
        }
        if(tobeCompared.getClass() != getClass()){
            return false;
        }
        Course newCourse= (Course) tobeCompared;
        return newCourse.enrolledStudents == enrolledStudents;
    }

}
