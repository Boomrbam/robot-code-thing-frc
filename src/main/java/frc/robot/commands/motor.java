package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class motor extends CommandBase {
   @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
   

    @Override
     public void execute() {
         super.execute();
         // pull = new Spark(1);
         RobotContainer.pull.set(0.5);
         System.out.println("work");
     }

     public void end(boolean interrupted){
         RobotContainer.pull.set(0.0);
         System.out.println("done");
         super.end(interrupted);
     }
    
}