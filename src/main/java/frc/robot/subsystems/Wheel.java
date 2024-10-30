// package frc.robot.subsystems;

// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import edu.wpi.first.wpilibj2.command.SubsystemBase;

// public class Wheel extends SubsystemBase {
// private WheelIO wheelIO;
// private WheelIOInputsAutoLogged wheelInputs = new WheelIOInputsAutoLogged();
// private static Wheel instance;

// public static Wheel getInstance(){
// if(instance == null){
// instance = new Wheel();
// }
// return instance;
// }

// public Wheel(){
// wheelIO = new WheelIOTalonFX();
// }

// @Override
// public void periodic(){
// wheelIO.updateInputs(wheelInputs);
// }

// public void setVoltage(double voltage){
// SmartDashboard.putBoolean("Subsystem", true);
// wheelIO.setVoltage(voltage);
// }

// }
