package board;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Board {
	
	private int rows;
	private int columns;
	
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	
}
