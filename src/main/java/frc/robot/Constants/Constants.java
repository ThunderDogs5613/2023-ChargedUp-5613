// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Constants;

public final class Constants {

    public final class DrivetrainConstants{
        public static final double RobotMaxSpeed = 11;
    }

    public static final class BigStickConstants {
        public static final double kP = 0.01;
        public static final double kI = 0.00;
        public static final double kD = 0.00;

        public static final double bigStickPrecisionSpeed = 0.10;
        public static final double bigStickPosRaiseSpeed = 0.20;
        public static final double bigStickPosLowerSpeed = -0.65;

        public static final double startingPos = -75;
        public static final double yoinkFromFloor = 0;
        public static final double yoinkFromShelf = -120;
        public static final double scoreCube = -142;
        public enum BigStickPos {
            FLOOR_YOINK, SHELF_YOINK, SCORE_CUBE, STARTUP, HOLD
        }
    }
    public static final class ScoopConstants {
        public static final double kP = 0.03;
        public static final double kI = 0.00;
        public static final double kD = 0.005;

        public static final double maxThrotIn = 25;
        public static final double minThrotIn = -43;
        public static final double maxEncoderOut = 60;
        public static final double minEncoderOut = 0;

        public static final double startPos = 0;
        public static final double straightUp = 3.81;
        public static final double insideFrame = -3;
        public static final double fullBack = 3.81;

        public enum ScoopPos {
            START, UP, INSIDE, BACK, HOLD
        }
    }
}