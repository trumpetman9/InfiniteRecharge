package frc.robot.subsystems;

import com.revrobotics.SparkMax;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.IO;
import frc.robot.Robot;
import frc.robot.commands.DefaultDriveCommand;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class DriveSubsystem extends Subsystem{

    private Robot robot;
    private DifferentialDrive drive;

    public DriveSubsystem(Robot robot){


        this.robot = robot;   
        CANSparkMax leftSlave = new CANSparkMax(IO.motorDriveLeftTop, MotorType.kBrushless); 
        CANSparkMax leftMaster = new CANSparkMax(IO.motorDriveLeftBottom, MotorType.kBrushless); 
        CANSparkMax rightSlave = new CANSparkMax(IO.motorDriveRightTop, MotorType.kBrushless);
        CANSparkMax rightMaster = new CANSparkMax(IO.motorDriveRightBottom, MotorType.kBrushless);
        

        SpeedControllerGroup left = new SpeedControllerGroup(leftMaster, leftSlave);
        SpeedControllerGroup right = new SpeedControllerGroup(rightMaster, rightSlave);

        drive = new DifferentialDrive(left, right);

    }

    public void tankDrive(double leftSpeed, double rightSpeed){
        drive.tankDrive(leftSpeed, rightSpeed);
    }

    public void initDefaultCommand() {
        setDefaultCommand(new DefaultDriveCommand(robot));
    }
 





}