package frc.robot.commands.Automations;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.Constants;
import frc.robot.subsystems.BigStick.BigStickSubsystem;
import frc.robot.subsystems.Scoop.ScoopSubsystem;

public class CheckedLaunch extends CommandBase {

    BigStickSubsystem stick = BigStickSubsystem.getInstance();
    ScoopSubsystem scoop = ScoopSubsystem.getInstance();

    public CheckedLaunch() {
        addRequirements(stick, scoop);
    }

    public void execute() {
        if((stick.getStickSetpoint() == Constants.BigStickConstants.mid) && (scoop.getScoopSetpoint() == Constants.ScoopConstants.back)) {
            new LaunchHighh();
        }

        else {
            new PremeditatedLaunch();
        }
    }
}
