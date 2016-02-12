package iut.unilim.fr.refactoring;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String name;
	private Vector<Rental> rentals = new Vector<Rental>();

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
		Enumeration enumeratedRentals = rentals.elements();
		String result = "Rental Record for " + this.getName() + "\n";
		while (enumeratedRentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = (Rental) enumeratedRentals.nextElement();
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
