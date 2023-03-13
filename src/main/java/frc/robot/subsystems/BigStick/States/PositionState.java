package frc.robot.subsystems.BigStick.States;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.Constants;
import frc.robot.Constants.ControllerMap;
import frc.robot.Constants.Constants.BigStickConstants.BigStickPos;
import frc.robot.subsystems.BigStick.BigStickSubsystem;

public class PositionState extends CommandBase{

    private BigStickPos position;

    private double holdPosition;
  
    public PositionState(BigStickPos position) {
      addRequirements(BigStickSubsystem.getInstance());  
  
      this.position = position;
    }
  
    @Override
    public void initialize() {
  
      holdPosition = BigStickSubsystem.getInstance().getBigStickPos();
  
      switch(position) {
        case FLOOR_YOINK :
          BigStickSubsystem.getInstance().setSetpoint(Constants.BigStickConstants.yoinkFromFloor);
 //         BigStickSubsystem.getInstance().setFeedForward(0.02);
          break;
  
        case SHELF_YOINK :
          BigStickSubsystem.getInstance().setSetpoint(Constants.BigStickConstants.yoinkFromShelf);
//          ArmSubsystem.getInstance().setFeedForward(0.01);
          break;  
          
        case STARTUP :
          BigStickSubsystem.getInstance().setSetpoint(Constants.BigStickConstants.startingPos);
//          ArmSubsystem.getInstance().setFeedForward(0.2);
          break;
  
        case SCORE_CUBE :
        BigStickSubsystem.getInstance().setSetpoint(Constants.BigStickConstants.scoreCube);
//        ArmSubsystem.getInstance().setFeedForward(0.05);
          break;
  
        case HOLD :
        BigStickSubsystem.getInstance().setSetpoint(holdPosition);
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
    }
}