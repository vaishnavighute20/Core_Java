package utils;
import com.custom_exception.SpeedOutOfRangeException;
public class VehicleValidationRules {

	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED=40;
		MAX_SPEED=80;
	}
	
	
	//add a static method to validate speed
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException{
		if(speed <MIN_SPEED)
			throw new SpeedOutOfRangeException("you are driving too slow!!");
		if(speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("you are driving too fast!!");
		System.out.println("speed within range");
	}
}
