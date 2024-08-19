package boardgame;

public class Position {
	private int row;
	private int column;

	public Position(int row, int color) {
		super();
		this.row = row;
		this.column = color;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int color) {
		this.column = color;
	}

	@Override
	public String toString() {
		return row + "," + column;
	}
	public void setValues(int row,int column) {
		this.row=row;
		this.column=column;
	}

}
