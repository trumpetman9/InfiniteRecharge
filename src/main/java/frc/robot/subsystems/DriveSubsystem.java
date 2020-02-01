package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
import frc.robot.commands.DefaultDriveCommand;

public class DriveSubsystem extends Subsystem{

    private Robot robot;
    private DifferentialDrive drive;

    public DriveSubsystem(Robot robot){
        this.robot = robot;
        
    }

    public void initDefaultCommand() {
        setDefaultCommand(new DefaultDriveCommand(robot));
    }











}