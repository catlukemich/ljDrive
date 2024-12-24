package game.tables;


// state machine input struct (from external file, etc.)
// Finite sTate mAchine --> FTA

public class AirportFTAbuildup
{

	public final int position;						// the position that an airplane is at
	public final int heading;						// the current orders (eg. TAKEOFF, HANGAR, ENDLANDING, etc.)
	public final int block;							// the block this position is on on the airport (st->airport_flags)
	public final int next_in_chain;					// next position from this position

	public AirportFTAbuildup(int p, int h, int b, int n) {
		position      = p; //<-- Pos index of the block relative to the origin of the airport (???)
		heading       = h;
		block         = b; //<-- Block to display
		next_in_chain = n;
	}

}
