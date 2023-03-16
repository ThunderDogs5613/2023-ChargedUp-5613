package frc.robot.subsystems.Yoinker.States;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Yoinker.YoinkerSubsystem;

public class ForwardState extends CommandBase{
    private YoinkerSubsystem yoink = YoinkerSubsystem.getInstance();

    public ForwardState() {
        addRequirements(yoink);
    }

    @Override
    public void execute() {
        yoink.useForward();
    }
}