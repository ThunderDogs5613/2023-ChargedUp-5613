package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.Autos.ThrowbackThursday;
import frc.robot.commands.Autos.GonBalance;
import frc.robot.commands.Autos.ThrowbackTuesday;

public class AutoChooser {

    private static final Command ThrowbackThursday = new ThrowbackThursday();
    private static final Command GonBalance = new GonBalance();
    private static final Command ThrowbackTuesday = new ThrowbackTuesday();


    public static SendableChooser<Command> auto_chooser = new SendableChooser<>();
    
    public static void configureAutoChooser() {
        auto_chooser.setDefaultOption("Score Mid and Balance", ThrowbackThursday);
        auto_chooser.addOption("Drive Forward and Balance", GonBalance);
        auto_chooser.addOption("Just score", ThrowbackTuesday);

        SmartDashboard.putData(auto_chooser);
    }

}
