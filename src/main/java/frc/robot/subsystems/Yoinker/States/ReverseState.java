package frc.robot.subsystems.Yoinker.States;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Yoinker.YoinkerSubsystem;

public class ReverseState extends CommandBase{
    private YoinkerSubsystem yoink = YoinkerSubsystem.getInstance();

    public ReverseState() {
        addRequirements(yoink);
    }

    @Override
    public void execute() {
        yoink.useReverse();
    }
}
