package exercises.class06.chap07.technology;

public class SmartPhone extends Computer {
    private String ringtone;

    public SmartPhone(int ram, int storageSpace, String ringtone) {
        super(ram, storageSpace, false);
        this.ringtone = ringtone;
    }

    public String getRingtone() {
        return ringtone;
    }

    public void setRingtone(String ringtone) {
        this.ringtone = ringtone;
    }

    public String ring() {
        return this.getRingtone() + " ... " + this.getRingtone();
    }

}
