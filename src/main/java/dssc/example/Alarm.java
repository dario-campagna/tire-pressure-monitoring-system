package dssc.example;

public class Alarm {

    private final double lowPressureThreshold = 17;
    private final double highPressureThreshold = 21;

    private SimulatedSensor sensor;
    private boolean alarmOn = false;

    public Alarm(SimulatedSensor sensor) {
        this.sensor = sensor;
    }

    public void check() {
        double psiPressureValue = sensor.popNextPressurePsiValue();

        if (psiPressureValue < lowPressureThreshold || highPressureThreshold < psiPressureValue) {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn() {
        return alarmOn;
    }
}
