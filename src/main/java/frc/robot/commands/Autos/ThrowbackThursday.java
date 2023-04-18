package frc.robot.commands.Autos;

import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.Constants.Constants.BigStickConstants.BigStickPos;
import frc.robot.Constants.Constants.ScoopConstants.ScoopPos;
import frc.robot.commands.Automations.AutoBalance;
import frc.robot.commands.Automations.DumpCargo;
import frc.robot.subsystems.BigStick.States.PositionState;
import frc.robot.subsystems.Drivetrain.DrivetrainSubsystem;
import frc.robot.subsystems.Drivetrain.States.SetAutonArcade;
import frc.robot.subsystems.Scoop.States.ScoopPositionState;

public class ThrowbackThursday extends SequentialCommandGroup{
    public ThrowbackThursday() {

        addCommands(
            new DumpCargo().withTimeout(2),
            new SetAutonArcade(0.3, 0).withTimeout(2),
            Commands.parallel(
                new AutoBalance(DrivetrainSubsystem.getInstance()),
                new PositionState(BigStickPos.DOWN),
                new ScoopPositionState(ScoopPos.BACK)
            )

        );
    }
}