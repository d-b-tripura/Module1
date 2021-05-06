package day4.task1;

public class MusicSystem {
	private boolean musicSys;
	private String fuel;
	
	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	

	public MusicSystem(String fuel) {
		this.fuel = fuel;
	}

	public boolean isMusicSys() {
		return musicSys;
	}

	public void setMusicSys(boolean musicSys) {
		this.musicSys = musicSys;
	}
	
	public boolean fuelKind() {
		if(fuel.equals("petrol"))
		{
			musicSys = true;
			return musicSys;
		}
		else if(fuel.equals("diesel"))
		{
			musicSys = true;
			return musicSys;
		}
		else if(fuel.equals("cng"))
		{
			musicSys = false;
			return musicSys;
		}
		else 
		{
			musicSys = false;
			return musicSys;
		}
	}

}
