package arrays101;

import java.util.Scanner;
public class SpeciesSecondTry {
	private String name;
	private int population;
	private double growthRate;

	public void setSpecies(String newName, int newPopulation, double newGrowthRate) {
		name = newName;
		if (newPopulation >= 0) 
		  population = newPopulation;
		else {
			System.out.println("ERROR: Using negative population.");
		}
		growthRate = newGrowthRate;
		
	}

	public String getName() {
		return name;
	
	}

	public int getPopulation() {
		return population;
		
	}
	public double getGrowthRate(){
		return growthRate;
	}
	public void readInput() {
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("What is the species'name?");
			name = keyboard.nextLine();
			System.out.println("What is the population of Species?");
			population = keyboard.nextInt();

			System.out.println("Enter growth rate (% increase per year):");
			growthRate = keyboard.nextDouble();
		}
	}

	public void writeOutput() {
		System.out.println("Name = " + name);
		System.out.println("Population = " + population);
		System.out.println("Growth rate = " + growthRate+"%");
	}
	public int predictPopulation(int years) {
    int result = 0;
    double populationAmount = population;
    int count = years;
    while ((count > 0) && (populationAmount > 0)){
			populationAmount = (populationAmount +  (growthRate / 100) * populationAmount);
			count--;
    }
    if (populationAmount > 0)
      result = (int)populationAmount;
    return result;
  }

	public static void main(String[] args) {
		SpeciesSecondTry speciesOfTheMonth = new SpeciesSecondTry();
    System.out.println("Enter number of years to project:");
    try (Scanner keyboard = new Scanner(System.in)) {
			int numberOfYears = keyboard.nextInt();
			System.out.println("Enter data on the Species of the Month:");
			speciesOfTheMonth.readInput();
			speciesOfTheMonth.writeOutput();
			int futurePopulation =
			speciesOfTheMonth.predictPopulation(numberOfYears);
			System.out.println("In " + numberOfYears + " years the population will be " + futurePopulation);
			//Change the species to show how to change
			//the values of instance variables:
			speciesOfTheMonth.setSpecies("Klingon ox", 10, 15);
			System.out.println("The new Species of the Month:");
			speciesOfTheMonth.writeOutput();
			futurePopulation =
			speciesOfTheMonth.predictPopulation(numberOfYears);
			System.out.println("In " + numberOfYears + " years the population will be " + futurePopulation);
		}
  }

}