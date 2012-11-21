package com.hireright.jbehavereport;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class GridSteps
{
	private Game game;

	@Given("a $width by $height game")
	@Aliases(values = { "a new game: $width by $height" })
	public void theGameIsRunning(int width, int height)
	{
		game = new Game(width, height);
	}

	@When("I toggle the cell at ($column, $row)")
	public void iToggleTheCellAt(int column, int row)
	{
		game.toggleCellAt(column, row);
	}

	@When("And Test")
	public void andTest()
	{
		System.out.println("And Test");
	}

	@Then("the grid should    look   like $grid")
	@Aliases(values = { "the grid should be $grid" })
	public void theGridShouldLookLike(String grid)
	{
		assertThat(game.toString(), equalTo(grid));
	}

}