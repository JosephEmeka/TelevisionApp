import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TelevisionAppTest {
        private TelevisionApp myTelevisionApp;

        @BeforeEach
        public void initializeTelevisionApp(){
                myTelevisionApp = new TelevisionApp();
        }

        @AfterEach
        public void tearDown(){
                if (myTelevisionApp.checkIfTelevisionIsOn()) {
                        myTelevisionApp.turnPowerOff();
                }
        }

        @Test
        public void testThatTelevisionCanBeTurnedOn(){
                assertFalse(myTelevisionApp.checkIfTelevisionIsOn());
                myTelevisionApp.turnPowerOn();
                assertTrue(myTelevisionApp.checkIfTelevisionIsOn());
        }

        @Test
        public void testThatTelevisionCanBeTurnedOff(){
                myTelevisionApp.turnPowerOn();
                assertTrue(myTelevisionApp.checkIfTelevisionIsOn());
                myTelevisionApp.turnPowerOff();
                assertFalse(myTelevisionApp.checkIfTelevisionIsOn());
        }



        @Test
        public void testThatTelevisionChannelCanBeChanged(){
                myTelevisionApp.turnPowerOn();



        }


        @Test
        public void testThatTelevisionVolumeCanBeIncreased(){
                myTelevisionApp.turnPowerOn();
                myTelevisionApp.increaseTelevisonVolume();
                assertEquals(1, myTelevisionApp.getVolume());
                myTelevisionApp.setVolume(6);
                myTelevisionApp.increaseTelevisonVolume();
                assertEquals(7, myTelevisionApp.getVolume());
        }


        @Test
        public void testThatTelevisionVolumeCanBeDecreased(){
                myTelevisionApp.turnPowerOn();
                myTelevisionApp.decreaseTelevisonVolume();
                assertEquals(0, myTelevisionApp.getVolume());
                myTelevisionApp.setVolume(6);
                myTelevisionApp.decreaseTelevisonVolume();
                assertEquals(5, myTelevisionApp.getVolume());

        }

}
