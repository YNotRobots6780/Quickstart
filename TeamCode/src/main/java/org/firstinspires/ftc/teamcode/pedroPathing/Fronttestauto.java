package org.firstinspires.ftc.teamcode.pedroPathing;

import com.pedropathing.follower.Follower;
import com.pedropathing.geometry.Pose;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.pedropathing.util.Timer;

@Autonomous
public class Fronttestauto extends OpMode {
private Follower follower;
private Timer pathtimer, opmodeTimer;

public enum PathStates {
    // start_score
    //score_get2B
    //get2B_score
    //score_get3B
    start_shoot
}

    PathStates pathStates;

private final Pose startPose = new Pose(21.533,122.692,Math.toRadians(137));
private final Pose shootPose = new Pose(53.266,89.832,Math.toRadians(137));

    @Override
    public void init() {

    }
    @Override
    public void loop(){
    }

}
