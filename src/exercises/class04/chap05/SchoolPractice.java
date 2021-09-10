package exercises.class04.chap05;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student me = new Student("Matt", 900, 4, 4);
        System.out.println(me + "\n");

        Student notMe = new Student("Jack", 900, 4, 4);
        System.out.println(notMe + "\n");
        System.out.println(me.getName() + " and " + notMe.getName() + " equal?: " + me.equals(notMe) + "\n");

        Student copyOfMe = new Student("maTt", 900, 12, 4);
        System.out.println(copyOfMe + "\n");
        System.out.println(notMe.getName() + " and " + copyOfMe.getName() + " equal?: " + notMe.equals(copyOfMe) + "\n");
        System.out.println(me.getName() + " and " + copyOfMe.getName() + " equal?: " + me.equals(copyOfMe) + "\n");

        me.addGrade(12, 3);
        System.out.println(me);
        me.addGrade(13, 3);
        System.out.println(me);
        me.addGrade(1, 4);
        System.out.println(me);
        me.addGrade(29, 3.5);
        System.out.println(me);
        me.addGrade(1, 2.5);
        System.out.println(me);
        me.addGrade(29, 2.5);
        System.out.println(me);
        me.addGrade(1, 4);
        System.out.println(me);


        Course c1 = new Course(1, "Java 101", 999 );
        System.out.println(c1);

        c1.addStudent(me);
        c1.addStudent(notMe);
        c1.addStudent(copyOfMe);
        System.out.println(c1);


    }
}
