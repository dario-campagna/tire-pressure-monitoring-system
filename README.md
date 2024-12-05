# Tire Pressure Monitoring System

The `Alarm` class is designed to monitor tire pressure and set an alarm if the pressure falls outside the expected range.
The `Sensor` class provided for the example simulates the behaviour of a real tire sensor, providing random but realistic values.

In the `main` branch the `Alarm` class has a direct dependency on `Sensor`.
As a consequence, the tests we can write for the `Alarm` class have a non-deterministic behavior.

In the `stub` branch we introduce an abstraction that makes it possible to use stubs in our tests. 
