/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.highlineschools.frc;

/**
 *
 * @author Tim
 */
public class Constants {
    /*
     * The port for the left joystick
     */
    public static final int LEFT_JOYSTICK_PORT = 1;
    /*
     * The port for the right joystick
     */
    public static final int RIGHT_JOYSTICK_PORT = 2;
    
    /*
     * The number of buttons on the left joystick
     */
    public static final int MAX_LEFT_JOYSTICK_BUTTONS = 5;
    /*
     * The number of buttons on the right joystick
     */
    public static final int MAX_RIGHT_JOYSTICK_BUTTONS = 5;
    
    /*
     * The ports used by the victor drive controllers for the left side of the robot
     */
    public static final int[] LEFT_SIDE_VICTOR_PORTS = { 1, 7 };
    
    /*
     * The ports used by the victor drive controllers for the right side of the robot
     */
    public static final int[] RIGHT_SIDE_VICTOR_PORTS = { 2, 3 };
    
    /*
     * Multiplier applied to speeds set on the left side
     */
    public static final double LEFT_SIDE_SPEED_MULTIPLIER = -1.0;
    
    /*
     * Multiplier applied to speeds set on the right side
     */
    public static final double RIGHT_SIDE_SPEED_MULTIPLIER = 1.0;
}
