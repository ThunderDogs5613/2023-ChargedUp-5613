package frc.robot.commands.Autos;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain.States.SetAutonArcade;

public class MildRetreat extends SequentialCommandGroup{
    public MildRetreat() {

        addCommands(
            new SetAutonArcade(-2, 0).withTimeout(3)
        );
    }
}
