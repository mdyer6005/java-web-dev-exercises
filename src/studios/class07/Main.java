package studios.class07;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD c = new CD(99, "Blade Soundtrack", "Various", 12, false);
        DVD d = new DVD(12, "Blade", "Who Knows", "R", false );


        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println();
        c.spinDisc();
        c.reportSpeed();
        c.readData();
        c.writeData();
        System.out.println(c.getCapacity() + "MB");
        System.out.println();
        d.spinDisc();
        d.reportSpeed();
        d.readData();
        d.writeData();
        System.out.println(d.getCapacity() + "MB");
    }
}