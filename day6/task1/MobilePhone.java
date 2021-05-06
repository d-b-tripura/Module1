package day6.task1;

public class MobilePhone extends ElectronicDevice implements Wifi,Bluetooth, Flashlight{

	@Override
	public void doSwitchOn() {
		
		// --- how to switch on mobile phone 
		System.out.println("Mobile Sitched on");
	}

	@Override
	public void doSwitchOff() {
		System.out.println("Mobile Sitched off");
		
	}

	@Override
	public void doConnection() {
		// TODO Auto-generated method stub
		System.out.println("Connected to Wifi");
		
	}

	
	
	@Override
	public void doBluetoothConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSHareFiles() {
		// TODO Auto-generated method stub
		
	}

	public void doCalling()
	{
		System.out.println("Calling...Ringing");
	}

	@Override
	public void doOnFlashlight() {
		// TODO Auto-generated method stub
		System.out.println("Flashlight on");
		
	}

	@Override
	public void doOffFlashlight() {
		// TODO Auto-generated method stub
		System.out.println("Flashlight off");
		
	}
	
	
}