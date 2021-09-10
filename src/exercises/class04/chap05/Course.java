package exercises.class04.chap05;

import java.util.ArrayList;

public class Course {
    private int courseId;
    private String courseDescription;
    private int section;
    private ArrayList<Student> enrolledStudents;

    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int aCourseId) {
        this.courseId = aCourseId;
    }

    public String getCourseDescription() {
        return this.courseDescription;
    }

    public void setCourseDescription(String aCourseDescription) {
        this.courseDescription = aCourseDescription;
    }

    public int getSection() {
        return this.section;
    }

    public void setSection(int aSection) {
        this.section = aSection;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return this.enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> aEnrolledStudents) {
        this.enrolledStudents = aEnrolledStudents;
    }

    public Course(int courseId, String courseDescription, int section, ArrayList<Student> enrolledStudents) {
        this.setCourseId(courseId);
        this.setCourseDescription(courseDescription);
        this.setSection(section);
        this.setEnrolledStudents(enrolledStudents);
    }

    public Course(int courseId, String courseDescription, int section) {
        this(courseId, courseDescription, section, new ArrayList<Student>());
    }

    public void addStudent(Student studentToAdd) {
        this.enrolledStudents.add(studentToAdd);
    }



    public String toString() {
        StringBuilder returnString = new StringBuilder("\nCourse Id:\t\t" + this.getCourseId() +
                "\nDescription:\t" + this.courseDescription + "\nSection:\t\t" + this.getSection() +
                "\nStudents Enrolled:\n------------------");

        if (this.enrolledStudents.size() >= 1) {
            for (Student student : this.enrolledStudents) {
                returnString.append("\n").append(student.toString());
            }
        } else {
            returnString.append("\nThere are no students enrolled");
        }
        return returnString.toString();
    }

    public boolean equals(Object objectToCompare) {
        if (this == objectToCompare) {
            return true;
        } else if (objectToCompare == null) {
            return false;
        } else if (!(objectToCompare.getClass() == this.getClass())) {
            return false;
        }
        Course courseToCompare = (Course) objectToCompare;
        if (this.getCourseId() == courseToCompare.getCourseId() && this.getSection() == courseToCompare.getCourseId()) {
            return true;
        }
        return false;
    }
}