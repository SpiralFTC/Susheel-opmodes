package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by heel7_000 on 10/21/2015.
 */
public class AryansAutonomousMode extends LinearOpMode {
    DcMotor left;
    DcMotor right;

    @Override
    public void runOpMode() throws InterruptedException {
        right = hardwareMap.dcMotor.get("RIGHT");
        left = hardwareMap.dcMotor.get("LEFT");

        left.setDirection(DcMotor.Direction.REVERSE);

        for (int i = 0; i < 4; i++) {

            left.setPower(1);
            right.setPower(1);
            sleep(250);

            left.setPower(1);
            right.setPower(-1);
            sleep(200);

        }

        left.setPower(0);
        right.setPower(0);

    }
}
