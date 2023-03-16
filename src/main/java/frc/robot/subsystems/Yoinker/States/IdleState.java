package frc.robot.subsystems.Yoinker.States;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Yoinker.YoinkerSubsystem;

public class IdleState extends CommandBase{
    private YoinkerSubsystem yoink = YoinkerSubsystem.getInstance();

    public IdleState() {
        addRequirements(yoink);
    }

    @Override
    public void execute() {
        yoink.goIdle();
    }
}
