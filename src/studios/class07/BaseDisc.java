package studios.class07;

public abstract class BaseDisc {
    private int capacity;
    private  int id;
    private String title;
    private String publisher;
    private boolean writable;
    private int speed;


    public int getCapacity() {
        return this.capacity;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int discId) {
        this.id = discId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String discTitle) {
        this.title = title;
    }

    public boolean isWritable() {
        return this.writable;
    }

    public void setWritable(boolean isWritable) {
        this.writable = isWritable;
    }

    public int getSpeed() {
        return speed;
    }

    public BaseDisc(int discCapacity, int discId, String discTitle, int spinSpeed, boolean writableDisc) {
        this.capacity = discCapacity;
        this.id = discId;
        this.title = discTitle;
        this.speed = spinSpeed;
        this.writable = writableDisc;
    }
}
