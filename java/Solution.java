package roadmap.ArrayAndHashing.ValidSudoku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	public boolean isValidSudoku(char[][] board) {
		List<ArrayList<Position>> checks = initCheckGroups();
		
		for (List<Position> group: checks) {
			if (validateGroup(group, board) == false) {
				return false;
			}
		}
		
		return true;
	}
	
	boolean validateGroup(List<Position> group, char[][] inputs) {
		HashMap<Character, Integer> maps = new HashMap<Character, Integer>();
				
		maps.put(Character.valueOf('.'), Integer.valueOf(0));
		maps.put(Character.valueOf('1'), Integer.valueOf(0));
		maps.put(Character.valueOf('2'), Integer.valueOf(0));
		maps.put(Character.valueOf('3'), Integer.valueOf(0));
		maps.put(Character.valueOf('4'), Integer.valueOf(0));
		maps.put(Character.valueOf('5'), Integer.valueOf(0));
		maps.put(Character.valueOf('6'), Integer.valueOf(0));
		maps.put(Character.valueOf('7'), Integer.valueOf(0));
		maps.put(Character.valueOf('8'), Integer.valueOf(0));
		maps.put(Character.valueOf('9'), Integer.valueOf(0));
		
		for (Position position: group) {
			Character key = inputs[position.getRow()][position.getColumn()];
			
			if (key == '.') {
				continue;
			}
			Integer value = maps.get(key);
			if (value == null) {
				return false;
			}
			int intValue = value.intValue();
			maps.put(key,  Integer.valueOf(++intValue));
			
		}
		
		for (Integer value: maps.values()) {
			if (value.intValue() > 1) {
				return false;
			}
		}

		return true;
	}
	
	List<ArrayList<Position>> initCheckGroups() {
		List<ArrayList<Position>> res = new ArrayList<ArrayList<Position>>();
		
		ArrayList<Position> groupsRow1 = new ArrayList<Position>();
		groupsRow1.add(new Position(0, 0));
		groupsRow1.add(new Position(0, 1));
		groupsRow1.add(new Position(0, 2));
		groupsRow1.add(new Position(0, 3));
		groupsRow1.add(new Position(0, 4));
		groupsRow1.add(new Position(0, 5));
		groupsRow1.add(new Position(0, 6));
		groupsRow1.add(new Position(0, 7));
		groupsRow1.add(new Position(0, 8));
		res.add(groupsRow1);
		
		ArrayList<Position> groupsRow2 = new ArrayList<Position>();
		groupsRow2.add(new Position(1, 0));
		groupsRow2.add(new Position(1, 1));
		groupsRow2.add(new Position(1, 2));
		groupsRow2.add(new Position(1, 3));
		groupsRow2.add(new Position(1, 4));
		groupsRow2.add(new Position(1, 5));
		groupsRow2.add(new Position(1, 6));
		groupsRow2.add(new Position(1, 7));
		groupsRow2.add(new Position(1, 8));
		res.add(groupsRow2);
		
		ArrayList<Position> groupsRow3 = new ArrayList<Position>();
		groupsRow3.add(new Position(2, 0));
		groupsRow3.add(new Position(2, 1));
		groupsRow3.add(new Position(2, 2));
		groupsRow3.add(new Position(2, 3));
		groupsRow3.add(new Position(2, 4));
		groupsRow3.add(new Position(2, 5));
		groupsRow3.add(new Position(2, 6));
		groupsRow3.add(new Position(2, 7));
		groupsRow3.add(new Position(2, 8));
		res.add(groupsRow3);
		
		ArrayList<Position> groupsRow4 = new ArrayList<Position>();
		groupsRow4.add(new Position(3, 0));
		groupsRow4.add(new Position(3, 1));
		groupsRow4.add(new Position(3, 2));
		groupsRow4.add(new Position(3, 3));
		groupsRow4.add(new Position(3, 4));
		groupsRow4.add(new Position(3, 5));
		groupsRow4.add(new Position(3, 6));
		groupsRow4.add(new Position(3, 7));
		groupsRow4.add(new Position(3, 8));
		res.add(groupsRow4);
		
		ArrayList<Position> groupsRow5 = new ArrayList<Position>();
		groupsRow5.add(new Position(4, 0));
		groupsRow5.add(new Position(4, 1));
		groupsRow5.add(new Position(4, 2));
		groupsRow5.add(new Position(4, 3));
		groupsRow5.add(new Position(4, 4));
		groupsRow5.add(new Position(4, 5));
		groupsRow5.add(new Position(4, 6));
		groupsRow5.add(new Position(4, 7));
		groupsRow5.add(new Position(4, 8));
		res.add(groupsRow5);
		
		ArrayList<Position> groupsRow6 = new ArrayList<Position>();
		groupsRow6.add(new Position(5, 0));
		groupsRow6.add(new Position(5, 1));
		groupsRow6.add(new Position(5, 2));
		groupsRow6.add(new Position(5, 3));
		groupsRow6.add(new Position(5, 4));
		groupsRow6.add(new Position(5, 5));
		groupsRow6.add(new Position(5, 6));
		groupsRow6.add(new Position(5, 7));
		groupsRow6.add(new Position(5, 8));
		res.add(groupsRow6);
		
		ArrayList<Position> groupsRow7 = new ArrayList<Position>();
		groupsRow7.add(new Position(6, 0));
		groupsRow7.add(new Position(6, 1));
		groupsRow7.add(new Position(6, 2));
		groupsRow7.add(new Position(6, 3));
		groupsRow7.add(new Position(6, 4));
		groupsRow7.add(new Position(6, 5));
		groupsRow7.add(new Position(6, 6));
		groupsRow7.add(new Position(6, 7));
		groupsRow7.add(new Position(6, 8));
		res.add(groupsRow7);
		
		ArrayList<Position> groupsRow8 = new ArrayList<Position>();
		groupsRow8.add(new Position(7, 0));
		groupsRow8.add(new Position(7, 1));
		groupsRow8.add(new Position(7, 2));
		groupsRow8.add(new Position(7, 3));
		groupsRow8.add(new Position(7, 4));
		groupsRow8.add(new Position(7, 5));
		groupsRow8.add(new Position(7, 6));
		groupsRow8.add(new Position(7, 7));
		groupsRow8.add(new Position(7, 8));
		res.add(groupsRow8);
		
		ArrayList<Position> groupsRow9 = new ArrayList<Position>();
		groupsRow9.add(new Position(8, 0));
		groupsRow9.add(new Position(8, 1));
		groupsRow9.add(new Position(8, 2));
		groupsRow9.add(new Position(8, 3));
		groupsRow9.add(new Position(8, 4));
		groupsRow9.add(new Position(8, 5));
		groupsRow9.add(new Position(8, 6));
		groupsRow9.add(new Position(8, 7));
		groupsRow9.add(new Position(8, 8));
		res.add(groupsRow9);

		ArrayList<Position> groupsCol1 = new ArrayList<Position>();
		groupsCol1.add(new Position(0, 0));
		groupsCol1.add(new Position(1, 0));
		groupsCol1.add(new Position(2, 0));
		groupsCol1.add(new Position(2, 0));
		groupsCol1.add(new Position(4, 0));
		groupsCol1.add(new Position(5, 0));
		groupsCol1.add(new Position(6, 0));
		groupsCol1.add(new Position(7, 0));
		groupsCol1.add(new Position(8, 0));
		res.add(groupsCol1);
		
		ArrayList<Position> groupsCol2 = new ArrayList<Position>();
		groupsCol2.add(new Position(0, 1));
		groupsCol2.add(new Position(1, 1));
		groupsCol2.add(new Position(2, 1));
		groupsCol2.add(new Position(3, 1));
		groupsCol2.add(new Position(4, 1));
		groupsCol2.add(new Position(5, 1));
		groupsCol2.add(new Position(6, 1));
		groupsCol2.add(new Position(7, 1));
		groupsCol2.add(new Position(8, 1));
		res.add(groupsCol2);
		
		ArrayList<Position> groupsCol3 = new ArrayList<Position>();
		groupsCol3.add(new Position(0, 2));
		groupsCol3.add(new Position(1, 2));
		groupsCol3.add(new Position(2, 2));
		groupsCol3.add(new Position(3, 2));
		groupsCol3.add(new Position(4, 2));
		groupsCol3.add(new Position(5, 2));
		groupsCol3.add(new Position(6, 2));
		groupsCol3.add(new Position(7, 2));
		groupsCol3.add(new Position(8, 2));
		res.add(groupsCol3);

		ArrayList<Position> groupsCol4 = new ArrayList<Position>();
		groupsCol4.add(new Position(0, 3));
		groupsCol4.add(new Position(1, 3));
		groupsCol4.add(new Position(2, 3));
		groupsCol4.add(new Position(3, 3));
		groupsCol4.add(new Position(4, 3));
		groupsCol4.add(new Position(5, 3));
		groupsCol4.add(new Position(6, 3));
		groupsCol4.add(new Position(7, 3));
		groupsCol4.add(new Position(8, 3));
		res.add(groupsCol4);
		
		ArrayList<Position> groupsCol5 = new ArrayList<Position>();
		groupsCol5.add(new Position(0, 4));
		groupsCol5.add(new Position(1, 4));
		groupsCol5.add(new Position(2, 4));
		groupsCol5.add(new Position(3, 4));
		groupsCol5.add(new Position(4, 4));
		groupsCol5.add(new Position(5, 4));
		groupsCol5.add(new Position(6, 4));
		groupsCol5.add(new Position(7, 4));
		groupsCol5.add(new Position(8, 4));
		res.add(groupsCol5);
		
		ArrayList<Position> groupsCol6 = new ArrayList<Position>();
		groupsCol6.add(new Position(0, 5));
		groupsCol6.add(new Position(1, 5));
		groupsCol6.add(new Position(2, 5));
		groupsCol6.add(new Position(3, 5));
		groupsCol6.add(new Position(4, 5));
		groupsCol6.add(new Position(5, 5));
		groupsCol6.add(new Position(6, 5));
		groupsCol6.add(new Position(7, 5));
		groupsCol6.add(new Position(8, 5));
		res.add(groupsCol6);
		
		ArrayList<Position> groupsCol7 = new ArrayList<Position>();
		groupsCol7.add(new Position(0, 6));
		groupsCol7.add(new Position(1, 6));
		groupsCol7.add(new Position(2, 6));
		groupsCol7.add(new Position(3, 6));
		groupsCol7.add(new Position(4, 6));
		groupsCol7.add(new Position(5, 6));
		groupsCol7.add(new Position(6, 6));
		groupsCol7.add(new Position(7, 6));
		groupsCol7.add(new Position(8, 6));
		res.add(groupsCol7);

		ArrayList<Position> groupsCol8 = new ArrayList<Position>();
		groupsCol8.add(new Position(0, 7));
		groupsCol8.add(new Position(1, 7));
		groupsCol8.add(new Position(2, 7));
		groupsCol8.add(new Position(3, 7));
		groupsCol8.add(new Position(4, 7));
		groupsCol8.add(new Position(5, 7));
		groupsCol8.add(new Position(6, 7));
		groupsCol8.add(new Position(7, 7));
		groupsCol8.add(new Position(8, 7));
		res.add(groupsCol8);

		ArrayList<Position> groupsCol9 = new ArrayList<Position>();
		groupsCol9.add(new Position(0, 8));
		groupsCol9.add(new Position(1, 8));
		groupsCol9.add(new Position(2, 8));
		groupsCol9.add(new Position(3, 8));
		groupsCol9.add(new Position(4, 8));
		groupsCol9.add(new Position(5, 8));
		groupsCol9.add(new Position(6, 8));
		groupsCol9.add(new Position(7, 8));
		groupsCol9.add(new Position(8, 8));
		res.add(groupsCol9);

		ArrayList<Position> groupBox1 = new ArrayList<Position>();
		groupBox1.add(new Position(0, 0));
		groupBox1.add(new Position(0, 1));
		groupBox1.add(new Position(0, 2));
		groupBox1.add(new Position(1, 0));
		groupBox1.add(new Position(1, 1));
		groupBox1.add(new Position(1, 2));
		groupBox1.add(new Position(2, 0));
		groupBox1.add(new Position(2, 1));
		groupBox1.add(new Position(2, 2));
		res.add(groupBox1);
		
		ArrayList<Position> groupBox2 = new ArrayList<Position>();
		groupBox2.add(new Position(0, 3));
		groupBox2.add(new Position(0, 4));
		groupBox2.add(new Position(0, 5));
		groupBox2.add(new Position(1, 3));
		groupBox2.add(new Position(1, 4));
		groupBox2.add(new Position(1, 5));
		groupBox2.add(new Position(2, 3));
		groupBox2.add(new Position(2, 4));
		groupBox2.add(new Position(2, 5));
		res.add(groupBox2);

		ArrayList<Position> groupBox3 = new ArrayList<Position>();
		groupBox3.add(new Position(0, 6));
		groupBox3.add(new Position(0, 7));
		groupBox3.add(new Position(0, 8));
		groupBox3.add(new Position(1, 6));
		groupBox3.add(new Position(1, 7));
		groupBox3.add(new Position(1, 8));
		groupBox3.add(new Position(2, 6));
		groupBox3.add(new Position(2, 7));
		groupBox3.add(new Position(2, 8));
		res.add(groupBox3);

		ArrayList<Position> groupBox4 = new ArrayList<Position>();
		groupBox4.add(new Position(3, 0));
		groupBox4.add(new Position(3, 1));
		groupBox4.add(new Position(3, 2));
		groupBox4.add(new Position(4, 0));
		groupBox4.add(new Position(4, 1));
		groupBox4.add(new Position(4, 2));
		groupBox4.add(new Position(5, 0));
		groupBox4.add(new Position(5, 1));
		groupBox4.add(new Position(5, 2));
		res.add(groupBox4);
		
		ArrayList<Position> groupBox5 = new ArrayList<Position>();
		groupBox5.add(new Position(3, 3));
		groupBox5.add(new Position(3, 4));
		groupBox5.add(new Position(3, 5));
		groupBox5.add(new Position(4, 3));
		groupBox5.add(new Position(4, 4));
		groupBox5.add(new Position(4, 5));
		groupBox5.add(new Position(5, 3));
		groupBox5.add(new Position(5, 4));
		groupBox5.add(new Position(5, 5));
		res.add(groupBox5);
		
		ArrayList<Position> groupBox6 = new ArrayList<Position>();
		groupBox6.add(new Position(3, 6));
		groupBox6.add(new Position(3, 7));
		groupBox6.add(new Position(3, 8));
		groupBox6.add(new Position(4, 6));
		groupBox6.add(new Position(4, 7));
		groupBox6.add(new Position(4, 8));
		groupBox6.add(new Position(5, 6));
		groupBox6.add(new Position(5, 7));
		groupBox6.add(new Position(5, 8));
		res.add(groupBox6);

		ArrayList<Position> groupBox7 = new ArrayList<Position>();
		groupBox7.add(new Position(6, 0));
		groupBox7.add(new Position(6, 1));
		groupBox7.add(new Position(6, 2));
		groupBox7.add(new Position(7, 0));
		groupBox7.add(new Position(7, 1));
		groupBox7.add(new Position(7, 2));
		groupBox7.add(new Position(8, 0));
		groupBox7.add(new Position(8, 1));
		groupBox7.add(new Position(8, 2));
		res.add(groupBox7);
		
		ArrayList<Position> groupBox8 = new ArrayList<Position>();
		groupBox8.add(new Position(6, 3));
		groupBox8.add(new Position(6, 4));
		groupBox8.add(new Position(6, 5));
		groupBox8.add(new Position(7, 3));
		groupBox8.add(new Position(7, 4));
		groupBox8.add(new Position(7, 5));
		groupBox8.add(new Position(8, 3));
		groupBox8.add(new Position(8, 4));
		groupBox8.add(new Position(8, 5));
		res.add(groupBox8);
		
		ArrayList<Position> groupBox9 = new ArrayList<Position>();
		groupBox9.add(new Position(6, 6));
		groupBox9.add(new Position(6, 7));
		groupBox9.add(new Position(6, 8));
		groupBox9.add(new Position(7, 6));
		groupBox9.add(new Position(7, 7));
		groupBox9.add(new Position(7, 8));
		groupBox9.add(new Position(8, 6));
		groupBox9.add(new Position(8, 7));
		groupBox9.add(new Position(8, 8));
		res.add(groupBox9);

		return res;

	}
	
	public static void main(String[] args) {
		char[][] board1 = {
				{'1', '2', '.', '.', '3', '.', '.', '.', '.'},
				{'4', '.', '.', '5', '.', '.', '.', '.', '.'},
				{'.', '9', '8', '.', '.', '.', '.', '.', '3'},
				{'5', '.', '.', '.', '6', '.', '.', '.', '4'},
				{'.', '.', '.', '8', '.', '3', '.', '.', '5'},
				{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
				{'.', '.', '.', '.', '.', '.', '2', '.', '.'},
				{'.', '.', '.', '4', '1', '9', '.', '.', '8'},
				{'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
		
		Solution solution = new Solution();
		System.out.println(solution.isValidSudoku(board1));
				
		char[][] board2 = {
				{'1', '2', '.', '.', '3', '.', '.', '.', '.'},
				{'4', '.', '.', '5', '.', '.', '.', '.', '.'},
				{'.', '9', '1', '.', '.', '.', '.', '.', '3'},
				{'5', '.', '.', '.', '6', '.', '.', '.', '4'},
				{'.', '.', '.', '8', '.', '3', '.', '.', '5'},
				{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
				{'.', '.', '.', '.', '.', '.', '2', '.', '.'},
				{'.', '.', '.', '4', '1', '9', '.', '.', '8'},
				{'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
		
		
		System.out.println(solution.isValidSudoku(board2));
	}
}

class Position {
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	private int row;
	private int column;
}

