package frc.robot.subsystems.BigStick;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants.RobotMap;
import edu.wpi.first.math.filter.SlewRateLimiter;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BigStickSubsystem extends SubsystemBase {
    private CANSparkMax motorBS;
    private RelativeEncoder encoder;
    private SlewRateLimiter armLimiter;
    private double armOutput;
    private double limitedOutput;

    private static BigStickSubsystem instance;

    private BigStickSubsystem() {
      motorBS = new CANSparkMax(RobotMap.BIG_STICK_MOTOR_ID, MotorType.kBrushless);
      encoder = motorBS.getEncoder();
      armLimiter = new SlewRateLimiter(1.8);   
    }

    public static synchronized BigStickSubsystem getInstance() {
        if(instance == null){
          instance = new BigStickSubsystem();
        }
        return instance;
    }
    
    public void setPower(double power) {
      motorBS.set(power);
    }

    protected void useOutput(double output, double setpoint) {
      armOutput = output;
      //limitedOutput = armLimiter.calculate(armOutput);
      setPower(output);
    }

    protected double getMeasurement() {
      return getArmPosition();
    } 

    public double getArmPosition() {
      return encoder.getPosition();
    }
}