package round;

import java.io.File;
import java.util.ArrayList;

public class Notes
{
	private final int A = 0;
	private final int C = 1;
	private final int E = 2;
	private final int G = 3;
	private final int A_HIGH = 4;
	private final int C_HIGH = 5;
	
	private ArrayList<File> possibleNotes;
	
	private void importNotes(int numberOfNotes)
	{
		switch(numberOfNotes - 1) // the first note is 0
		{
		
		case C_HIGH:
			possibleNotes.add(new File("notesAudioFile/Piano.ff.Db5.WAV"));
		case A_HIGH:
			possibleNotes.add(new File("notesAudioFile/Piano.ff.A4.WAV"));
		case G:
			possibleNotes.add(new File("notesAudioFile/Piano.ff.G4.WAV"));
		case E:
			possibleNotes.add(new File("notesAudioFile/Piano.ff.E4.WAV"));
		case C:
			possibleNotes.add(new File("notesAudioFile/Piano.ff.Db4.WAV"));
		case A:
			possibleNotes.add(new File("notesAudioFile/Piano.ff.A3.WAV"));
		}
	}
	
	public Notes(int numberOfNotes) // the number of rows of the size
	{
		this.possibleNotes = new ArrayList<File>();
		importNotes(numberOfNotes);
	}
	
	public ArrayList<File> getNotes()
	{
		return this.possibleNotes;
	}
	
	public void closeFiles()
	{
		// close files
	}
}
