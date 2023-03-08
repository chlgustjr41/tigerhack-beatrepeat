package round;

import java.util.ArrayList;
import java.util.Collections;

public class MultipleChoices 
{
	private final int NUMBER_OF_CHOICES = 4;
	
	private ArrayList<Grid> choices;
	
	private int[] getRandomInt(int maximumOfANumber, int numberOfRandomNumbers)
	{
		int[] randomNumbers = new int[numberOfRandomNumbers];
		for(int index = 0; index < randomNumbers.length; index++)
		{
			randomNumbers[index] = (int)(Math.random()*(((maximumOfANumber-1)-0)+1))+0; // 0 is the minimum index so maximumOfANumber-1
		}
		return randomNumbers.clone();
	}
	
	private Grid getRandomPicture(int row, int column)
	{
		return new Grid(row, column, getRandomInt(row, column));
	}
	
	public MultipleChoices(Question answer)
	{
		this.choices = new ArrayList<>();
		this.choices.add(answer.getPicture());
		
		for(int choiceIndex = 1; choiceIndex < NUMBER_OF_CHOICES; choiceIndex++)
		{
			this.choices.add(getRandomPicture(answer.getRow(), answer.getColumn()));
		}
		Collections.shuffle(choices);
	}
	
	public ArrayList<Grid> getChoices()
	{
		return this.choices;
	}
	public int getNumberOfChoices()
	{
		return this.NUMBER_OF_CHOICES;
	}
}
