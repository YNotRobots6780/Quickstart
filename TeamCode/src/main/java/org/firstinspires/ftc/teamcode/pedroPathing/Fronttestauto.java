package org.firstinspires.ftc.teamcode.pedroPathing;

import com.pedropathing.follower.Follower;
import com.pedropathing.geometry.BezierLine;
import com.pedropathing.geometry.Pose;
import com.pedropathing.paths.PathChain;
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
    start_shoot,

    shoot
}

    PathStates pathStates;

private final Pose startPose = new Pose(21.533,122.692,Math.toRadians(137));
private final Pose shootPose = new Pose(53.266,89.832,Math.toRadians(137));
private final Pose turn2B = new Pose(41.94,85.887,Math.toRadians(180));
private final Pose Intake2B = new Pose(21.411,85.887,Math.toRadians(180));
private final Pose turn3B = new Pose(41.149,60.308,Math.toRadians(180));
private final Pose intake3B = new Pose(23.205,60.981,Math.toRadians(180));
private final Pose leave = new Pose(48.327,73.317,Math.toRadians(180));

private PathChain startPose_shoot;

public void buildPaths() {
    startPose_shoot = follower.pathBuilder()
            .addPath(new BezierLine(startPose, shootPose))
            .setLinearHeadingInterpolation(startPose.getHeading(), shootPose.getHeading())
            .build();
}

public void statePathBuildingupdate(){
    switch (pathStates){
        case start_shoot:
            follower.followPath(startPose_shoot, true);
            pathStates = PathStates.shoot;
            break;
        case shoot:
            //Is pathdone?
            if (!follower.isBusy()){
                //add shooter logic
            telemetry.addLine("completed path 1");

            }
            break;
    }
}

    @Override
    public void init() {

    }
    @Override
    public void loop(){
    }

}
