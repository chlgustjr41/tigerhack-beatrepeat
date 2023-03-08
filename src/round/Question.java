package round;

public class Question 
{
	private final String instruction = "Listen carefully...";
	
	private int row;
	private int column;
	private Grid picture;
	
	public Question(int row, int column, int[] randomIntArray)
	{
		this.row = row;
		this.column = column;
		
		this.picture = new Grid(row, column, randomIntArray);
	}
	
	public int getRow()
	{
		return this.row;
	}

	public int getColumn()
	{
		return this.column;
	}
	
	public String getInstruction()
	{
		return this.instruction;
	}
	
	public Grid getPicture()
	{
		return this.picture;
	}
}
