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
                myTelevisionApp.setChannel(45);
                myTelevisionApp.positiveTelevisionChannelChange();
                assertEquals(46, myTelevisionApp.getChannel());
                myTelevisionApp.setChannel(50);
                myTelevisionApp.positiveTelevisionChannelChange();
                assertEquals(0, myTelevisionApp.getChannel());
                myTelevisionApp.setChannel(30);
                myTelevisionApp.negativeTelevisionChannelChange();
                assertEquals(29, myTelevisionApp.getChannel());
                myTelevisionApp.setChannel(0);
                myTelevisionApp.negativeTelevisionChannelChange();
                assertEquals(50, myTelevisionApp.getChannel());

        }


        @Test
        public void testThatTelevisionVolumeCanBeIncreased(){
                myTelevisionApp.turnPowerOn();
                myTelevisionApp.increaseTelevisionVolume();
                assertEquals(1, myTelevisionApp.getVolume());
                myTelevisionApp.setVolume(6);
                myTelevisionApp.increaseTelevisionVolume();
                assertEquals(7, myTelevisionApp.getVolume());
        }


        @Test
        public void testThatTelevisionVolumeCanBeDecreased(){
                myTelevisionApp.turnPowerOn();
                myTelevisionApp.decreaseTelevisionVolume();
                assertEquals(0, myTelevisionApp.getVolume());
                myTelevisionApp.setVolume(6);
                myTelevisionApp.decreaseTelevisionVolume();
                assertEquals(5, myTelevisionApp.getVolume());

        }

}
