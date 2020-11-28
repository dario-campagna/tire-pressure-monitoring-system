package dssc.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlarmTest {

    @Test
    void pressureWithinThresholds() {
        Alarm alarm = new Alarm(new StubSensor(19));
        alarm.check();
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    void lowPressure() {
        Alarm alarm = new Alarm(() -> 10);
        alarm.check();
        assertTrue(alarm.isAlarmOn());
    }

    @Test
    void highPressure() {
        Alarm alarm = new Alarm(() -> 30);
        alarm.check();
        assertTrue(alarm.isAlarmOn());
    }

    public class StubSensor implements Sensor {

        private double psiValue;

        public StubSensor(double psiValue) {
            this.psiValue = psiValue;
        }

        @Override
        public double popNextPressurePsiValue() {
            return psiValue;
        }
    }
}
