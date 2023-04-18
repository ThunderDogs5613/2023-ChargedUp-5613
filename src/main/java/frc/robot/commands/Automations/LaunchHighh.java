package frc.robot.commands.Automations;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants.Constants.BigStickConstants.BigStickPos;
import frc.robot.Constants.Constants.ScoopConstants.ScoopPos;
import frc.robot.subsystems.BigStick.States.PositionState;
import frc.robot.subsystems.Scoop.States.ScoopPositionState;

public class LaunchHighh extends SequentialCommandGroup{
    public LaunchHighh() {

        addCommands(
            new PositionState(BigStickPos.UP).withTimeout(.12),
            Commands.parallel(
                new ScoopPositionState(ScoopPos.ZERO),
                new PositionState(BigStickPos.UP)    
            )
            );
    }
}

