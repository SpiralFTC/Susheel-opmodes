package com.qualcomm.ftcrobotcontroller.opmodes;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.hardware.HiTechnicNxtLightSensor;

/**
 * Created by heel7_000 on 10/29/2015.
 */
public class Lighttest extends LinearOpMode {

    DcMotor leftMotor;
    DcMotor rightMotor;
    HiTechnicNxtLightSensor light;

    @Override

    public void runOpMode() throws InterruptedException {
        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        rightMotor = hardwareMap.dcMotor.get("rightMotor");

        int i = 1;

        while(i==1) {
            leftMotor.setPower(1);
            rightMotor.setPower(1);
            if (light.getLightDetected()>50){
                leftMotor.setPower(0);
                rightMotor.setPower(0);
                i++;
            }
            else{
                leftMotor.setPower(1);
                rightMotor.setPower(1);

            }
        }
    }



}
