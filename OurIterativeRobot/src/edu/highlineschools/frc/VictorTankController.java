/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.highlineschools.frc;

import edu.wpi.first.wpilibj.Victor;

/**
 *
 * @author Tim
 */
public class VictorTankController {
    Victor[] leftSideControllers = new Victor[Constants.LEFT_SIDE_VICTOR_PORTS.length];
    Victor[] rightSideControllers = new Victor[Constants.RIGHT_SIDE_VICTOR_PORTS.length];
    
    public VictorTankController() {
        for (int i = 0; i < this.leftSideControllers.length; i++) {
            this.leftSideControllers[i] = new Victor(Constants.LEFT_SIDE_VICTOR_PORTS[i]);
        }
        
        for (int i = 0; i < this.rightSideControllers.length; i++) {
            this.rightSideControllers[i] = new Victor(Constants.RIGHT_SIDE_VICTOR_PORTS[i]);
        }
    }
    
    /*
     * Sets the speed for the left side of the robot
     */
    public void SetLeftSideSpeed(double speed) {
        for (int i = 0; i < this.leftSideControllers.length; i++) {
            this.leftSideControllers[i].set(speed * Constants.LEFT_SIDE_SPEED_MULTIPLIER);
        }
    }
    
    /*
     * Sets the speed for the right side of the robot
     */
    public void SetRightSideSpeed(double speed) {
        for (int i = 0; i < this.rightSideControllers.length; i++) {
            this.rightSideControllers[i].set(speed * Constants.RIGHT_SIDE_SPEED_MULTIPLIER);
        }
    }
}
