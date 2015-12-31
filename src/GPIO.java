

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListener;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

public class GPIO
{
	private GpioPinDigitalOutput[] GPIOs = new GpioPinDigitalOutput[30];

	public GPIO() throws InterruptedException
	    {
	        final GpioController gpio = GpioFactory.getInstance();
	        
	        System.out.println("TESTMASTER5458");
	        
//	        GPIOs[0]  = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "", PinState.LOW);
	        GPIOs[1]  = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "", PinState.LOW);
	        GPIOs[2]  = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "", PinState.LOW);
//	        GPIOs[3]  = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03, "", PinState.LOW);
//	        GPIOs[4]  = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, "", PinState.LOW);
//	        GPIOs[5]  = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, "", PinState.LOW);
//	        GPIOs[6]  = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06, "", PinState.LOW);
//	        GPIOs[7]  = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, "", PinState.LOW);
//	        GPIOs[8]  = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_08, "", PinState.LOW);
//	        GPIOs[9]  = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_09, "", PinState.LOW);
//	        GPIOs[10] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_10, "", PinState.LOW);
//	        GPIOs[11] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_11, "", PinState.LOW);
//	        GPIOs[12] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_12, "", PinState.LOW);
//	        GPIOs[13] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_13, "", PinState.LOW);
//	        GPIOs[14] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_14, "", PinState.LOW);
//	        GPIOs[15] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_15, "", PinState.LOW);
//	        GPIOs[16] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_16, "", PinState.LOW);
//	        GPIOs[17] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_17, "", PinState.LOW);
//	        GPIOs[18] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_18, "", PinState.LOW);
//	        GPIOs[19] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_19, "", PinState.LOW);
//	        GPIOs[20] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_20, "", PinState.LOW);
//	        GPIOs[21] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_21, "", PinState.LOW);
//	        GPIOs[22] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_22, "", PinState.LOW);
//	        GPIOs[23] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_23, "", PinState.LOW);
//	        GPIOs[24] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_24, "", PinState.LOW);
//	        GPIOs[25] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_25, "", PinState.LOW);
//	        GPIOs[26] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_26, "", PinState.LOW);
//	        GPIOs[27] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_27, "", PinState.LOW);
//	        GPIOs[28] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_28, "", PinState.LOW);
//	        GPIOs[29] = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_29, "", PinState.LOW);
	    }

	public void turnOnGPIO(int pin)
	{
		GPIOs[pin].high();
	}

	public void turnOffGPIO(int pin)
	{
		GPIOs[pin].low();
	}

	public void toggleGPIO(int pin)
	{
		GPIOs[pin].toggle();
	}
	
	public boolean isOn(int pin)
	{
		return GPIOs[pin].getState() == PinState.HIGH;
	}
	
	public PinState getPinState(int pin)
	{
		return GPIOs[pin].getState();
	}
	
	
}
