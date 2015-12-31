import javax.swing.plaf.synth.SynthSpinnerUI;

public class EmPIreClient
{
	private static VerySimpleServer serv;
	private static GPIO gpio;
	
	public static void main(String[] args)
	{
		int port = Integer.parseInt(args[0]);
		System.out.println("Starting GPIO ...");
		try
		{
			gpio = new GPIO();
			System.out.println("Success. Setting up server with port " + port + " ...");
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Ready.");
		
		addToggleListener(2, 1);
		
		serv = new VerySimpleServer(port);		
	}
	
	public static void handleConnectionInput(String bytes_read)
	{
		int whitespaceInd = bytes_read.indexOf(' ') + 1;
		System.out.println("Received bytes: " + bytes_read + ".");
		if(bytes_read.toUpperCase().startsWith("ON"))
		{			
			gpio.turnOnGPIO(Integer.parseInt(bytes_read.substring(whitespaceInd, whitespaceInd + 1)));
		}
		else if(bytes_read.toUpperCase().startsWith("OFF"))
		{
			gpio.turnOffGPIO(Integer.parseInt(bytes_read.substring(whitespaceInd, whitespaceInd + 1)));
		}
		else if(bytes_read.toUpperCase().startsWith("TOGGLE"))
		{
			gpio.toggleGPIO(Integer.parseInt(bytes_read.substring(whitespaceInd, whitespaceInd + 1)));
		}
	}

	private static void addToggleListener(int listenToPin, int togglePin)
	{
		new Thread(new PinCheckThread(gpio, listenToPin, togglePin)).start();
	}
}
