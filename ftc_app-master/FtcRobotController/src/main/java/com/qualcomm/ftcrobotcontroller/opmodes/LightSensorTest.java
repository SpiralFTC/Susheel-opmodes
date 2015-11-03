package com.qualcomm.ftcrobotcontroller.opmodes;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.LightSensor;

/**
 * Created by heel7_000 on 11/1/2015.
 */
public class LightSensorTest extends OpMode {
   LightSensor light;
   // OpticalDistanceSensor yo;
    @Override
    public void init() {
        light = hardwareMap.lightSensor.get("nxt");
    }

    @Override
    public void loop() {
        light.enableLed(true);
        telemetry.addData("EOPD",light.getLightDetected());

    }

    @Override
    public void stop() {
        super.stop();
    }
}
