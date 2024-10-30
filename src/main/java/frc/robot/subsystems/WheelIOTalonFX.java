// package frc.robot.subsystems;

// import com.ctre.phoenix6.configs.TalonFXConfiguration;
// import com.ctre.phoenix6.controls.VoltageOut;
// import com.ctre.phoenix6.hardware.TalonFX;

// public class WheelIOTalonFX implements WheelIO {
// TalonFX wheel;

// public WheelIOTalonFX(){
// wheel = new TalonFX(6, "drivet");//Back_Left_Move
// TalonFXConfiguration config = new TalonFXConfiguration();
// config.CurrentLimits.StatorCurrentLimitEnable = true;
// config.CurrentLimits.StatorCurrentLimit = 20;
// config.Voltage.PeakForwardVoltage = 12;
// config.Voltage.PeakReverseVoltage = -12;
// wheel.getConfigurator().apply(config);
// }
// @Override
// public void updateInputs(WheelIOInputs inputs) {
// inputs.position = wheel.getPosition().getValueAsDouble();
// inputs.velocity = wheel.getVelocity().getValueAsDouble();
// inputs.staterCurrent = wheel.getStatorCurrent().getValueAsDouble();
// inputs.voltage = wheel.getMotorVoltage().getValueAsDouble();
// }
// @Override
// public void setVoltage(double voltage) {
// wheel.setControl(new VoltageOut(voltage));
// }

// }
