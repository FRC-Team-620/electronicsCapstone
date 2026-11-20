package frc.robot.subsystems.testRig;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class testRig extends SubsystemBase {
  private final testRigIO io;

  public testRig(testRigIO io) {
    this.io = io;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void applyVolts(double voltage) {
    io.setVoltage(voltage);
  }
}
