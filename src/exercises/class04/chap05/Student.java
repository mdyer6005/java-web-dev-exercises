package exercises.class04.chap05;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName() {
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int aStudentId) {
        this.studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        this.numberOfCredits = aNumberOfCredits;
    }

    public double getGpa() {
        return this.gpa;
    }

    void setGpa(double aGpa) {
        this.gpa = aGpa;
    }

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId, 0, 0);
        Student.incrementNextId();
    }

    public String getGradeLevel() {
        int credits = this.numberOfCredits;
        if (this.numberOfCredits >= 90) {
            return "Senior";
        } else if (this.numberOfCredits >= 60) {
            return "Junior";
        } else if (this.numberOfCredits >= 30) {
            return "Sophomore";
        } else {
            return "Freshman";
        }
    }

    public void addGrade(int creditsToAdd, double qualityScoreToAdd) {
        double newQualityScore = getQualityScore() + calculateQualityScore(creditsToAdd, qualityScoreToAdd);
        this.setNumberOfCredits(this.getNumberOfCredits() + creditsToAdd);
        this.setGpa(newQualityScore / this.getNumberOfCredits());
    }

    private double getQualityScore() {
        return this.gpa * numberOfCredits;
    }

    private double calculateQualityScore(int credits, double qualityScore) {
        return credits * qualityScore;
    }

    private static void incrementNextId() {
        nextStudentId ++;
    }

    public String toString() {
        return "Name:\t\t\t" + this.getName() + "\nId:\t\t\t\t" + this.getStudentId() + "\nCredits:\t\t" +
                this.getNumberOfCredits() + "\nGPA:\t\t\t" + this.getGpa() + "\nGrade Level:\t" +
                this.getGradeLevel() + "\n";
    }

    public boolean equals(Object objectToCompare) {
        if (this == objectToCompare) {
            return true;
        } else if (objectToCompare == null) {
            return false;
        } else if (!(objectToCompare.getClass() == this.getClass())) {
            return false;
        }
        Student studentToCompare = (Student) objectToCompare;
        if (this.getName().toLowerCase().equals(studentToCompare.getName().toLowerCase()) && this.getStudentId() == studentToCompare.getStudentId()){
            return true;
        }
        return false;
    }


}