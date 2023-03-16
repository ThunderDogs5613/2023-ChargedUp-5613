package frc.robot.subsystems.Yoinker;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class YoinkerSubsystem extends SubsystemBase {
    private Compressor compressor;
    private DoubleSolenoid solenoid;

    private static YoinkerSubsystem instance;

    private YoinkerSubsystem() {
        compressor = new Compressor(1, PneumaticsModuleType.REVPH);

        solenoid = new DoubleSolenoid(PneumaticsModuleType.REVPH , 0, 1);
        compressor.enableAnalog(75, 120);
    }

    public static synchronized YoinkerSubsystem getInstance() {
        if(instance == null){
          instance = new YoinkerSubsystem();
        }
        return instance;
    }

    public void useForward() {
      solenoid.set(Value.kForward);
    }

    public void useReverse() {
      solenoid.set(Value.kReverse);
    }

    public void goIdle() {
      solenoid.set(Value.kOff);
    }
}
