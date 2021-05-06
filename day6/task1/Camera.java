package day6.task1;

public class Camera extends ElectronicDevice implements Bluetooth, Flashlight{

	
	
	@Override
	public void doBluetoothConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSHareFiles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doSwitchOn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSwitchOff() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doOnFlashlight() {
		// TODO Auto-generated method stub
		System.out.println("Flash Light on");
		
	}

	@Override
	public void doOffFlashlight() {
		// TODO Auto-generated method stub
		System.out.println("Flash light off");
	}

}