package dssc.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlarmTest {

    @Test
    void alarm_could_be_on() {
        Alarm alarm = new Alarm(new Sensor());
        alarm.check();
        assertTrue(alarm.isAlarmOn());
    }
}
