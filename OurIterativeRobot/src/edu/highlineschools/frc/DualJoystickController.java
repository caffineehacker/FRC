/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.highlineschools.frc;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 *
 * @author Tim
 */
public class DualJoystickController {
    Joystick leftJoystick;
    Joystick rightJoystick;
    JoystickButton[] leftButtons = new JoystickButton[Constants.MAX_LEFT_JOYSTICK_BUTTONS];
    JoystickButton[] rightButtons = new JoystickButton[Constants.MAX_RIGHT_JOYSTICK_BUTTONS];
    
    public DualJoystickController() {
        this.leftJoystick = new Joystick(Constants.LEFT_JOYSTICK_PORT);
        this.rightJoystick = new Joystick(Constants.RIGHT_JOYSTICK_PORT);
        
        for (int i = 0; i < Constants.MAX_LEFT_JOYSTICK_BUTTONS; i++) {
            this.leftButtons[i] = new JoystickButton(this.leftJoystick, i);
        }
        
        for (int i = 0; i < Constants.MAX_RIGHT_JOYSTICK_BUTTONS; i++) {
            this.rightButtons[i] = new JoystickButton(this.rightJoystick, i);
        }
    }
    
    /*
     * Returns the left joystick
     */
    public Joystick GetLeftJoystick() {
        return this.leftJoystick;
    }
    
    /*
     * Returns the right joystick
     */
    public Joystick GetRightJoystick() {
        return this.rightJoystick;
    }
    
    /*
     * Returns true if the provided button number is pressed on the left joystick. Returns false if the number doesn't exist
     */
    public boolean IsLeftButtonPressed(int buttonNumber) {
        if (buttonNumber < 0 || buttonNumber >= Constants.MAX_LEFT_JOYSTICK_BUTTONS)
            return false;
        
        if (this.leftButtons[buttonNumber - 1].get())
            return true;
        
        return false;
    }
    
    /*
     * Returns true if the provided button number is pressed on the left joystick. Returns false if the number doesn't exist
     */
    public boolean IsRightButtonPressed(int buttonNumber) {
        if (buttonNumber < 0 || buttonNumber >= Constants.MAX_RIGHT_JOYSTICK_BUTTONS)
            return false;
        
        if (this.rightButtons[buttonNumber - 1].get())
            return true;
        
        return false;
    }
    
    /*
     * Gets the distance the left joystick is pushed in the Y direction
     */
    public double GetLeftJoystickY() {
        return this.leftJoystick.getAxis(Joystick.AxisType.kY);
    }
    
    /*
     * Gets the distance the right joystick is pushed in the Y direction
     */
    public double GetRightJoystickY() {
        return this.rightJoystick.getAxis(Joystick.AxisType.kY);
    }
}
