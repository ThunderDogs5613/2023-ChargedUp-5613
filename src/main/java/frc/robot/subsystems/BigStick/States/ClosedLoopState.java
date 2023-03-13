package frc.robot.subsystems.BigStick.States;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.ControllerMap;
import frc.robot.subsystems.BigStick.BigStickSubsystem;

public class ClosedLoopState extends CommandBase{

    BigStickSubsystem stick = BigStickSubsystem.getInstance();

    public ClosedLoopState() {
        addRequirements(stick);
    }

    @Override
    public void execute() {

    }
}