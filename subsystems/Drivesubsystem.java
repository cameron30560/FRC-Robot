
/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivesubsystem extends SubsystemBase {
  public  VictorSPX lF = new VictorSPX(0);
  public  VictorSPX lB = new VictorSPX(1);
  public  VictorSPX rF = new VictorSPX(2);
  public  VictorSPX rB = new VictorSPX(3);
  // public static SpeedControllerGroup left = new SpeedControllerGroup(lF,lB );
  // public static SpeedControllerGroup right = new SpeedControllerGroup(rB,rF);

  /**
   * Creates a new Drivesubsystem.
   */
  public Drivesubsystem() {

  }

  public  void TankDrive( double leftspeed, double rightspeed){
  lB.set(ControlMode.PercentOutput, leftspeed);
  lF.set(ControlMode.PercentOutput, leftspeed);
  rB.set(ControlMode.PercentOutput, rightspeed);
  rF.set(ControlMode.PercentOutput, rightspeed);
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

//public void setDefualtcomand(RunCommand runCommand) {
//}
}
