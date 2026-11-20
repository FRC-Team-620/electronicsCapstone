package frc.robot.subsystems.testRig;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;

public class testRigIOSpark implements testRigIO {
  private SparkMax motor;
  private int motorID;
  private SparkMaxConfig config;

  public testRigIOSpark(int motorID) {
    config = new SparkMaxConfig();
    config.idleMode(IdleMode.kCoast).smartCurrentLimit(5).voltageCompensation(12).inverted(false);
  }

  @Override
  public void setVoltage(double voltage) {
    motor.set(voltage);
  }
}
