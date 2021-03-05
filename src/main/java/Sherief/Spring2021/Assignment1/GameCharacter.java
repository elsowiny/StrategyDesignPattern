package Sherief.Spring2021.Assignment1;

class GameCharacter{

	public SoloActs soloAct; //Each class has a soloact object
	public Guitar guitar; //each class has a guitar object
	
	public void playGuitar() {
		String guitarStyle = this.guitar.getGuitarStyle();
		System.out.println("Playing the " + guitarStyle );
		
	}

	public void playAct() {
		String soloAct = this.soloAct.getSolo();
		System.out.println("Watch me jam and watch me " + soloAct);
		
	}
	
	
	//change guitar here
	public void setGuitar(Guitar newGuitarType) {
		this.guitar = newGuitarType;
		
	}
	public void setSolo(SoloActs soloAct) {
		this.soloAct = soloAct;
		
	}



}



/*

(Smith, Collier, Denial, Hicks, Megan, John, Joe, Mary, and Thomas)
*/

class GameCharacterSmith extends GameCharacter{
		
}

class GameCharacterCollier extends GameCharacter{
	
}
class GameCharacterDenial extends GameCharacter{
	
}

class GameCharacterHicks extends GameCharacter{
	
}
class GameCharacterMegan extends GameCharacter{
	
}
class GameCharacterJohn extends GameCharacter{
	
}
class GameCharacterJoe extends GameCharacter{
	
}
class GameCharacterMary extends GameCharacter{
	
}
class GameCharacterThomas extends GameCharacter{
	
}
class GameCharacterNirvana extends GameCharacter {

}