package round;

public class FreeTile 
{
	private int row;
	private int column;
	private Grid picture;
	
	public FreeTile(int row, int column)
	{
		this.row = row;
		this.column = column;
		// picture is not initialized at all
	}
	
	public int getRow()
	{
		return this.row;
	}

	public int getColumn()
	{
		return this.column;
	}
	
	public Grid getPicture()
	{
		return this.picture;
	}
	
	public void setPicture(int[] userChoiceIntArray)
	{
		this.picture = new Grid(this.row, this.column, userChoiceIntArray);
	}
}
