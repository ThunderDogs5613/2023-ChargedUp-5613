package frc.robot.subsystems.BigStick.States;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.Constants;
import frc.robot.Constants.Constants.BigStickConstants.BigStickPos;
import frc.robot.subsystems.BigStick.BigStickSubsystem;

public class PositionState extends CommandBase{

    private BigStickPos position;
    private double upPower = Constants.BigStickConstants.bigStickPosRaiseSpeed;
    private double downPower = Constants.BigStickConstants.bigStickPosLowerSpeed;
    private double holdPosition;
    private double power;


  
    public PositionState(BigStickPos position) {
      addRequirements(BigStickSubsystem.getInstance());  
  
      this.position = position;
    }
  
    @Override
    public void initialize() {
  
      holdPosition = BigStickSubsystem.getInstance().getBigStickPos();
  
      switch(position) {
        case DOWN :
          BigStickSubsystem.getInstance().setStickSetpoint(Constants.BigStickConstants.down);
 //         BigStickSubsystem.getInstance().setFeedForward(0.02);
          break;
  
        case MID :
          BigStickSubsystem.getInstance().setStickSetpoint(Constants.BigStickConstants.mid);
//          ArmSubsystem.getInstance().setFeedForward(0.01);
          break;  
          
        case UP :
          BigStickSubsystem.getInstance().setStickSetpoint(Constants.BigStickConstants.up);
//          ArmSubsystem.getInstance().setFeedForward(0.2);
          break;
  
        case HOLD :
        holdPosition = BigStickSubsystem.getInstance().getBigStickPos();
        BigStickSubsystem.getInstance().setStickSetpoint(holdPosition);
//        ArmSubsystem.getInstance().setFeedForward(0.0);
          break;
      }
      BigStickSubsystem.getInstance().enable();
    }
  
    public void execute() {
      System.out.println(BigStickSubsystem.getInstance().getBigStickPos());
    }
  
    @Override
    public void end(boolean interrupted) {
      BigStickSubsystem.getInstance().disable();
      BigStickSubsystem.getInstance().setPower(0);
    }
}