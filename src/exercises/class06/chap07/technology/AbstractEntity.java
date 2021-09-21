package exercises.class06.chap07.technology;

public abstract class AbstractEntity {
    private int deviceId;
    private static int nextId = 1;

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int aNextId) {
        AbstractEntity.nextId = aNextId;
    }

    public AbstractEntity() {
        this.setDeviceId(AbstractEntity.getNextId());
        incrementNextId();
    }

    private static void incrementNextId() {
        AbstractEntity.setNextId(AbstractEntity.getNextId() + 1);
    }
}
