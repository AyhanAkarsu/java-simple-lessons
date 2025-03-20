// Import the necessary libraries
import com.pi4j.io.gpio.*;
import com.pi4j.util.CommandArgumentParser;

public class ServoExample {
  public static void main(String[] args) throws InterruptedException {
    // Set the minimum and maximum angle for the servo motor
    final int MIN_ANGLE = 0;
    final int MAX_ANGLE = 180;

    // Set the GPIO pin that the servo is connected to
    final GpioPinDigitalOutput servoPin = CommandArgumentParser.getPin(
        RaspiPin.class,    // Use the RaspiPin class to get the GPIO pin
        RaspiPin.GPIO_01   // Set the GPIO pin to use
    );

    // Create a new servo motor control instance
    final GpioServoControl servo = new GpioServoControl(servoPin);

    // Set the servo to move between the minimum and maximum angles repeatedly
    for (int angle = MIN_ANGLE; angle <= MAX_ANGLE; angle++) {
      servo.setServoPulseWidth(angle);
      Thread.sleep(10);
    }

    for (int angle = MAX_ANGLE; angle >= MIN_ANGLE; angle--) {
      servo.setServoPulseWidth(angle);
      Thread.sleep(10);
    }
  }
}
