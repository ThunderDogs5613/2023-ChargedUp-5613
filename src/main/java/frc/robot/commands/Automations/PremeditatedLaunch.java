package frc.robot.commands.Automations;

import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants.Constants.BigStickConstants.BigStickPos;
import frc.robot.Constants.Constants.ScoopConstants.ScoopPos;
import frc.robot.subsystems.BigStick.States.PositionState;
import frc.robot.subsystems.Scoop.States.ScoopPositionState;

public class PremeditatedLaunch extends SequentialCommandGroup {
    
    public PremeditatedLaunch() {

        addCommands(
            Commands.parallel(
                new PositionState(BigStickPos.MID),
                new ScoopPositionState(ScoopPos.BACK)
            ).withTimeout(1.5),
            new LaunchHighh()
        );
    }
}
