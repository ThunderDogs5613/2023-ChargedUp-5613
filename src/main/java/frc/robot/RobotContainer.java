// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.ControllerMap;
import frc.robot.Constants.Constants;
import frc.robot.Constants.Constants.BigStickConstants.BigStickPos;
import frc.robot.subsystems.BigStick.BigStickSubsystem;
import frc.robot.subsystems.BigStick.States.PositionState;
import frc.robot.subsystems.BigStick.States.PrecisionDownState;
import frc.robot.subsystems.BigStick.States.PrecisionUpState;
import frc.robot.subsystems.BigStick.States.PrintState;
import frc.robot.subsystems.Drivetrain.*;
import frc.robot.subsystems.Drivetrain.States.OpenLoopState;
import frc.robot.subsystems.Yoinker.YoinkerSubsystem;
import frc.robot.subsystems.Yoinker.States.ForwardState;
import frc.robot.subsystems.Yoinker.States.IdleState;
import frc.robot.subsystems.Yoinker.States.ReverseState;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.button.CommandGenericHID;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.*;
import frc.robot.commands.Autos.GonBalance;
import frc.robot.commands.Autos.MildRetreat;


public class RobotContainer {

  DrivetrainSubsystem drive;
  YoinkerSubsystem yoink;
  BigStickSubsystem stick;
  CommandGenericHID driveStick = ControllerMap.getDriveStick();

  public RobotContainer() {
    initializeSubsystems();
    configureBindings();
    setAllDefaultCommands();
  }

  private void setAllDefaultCommands() {
    CommandScheduler.getInstance().setDefaultCommand(drive, new OpenLoopState());
    CommandScheduler.getInstance().setDefaultCommand(stick, new PrintState());
    CommandScheduler.getInstance().setDefaultCommand(yoink, new IdleState());
  }

  private void initializeSubsystems() {
    drive = DrivetrainSubsystem.getInstance();
    yoink = YoinkerSubsystem.getInstance();
    stick = BigStickSubsystem.getInstance();
  }

  private void configureBindings() {
    Trigger spit = driveStick.button(ControllerMap.DriveController.Button.TRIGGER).onTrue(
      new ForwardState()
    );
    Trigger swallow = driveStick.button(ControllerMap.DriveController.Button.B2).onTrue(
      new ReverseState()
    );

    Trigger trig3 = driveStick.button(ControllerMap.DriveController.Button.B3).onTrue(
      new PositionState(BigStickPos.FLOOR_YOINK)
    );
    Trigger  trig4 = driveStick.button(ControllerMap.DriveController.Button.B4).onTrue(
      new PositionState(BigStickPos.SHELF_YOINK)
    );
    Trigger trig5 = driveStick.button(ControllerMap.DriveController.Button.B5).onTrue(
      new PositionState(BigStickPos.SCORE_CUBE)
    );
    Trigger trig6 = driveStick.button(ControllerMap.DriveController.Button.B6).onTrue(
      new PositionState(BigStickPos.STARTUP)
    );

    Trigger altTrig3 = driveStick.button(ControllerMap.ButtonPad.Button.B12).onTrue(
      new PositionState(BigStickPos.FLOOR_YOINK)
    );
    Trigger altTrig5 = driveStick.button(ControllerMap.ButtonPad.Button.B10).onTrue(
      new PositionState(BigStickPos.SCORE_CUBE)
    );
    Trigger altTrig6 = driveStick.button(ControllerMap.ButtonPad.Button.B11).onTrue(
      new PositionState(BigStickPos.STARTUP)
    );
    Trigger trig7 = driveStick.button(ControllerMap.DriveController.POVButton.UP).onTrue(
      new PrecisionUpState().repeatedly()
    );
    Trigger trig8 = driveStick.button(ControllerMap.DriveController.POVButton.DOWN).onTrue(
      new PrecisionDownState().repeatedly()
    );
    Trigger trig9 = driveStick.button(ControllerMap.DriveController.POVButton.LEFT).onTrue(
      new PrintState()
    );
  }

  public Command getAutonomousCommand() {
    return new GonBalance();
  }
}