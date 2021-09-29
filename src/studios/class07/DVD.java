package studios.class07;

public class DVD extends BaseDisc implements OpticalDisc {
    private String director;
    private String rating;


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private static final int dvdCapacityMB = 4700;
    private static final int dvdSpeed = 1600;

    //public BaseDisc(int discCapacity, int discId, String discTitle, int spinSpeed, boolean writableDisc)
    public DVD(int discId, String discTitle, String movieDirector, String movieRating, boolean writeableDisc ) {
        super(dvdCapacityMB, discId, discTitle, dvdSpeed, writeableDisc);
        this.director = movieDirector;
        this.rating = movieRating;
    }

    @Override
    public void spinDisc() {
        System.out.println("Spinning a DVD");
    }

    @Override
    public void writeData() {
        if (this.isWritable()) {
            System.out.println("Writing a CD");
        } else {
            System.out.println("Disc not writeable");
        }
    }

    @Override
    public void readData() {
        System.out.println("Reading a DVD");
    }

    @Override
    public void reportSpeed() {
        System.out.println(String.format("DVDs spin at %d RPM",this.getSpeed()));
    }
}
