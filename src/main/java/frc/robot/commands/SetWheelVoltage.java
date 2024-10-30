package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Wheel;

public class SetWheelVoltage extends Command{
    private Wheel wheel = Wheel.getInstance();

    public SetWheelVoltage(){
        addRequirements(wheel);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        wheel.setVoltage(SmartDashboard.getNumber("Voltage", 0));
    }
}
