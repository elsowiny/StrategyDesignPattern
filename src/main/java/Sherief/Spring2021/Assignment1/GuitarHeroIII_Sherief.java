/*
SHERIEF ELSOWINY

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
package Sherief.Spring2021.Assignment1;

/**
 *
 * @author sherief elsowiny
 */
public class GuitarHeroIII_Sherief {

    private static String Guitar;

	public static void main(String[] args) {
		
		//character can pick guitar and solo at runtime
		//otherwise the default is a solo of dancing and singing & guitar = bmgspecial
		
        GameCharacter player1 = new GameCharacterHicks();
        Guitar myGuitar = new BMGSpecial();
        SoloActs player1solo = new SingAndPlay();

        player1.setGuitar(myGuitar);
        player1.setSolo(player1solo);
        
        player1.playGuitar();
        player1.playAct();
        
        GameCharacter player2 = new GameCharacterNirvana();
        SoloActs mySolo = new RapAndPlay();
        Guitar player2Guitar = new GibsonFlying();
        player2.setGuitar(player2Guitar);
        player2.setSolo(mySolo);
        player2.playGuitar();
        player2.playAct();
    }// main

}
