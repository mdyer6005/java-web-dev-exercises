package exercises.class06.chap07.technology;

public class Laptop extends Computer {
    private boolean hasWebcam;

    public boolean getHasWebcam() {
        return this.hasWebcam;
    }

    public void setHasWebcam(boolean hasWebcam) {
        this.hasWebcam = hasWebcam;
    }

    public Laptop(int ram, int storage, boolean hasWebcam) {
        super(ram, storage, true);
        this.setHasWebcam(hasWebcam);
    }

    public void removeWebcam() {
        if (this.getHasWebcam()) {
            this.setHasWebcam(false);
        } else {
            System.out.println("Laptop does not have a webcam to remove");
        }
    }
}
