package Sherief.Spring2021.Assignment1;

public class SoloActs {
	 private String soloact;

	public String getSolo() {
		return soloact;
	}
	
	public void setSolo(String uniqueSolo) {
		this.soloact = uniqueSolo;
	}
	
	 
	 
}


//Guitar solos implementation

class TwoGuitarSolo extends SoloActs{
	TwoGuitarSolo(){//Constructor and what happens when this object gets initalized
		this.setSolo("Play two Guitars");
	}
	
	
}

class SingAndPlay extends SoloActs{
	SingAndPlay(){
		this.setSolo("Sing and play");
	}
	
}
	
class RapAndPlay extends SoloActs{
	RapAndPlay(){
		this.setSolo("Rap and play");
	}
	
}

class DanceAndPlay extends SoloActs{
	DanceAndPlay(){
		this.setSolo("Dance and play");
	}
	
}

	
	
