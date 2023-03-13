// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Constants;

public final class Constants {

    public final class DrivetrainConstants{
        public static final double RobotMaxSpeed = 11;
    }

    public static final class BigStickConstants {
        public static final double bigStickPrecisionSpeed = 0.10;
        public static final double bigStickPosRaiseSpeed = 0.20;
        public static final double bigStickPosLowerSpeed = -0.65;

        public static final double startingPos = 0;
        public static final double yoinkFromFloor = 0;
        public static final double yoinkFromShelf = 0;
        public static final double scoreCube = 0;
        public enum BigStickPos {
            FLOOR_YOINK, SHELF_YOINK, SCORE_CUBE, STARTUP, HOLD
        }
    }
}