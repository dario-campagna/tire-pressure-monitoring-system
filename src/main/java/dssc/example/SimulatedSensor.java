package dssc.example;

import java.util.Random;

// The reading of the pressure value from the sensor is simulated in this implementation.
// Because the focus of the exercise is on the other class.

public class SimulatedSensor implements Sensor {

    public static final double OFFSET = 16;

    @Override
    public double popNextPressurePsiValue() {
        double pressureTelemetryValue = samplePressure();
        return OFFSET + pressureTelemetryValue;
    }

    private double samplePressure() {
        // placeholder implementation that simulate a real sensor in a real tire
        Random basicRandomNumbersGenerator = new Random();
        return 6 * basicRandomNumbersGenerator.nextDouble() * basicRandomNumbersGenerator.nextDouble();
    }
}
