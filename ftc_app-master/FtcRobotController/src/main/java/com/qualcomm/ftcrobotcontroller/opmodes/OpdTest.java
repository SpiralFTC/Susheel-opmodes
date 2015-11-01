package com.qualcomm.ftcrobotcontroller.opmodes;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;

/**
 * Created by heel7_000 on 11/1/2015.
 */
public class OpdTest extends OpMode {
   OpticalDistanceSensor light;
    @Override
    public void init() {
        light = hardwareMap.opticalDistanceSensor.get("EOPD");
    }

    @Override
    public void loop() {
        telemetry.addData("EOPD",light.getLightDetected());

    }

    @Override
    public void stop() {
        super.stop();
    }
}
