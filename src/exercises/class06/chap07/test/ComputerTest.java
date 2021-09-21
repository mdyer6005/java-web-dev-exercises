package exercises.class06.chap07.test;
import exercises.class06.chap07.technology.Laptop;
import exercises.class06.chap07.technology.SmartPhone;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {

    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    // test if ID system is working
    @Test
    public void testIncrementingIds() {
        Laptop testLaptop1  = new Laptop(2048, 2000000, true);
        SmartPhone testPhone1 = new SmartPhone(1024, 256000, "ringy");
        assertEquals(testLaptop1.getDeviceId() + 1, testPhone1.getDeviceId(), .001);
    }

    // test Laptop removeWebcam
    @Test
    public void testRemoveLaptopWebcam() {
        Laptop lap1  = new Laptop(2048, 2000000, true);
        Laptop lap2  = new Laptop(2048, 2000000, false);

        // lap1 should have webcam before, and not after
        assertTrue(lap1.getHasWebcam());
        lap1.removeWebcam();
        assertFalse(lap1.getHasWebcam());

        // lap1 should not have webcam before or after
        assertFalse(lap2.getHasWebcam());
        lap2.removeWebcam();
        assertFalse(lap2.getHasWebcam());
    }

    // test Smartphone ring sound
    @Test
    public void testRing() {
        SmartPhone phone1 = new SmartPhone(1024, 256000, "ringy");
        assertEquals("ringy ... ringy", phone1.ring());
    }

    // test changing Smartphone ring sound
    @Test
    public void testChangeRing() {
        SmartPhone phone1 = new SmartPhone(1024, 256000, "ringy");
        phone1.setRingtone("dingy");
        assertEquals("dingy ... dingy", phone1.ring());
    }



}
