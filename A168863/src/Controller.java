
public class Controller {
	
	DiceGame diceGame = new DiceGame();
	private Die die1 = new Die();
	private Die die2 = new Die();
	
	public void runGame() {
		
		diceGame.play();
		new Screen2(this);

	}
	
	public int getFaceValueDie1() {
		return diceGame.getDie1().getFaceValue();
	}
	
	public int getFaceValueDie2() {
		return diceGame.getDie2().getFaceValue();
	}
	
	public String getResult() {
		return diceGame.getResult();
	}
	
}
