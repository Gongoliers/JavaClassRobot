// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc5112.JavaClassRobot.subsystems;

import org.usfirst.frc5112.JavaClassRobot.RobotMap;
import org.usfirst.frc5112.JavaClassRobot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	private final SpeedController leftFrontMotor = RobotMap.driveTrainLeftFrontMotor;
	private final SpeedController rightFrontMotor = RobotMap.driveTrainRightFrontMotor;
	private final SpeedController leftRearMotor = RobotMap.driveTrainLeftRearMotor;
	private final SpeedController rearRightMotor = RobotMap.driveTrainRearRightMotor;
	private final RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		setDefaultCommand(new OperateDriveTrain());

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void stop() {
		robotDrive.drive(0, 0);
	}

	public void left(double speed) {
		robotDrive.mecanumDrive_Cartesian(-speed, 0, 0, 0);
	}

	public void right(double speed) {
		robotDrive.mecanumDrive_Cartesian(speed, 0, 0, 0);
	}

	public void forward(double speed) {
		robotDrive.mecanumDrive_Cartesian(0, -speed, 0, 0);
	}

	public void backward(double speed) {
		robotDrive.mecanumDrive_Cartesian(0, speed, 0, 0);
	}

	public void rotateCW(double speed) {
		robotDrive.mecanumDrive_Cartesian(0, 0, speed, 0);
	}

	public void rotateCCW(double speed) {
		robotDrive.mecanumDrive_Cartesian(0, 0, -speed, 0);
	}

	public void operate(Joystick stick) {
		robotDrive.mecanumDrive_Cartesian(stick.getX(), stick.getY(), stick.getZ(), 0);
	}
}
