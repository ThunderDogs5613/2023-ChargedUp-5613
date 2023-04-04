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

        public static final double down = 0;
        public static final double mid = -40;
        public static final double up = -75;
        public enum BigStickPos {
            DOWN, MID, UP, HOLD
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

        public static final double zero = 0;
        public static final double up = -3.0;
        public static final double back = -4;
        public static final double stow = 3.0;

        public enum ScoopPos {
            ZERO, UP, BACK, STOW, HOLD
        }
    }
}