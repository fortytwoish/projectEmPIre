import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;

public class PinCheckThread implements Runnable
{
	private GPIO GPIOtoCheck;
	private int pinIndexToCheck;
	private int pinIndexToToggle;
	
	PinState pinState;
	
	public PinCheckThread(GPIO GPIOtoCheck, int pinIndexToCheck, int pinIndexToToggle)
	{
		this.GPIOtoCheck = GPIOtoCheck;
		this.pinIndexToCheck = pinIndexToCheck;
		this.pinIndexToToggle = pinIndexToToggle;
		pinState = PinState.LOW;
	}
	
	@Override
	public void run()
	{
		for(;;)
		{
			if(pinState == pinState.LOW && GPIOtoCheck.isOn(pinIndexToCheck))
			{
				GPIOtoCheck.toggleGPIO(pinIndexToToggle);
				pinState = PinState.HIGH;
			}
			pinState = GPIOtoCheck.getPinState(pinIndexToCheck);
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e){}
		}
		
	}

}
