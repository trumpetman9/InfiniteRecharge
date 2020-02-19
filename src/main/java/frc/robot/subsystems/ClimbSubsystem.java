package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.IO;
import frc.robot.Robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class ClimbSubsystem extends Subsystem{
    private Robot robot;

    private ClimbSubsystem(Robot robot){
        this.robot = robot;

        CANSparkMax climbMotor = new CANSparkMax(IO.climb, MotorType.kBrushless);
    }


}