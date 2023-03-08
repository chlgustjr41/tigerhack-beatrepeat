package round;

import java.awt.Color;

public class Grid 
{
	public static final Color[] COLORS = {Color.RED, Color.ORANGE,
									Color.YELLOW, Color.GREEN,
									Color.BLUE, Color.MAGENTA};
	public static final Color DEFAULT_COLOR = Color.GRAY;
	
	private Tile[][] tiles;
	private int[] selection;
	
	private void setTilesColor()
	{
		for(int tileColumn = 0; tileColumn < this.tiles[0].length; tileColumn++) // all rows have same number of columns including row index 0
		{
			for(int tileRow = 0; tileRow < this.tiles.length; tileRow++)
			{
				if(tileRow == selection[tileColumn])
				{
					tiles[tileRow][tileColumn] = new Tile(COLORS[tileRow]);
				}
				else
				{
					tiles[tileRow][tileColumn] = new Tile(DEFAULT_COLOR);
				}
			}
		}
	}
	
	public Grid(int row, int column, int[] selection)
	{
		this.tiles = new Tile[row][column];
		this.selection = selection;
		setTilesColor();
	}
	
	public Tile[][] getTileColor()
	{
		return tiles;
	}
	
	public String toString()
	{
		String toString = "";
		for(int index = 0; index < selection.length; index++)
		{
			toString += selection[index];
		}
		return toString;
	}
}
