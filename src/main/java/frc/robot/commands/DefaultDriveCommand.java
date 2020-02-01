package frc.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DefaultDriveCommand extends Command{

    private Robot robot;

    public DefaultDriveCommand(Robot robot){
        this.robot = robot;
        requires(robot.DriveSubsystem);
    }

    public void execute(){

    }

    public boolean isFinished(){
        return false;
    }


}