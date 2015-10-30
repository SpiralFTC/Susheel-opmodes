package com.qualcomm.ftcrobotcontroller.opmodes;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.ftcrobotcontroller.R;
//import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DeviceInterfaceModule;
import com.qualcomm.robotcore.hardware.LED;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;


/**
 * Created by heel7_000 on 10/21/2015.
 */
public class YoMama extends OpMode {
    DcMotor yo;
    DcMotor mama;
    OpticalDistanceSensor yolo;
    @Override
    public void start() {
        super.start();
    }

    @Override
    public void init() {
        yo = hardwareMap.dcMotor.get("right");
        mama= hardwareMap.dcMotor.get("left");
        mama.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        double yomama = gamepad1.left_stick_y;
        double yollama = gamepad1.right_stick_y;
        Range.clip(yomama,0,1);
        Range.clip(yollama,0,1);

        mama.setPower(yomama);
        yo.setPower(yollama);
        telemetry.addData("Text", "*** Robot Data***");
        //telemetry.addData("arm", "arm:  " + String.format("%.2f", armPosition));
        //telemetry.addData("claw", "claw:  " + String.format("%.2f", clawPosition));
        //telemetry.addData("left tgt pwr",  "left  pwr: " + String.format("%.2f", left));
        telemetry.addData("Poitcal sensor ","Value:" +yolo.getLightDetected());
    }

    @Override
    public void stop() {
        super.stop();
    }
}
