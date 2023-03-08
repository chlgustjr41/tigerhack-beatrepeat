package round;

import java.awt.Color;
import java.io.File;

public class Round 
{
	public static int numberOfRounds = 0;
	
	private Notes notes;
	private Question question;
	private MultipleChoices multipleChoices;
	private FreeTile freeTile;
	private boolean freeTileInitialization;
	
	private int[] getRandomInt(int maximumOfANumber, int numberOfRandomNumbers)
	{
		int[] randomNumbers = new int[numberOfRandomNumbers];
		for(int index = 0; index < randomNumbers.length; index++)
		{
			randomNumbers[index] = (int)(Math.random()*(((maximumOfANumber-1)-0)+1))+0; // 0 is the minimum index so maximumOfANumber-1
		}
		return randomNumbers.clone();
	}
	
	public Round(int row, int column)
	{
		numberOfRounds++;
		this.notes = new Notes(row);
		this.question = new Question(row, column, getRandomInt(row, column));
		this.multipleChoices = new MultipleChoices(question);
		
		this.freeTileInitialization = false;
		this.freeTile = new FreeTile(question.getRow(), question.getColumn());
	}
	
	public int getRow()
	{
		return question.getRow();
	}
	public int getColumn()
	{
		return question.getColumn();
	}
	public File getNote(int noteIndex)
	{
		return notes.getNotes().get(noteIndex);
	}
	
	public int getNumberOfMultipleChoices()
	{
		return multipleChoices.getNumberOfChoices();
	}
	
	public Color getQuestionTileColor(int row, int column)
	{
		return question.getPicture().getTileColor()[row][column].getColor();
	}
	public Color getMultipleChoicesTileColor(int row, int column, int choiceIndex) // choiceIndex < 3
	{
		return multipleChoices.getChoices().get(choiceIndex).getTileColor()[row][column].getColor();
	}
	
	public String getQuestionPictureToString()
	{
		return this.question.getPicture().toString();
	}
	public String getMultipleChoicesPictureToString(int choiceIndex)
	{
		return this.multipleChoices.getChoices().get(choiceIndex).toString();
	}
	public String getFreeTilePictureToString()
	{
		if(this.freeTileInitialization != true)
		{
			System.out.println("Call setFreeTilePicture(int[] userChoiceIntArray) first");
		}
		else
		{
		return this.freeTile.getPicture().toString();
		}
		
		return "Error";
	}
	
	public void setFreeTilePicture(int[] userChoiceIntArray)
	{
		this.freeTile.setPicture(userChoiceIntArray);
		this.freeTileInitialization = true;
	}
	
	public void closeNotesFiles()
	{
		this.notes.closeFiles();
	}
}
