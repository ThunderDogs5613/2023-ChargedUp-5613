package frc.robot.commands.Autos;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.Constants.Constants.BigStickConstants.BigStickPos;
import frc.robot.Constants.Constants.ScoopConstants.ScoopPos;
import frc.robot.subsystems.BigStick.States.PositionState;
import frc.robot.subsystems.Drivetrain.States.SetAutonArcade;
import frc.robot.subsystems.Scoop.States.ScoopPositionState;

public class MildRetreat extends SequentialCommandGroup{
    public MildRetreat() {

        addCommands(
            new PositionState(BigStickPos.UP),
            new ScoopPositionState(ScoopPos.UP),
            new WaitCommand(1),
            new SetAutonArcade(0.5, 0).withTimeout(2)
        );
    }
}
