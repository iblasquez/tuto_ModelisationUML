package fr.unilim.iut.refactoringExemple;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addRental(Rental rental) {
		this.rentals.add(rental);
	}

	public String statement() {

		double totalAmount = 0;

		String result = "Rental Record for " + this.getName() + "\n";

		for (Rental each : rentals) {

			double thisAmount = 0;

			// determine amounts for each line
			switch (each.getMovie().getPriceCode()) {
			case Movie.REGULAR:
				thisAmount += 2;
				if (each.getDaysRented() > 2) {
					thisAmount += (each.getDaysRented() - 2) * 1.5;
				}
				break;
			case Movie.NEW_RELEASE:
				thisAmount += each.getDaysRented() * 3;
				break;
			}
			// show figures for this rental
			result += "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";
			totalAmount += thisAmount;
		}
		// add footer lines
		result += "Amount owed is " + totalAmount + "\n";
		return result;
	}
}
