package com.hireright.jbehavereport;

public class Game
{

	private int[][] grid;

	public Game(int row, int column)
	{
		this.grid = new int[row][column];
	}

	public void toggleCellAt(int column, int row)
	{
		// System.out.println("before:" + grid[row][column]);
		grid[row][column] ^= 1;
		// System.out.println("after:" + grid[row][column]);
	}

	@Override
	public String toString()
	{
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[i].length; j++)
			{
				res.append(grid[i][j] == 0 ? '.' : 'X');
			}

			res.append(i + 1 == grid.length ? "" : "\r\n");
		}

		return res.toString();
	}
}
