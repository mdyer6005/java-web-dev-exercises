package exercises.class06.chap07.technology;

public abstract class Computer extends AbstractEntity{
    private int ram;
    private int driveSpace;
    private boolean hasKeyboard;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDriveSpace() {
        return driveSpace;
    }

    public void setDriveSpace(int driveSpace) {
        this.driveSpace = driveSpace;
    }

    public boolean getHasKeyboard() {
        return this.hasKeyboard;
    }

    public void setHasKeyboard(boolean hasKeyboard) {
        this.hasKeyboard = hasKeyboard;
    }

    public Computer(int ram, int driveSpace, boolean hasKeyboard) {
        super();
        this.setRam(ram);
        this.setDriveSpace(driveSpace);
        this.setHasKeyboard(hasKeyboard);
    }

    public void increaseRam(int increaseBy) {
        this.setRam(this.getRam() + increaseBy);
    }

    public void increaseDriveSpace(int increaseBy) {
        this.setDriveSpace(this.getDriveSpace() + increaseBy);
    }

}
