package Sherief.Spring2021.Assignment1;

public class Guitar {
	private String guitarStyle;

	public String getGuitarStyle() {
		
		//System.out.println( guitarStyle);
		return guitarStyle;
	}

	public void setGuitarStyle(String guitarStyle) {
		this.guitarStyle = guitarStyle;
	}


}




/*
The Guitar Hero III Game: Dinosaurs of Rock needs a new guitar player
configuration system. The Guitar Hero III Game lets you play eight different
characters (Smith, Collier, Denial, Hicks, Megan, John, Joe, Mary, and Thomas). 


Each character can use ONLY one of the two different guitars (either BMGSpecial
or GibsonFlying) to play as well as perform a unique solo act among the four
listed below:
•	Play two guitars simultaneously, 
•	Sing while playing a guitar, 
•	Rap while playing guitar, or 
•	Dance while playing a guitar
Make use of the Strategy Pattern to design and implement a player
configuration system using Java or C#. 
 */