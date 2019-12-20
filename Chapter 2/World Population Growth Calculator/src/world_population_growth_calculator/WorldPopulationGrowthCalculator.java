package world_population_growth_calculator;

/*
 * Jason Matthew Wiley
 * 12/12/2019
 * World Population Growth Calculator Application
 * 
 * 7,750,177,000
 * 1.2% growth rate yearly
 * 
 * Use the web to determine the current world population and the annual world population 
 * growth rate. Write an application that inputs these values, then displays the 
 * estimated world population after one, two, three, four and five years.
 */

public class WorldPopulationGrowthCalculator 
{
	public static void main(String[] args) 
	{
		//declared variables _growthRate = 1.2, _currentPopulation = 7.8
		double _growthRate = .012;
		double _currentPopulation = 7.8;
		
		//calculate (_currentPopulation * _growthRate) + _currentPopulation and store in variable _cuurentPopulation
		_currentPopulation = (_currentPopulation * _growthRate) + _currentPopulation;
		//print to user After One Year: _currentPopulation billion
		System.out.printf("After One Year: %.01f billion\n", _currentPopulation);
		
		//calculate (_currentPopulation * _growthRate) + _currentPopulation and store in variable _cuurentPopulation
		_currentPopulation = (_currentPopulation * _growthRate) + _currentPopulation;
		//print to user After Two Years: _currentPopulation billion
		System.out.printf("After Two Years: %.01f billion\n", _currentPopulation);
		
		//calculate (_currentPopulation * _growthRate) + _currentPopulation and store in variable _cuurentPopulation
		_currentPopulation = (_currentPopulation * _growthRate) + _currentPopulation;
		//print to user After Three Years: _currentPopulation billion
		System.out.printf("After Three Years: %.01f billion\n", _currentPopulation);
		
		//calculate (_currentPopulation * _growthRate) + _currentPopulation and store in variable _cuurentPopulation
		_currentPopulation = (_currentPopulation * _growthRate) + _currentPopulation;
		//print to user After Four Years: _currentPopulation billion
		System.out.printf("After Four Years: %.01f billion\n", _currentPopulation);
		
		//calculate (_currentPopulation * _growthRate) + _currentPopulation and store in variable _cuurentPopulation
		_currentPopulation = (_currentPopulation * _growthRate) + _currentPopulation;
		//print to user After Five Years: _currentPopulation billion
		System.out.printf("After Five Years: %.01f billion", _currentPopulation);
	}
}