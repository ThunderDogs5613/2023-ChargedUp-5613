package frc.robot.subsystems.Yoinker;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class YoinkerSubsystem extends SubsystemBase {
    private Compressor compressor;

    private static YoinkerSubsystem instance;

    private YoinkerSubsystem() {
        compressor = new Compressor(1, PneumaticsModuleType.REVPH);

        compressor.enableAnalog(75, 120);
        
    }

    public static synchronized YoinkerSubsystem getInstance() {
        if(instance == null){
          instance = new YoinkerSubsystem();
        }
        return instance;
      }
}
