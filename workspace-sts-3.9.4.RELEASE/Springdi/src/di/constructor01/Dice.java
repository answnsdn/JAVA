package di.constructor01;

import java.util.Random;
public class Dice extends Random implements AbstractDice{
	/* (non-Javadoc)
	 * @see di.constructor01.AbstractDice#getDiceValue()
	 */
	public int getDiceValue(){
		return nextInt(6)+1;
	}
}
