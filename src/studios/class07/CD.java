package studios.class07;

public class CD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    private String artist;
    private int trackCount;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    private static final int cdCapacityMB = 700;
    private static final int cdSpeed = 500;

    public CD(int discId, String discTitle, String musicArtist, int numOfTracks, boolean writeableDisc ) {
        super(cdCapacityMB, discId, discTitle, cdSpeed, writeableDisc);
        this.trackCount = numOfTracks;
        this.artist = musicArtist;
    }


    @Override
    public void spinDisc() {
        System.out.println("Spinning a CD");
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
        System.out.println("Reading a CD");
    }

    @Override
    public void reportSpeed() {
        System.out.println(String.format("CDs spin at %d RPM",this.getSpeed()));
    }



}
