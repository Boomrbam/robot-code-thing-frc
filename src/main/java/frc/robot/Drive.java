package frc.robot;



import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Drive extends SubsystemBase{
  
  public RobotContainer m_robotContainer;
  public Command m_autonomousCommand;
  private final Joystick m_stick = new Joystick(0);
  

  Spark m_frontright = new Spark(3);
  Spark m_rearright = new Spark(2);
  MotorControllerGroup m_right = new MotorControllerGroup(m_frontright, m_rearright);

  Spark m_frontleft = new Spark(0);

  MotorControllerGroup m_left = new MotorControllerGroup(m_frontleft); 

  public void robotInit() {;
    m_robotContainer = new RobotContainer();
  }

  DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);

  public void drive(){
    m_drive.arcadeDrive(m_stick.getX(), -m_stick.getY());
  }

}