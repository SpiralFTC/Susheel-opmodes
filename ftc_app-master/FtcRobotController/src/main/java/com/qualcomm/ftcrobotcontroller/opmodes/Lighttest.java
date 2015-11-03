package com.qualcomm.ftcrobotcontroller.opmodes;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.hardware.HiTechnicNxtLightSensor;
import com.qualcomm.robotcore.hardware.LegacyModule;
import com.qualcomm.robotcore.hardware.LightSensor;

/**
 * Created by heel7_000 on 10/29/2015.
 */
public class Lighttest extends LinearOpMode {

    DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor leftMotor1;
    DcMotor rightMotor1;
    LightSensor light;
    LegacyModule yomama;

    @Override

    public void runOpMode() throws InterruptedException {
        leftMotor = hardwareMap.dcMotor.get("leftMotor");
        rightMotor = hardwareMap.dcMotor.get("rightMotor");
        //leftMotor1 = hardwareMap.dcMotor.get("leftMotor1");
        //rightMotor1 = hardwareMap.dcMotor.get("rightMotor1");
        //yomama = hardwareMap.legacyModule.get("lkjaf");
        light = hardwareMap.lightSensor.get("nxt");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);


        int i = 1;

        while(i==1) {
            leftMotor.setPower(1);
            rightMotor.setPower(1);
            //leftMotor1.setPower(1);
            //rightMotor1.setPower(1);
            if (light.getLightDetected()>50){
                leftMotor.setPower(0);
                rightMotor.setPower(0);
               // leftMotor1.setPower(0);
               // rightMotor1.setPower(0);
                i++;
            }
            else{
                leftMotor.setPower(0);
                rightMotor.setPower(0);
                //leftMotor1.setPower(0);
                //rightMotor1.setPower(0);

            }
        }
    }



}
