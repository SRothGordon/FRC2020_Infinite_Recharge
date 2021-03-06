package frc.robot.subsystem.scoring.shooter.ball_management;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.config.Config;
import frc.robot.subsystem.BitBucketSubsystem;
import frc.robot.subsystem.scoring.shooter.ShooterSubsystem;
import frc.robot.utils.talonutils.MotorUtils;

public class BallManagementSubsystem extends BitBucketSubsystem {

    //////////////////////////////////////////////////////////////////////////////
    // Variables

    //////////////////////////////////////////////////////////////////////////////
    // Motors

    // Talons
    WPI_TalonSRX motor;

    //////////////////////////////////////////////////////////////////////////////
    // Methods

    public BallManagementSubsystem(Config config) {
        super(config);
        // TODO Auto-generated constructor stub
    }

    public void initialize() {
        super.initialize();
        motor = MotorUtils.makeSRX(config.ballManagement.spinner);
    }

    public void testInit() {

    }

    public void testPeriodic() {

    }

    public void diagnosticsCheck() {

    }

    @Override
    public void periodic() {
        updateBaseDashboard();
    }

    @Override
    public void periodic(float deltaTime) {
        // TODO Auto-generated method stub

    }

    /**
     * 
     * @param rate How rapidly should we give balls to the feeder?
     */
    public void fire(float rate) {

        motor.set(ControlMode.PercentOutput, rate);
        // Because you can neva 'ave enuf dakka!
        SmartDashboard.putString(getName() + "/State",
                "DAKKADAKKADAKKADAKKADAKKDAKKADAKKADAKKADAKKADAKKADAKKADAKKDAKKADAKKADAKKADAKKADAKKADAKKADAKKDAKKADAKKADAKKADAKKADAKKADAKKADAKKDAKKADAKKA");
    }

    public void doNotFire() {
        motor.set(0);
        SmartDashboard.putString(getName() + "/State", "Doing nothing");
    }

    @Override
    public void dashboardPeriodic(float deltaTime) {
        // TODO Auto-generated method stub

    }
}