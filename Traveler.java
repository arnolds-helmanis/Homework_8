package Classes_And_Objects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Traveler {
	String name;
	private ArrayList<Integer> tripDistance = new ArrayList<Integer>();
	private HashSet<String> destinations = new HashSet<String>();
	
	Traveler(String name){
		this.name = name;
	}
	
	void addDistance (int distance) {
		if (distance <= 1) {
			System.out.println("You have to travel further than that!");
			return;
		}
		tripDistance.add(distance);
	}
	
	void addDestination (String place) {
		if (place.equalsIgnoreCase("Jail")) {
			System.out.println(this.name + ", jail is not the best place to visit! Be more careful next time!");
			System.out.println("");
		}
		destinations.add(place);
	}
	
	void timesAroundGlobe() {
		if (tripDistance.size() == 0) {
			System.out.println("You have not traveled yet, buddy!");
			return;
		}
		double totalDistance = 0;
		for (Integer trip : tripDistance) {
			totalDistance += trip;
		}
		double times = rounding((totalDistance / 40075), 2);
		System.out.println(this.name + ", your traveled distance(km) equals " + times + " times around the equator.");
	}
	
	boolean haveBeen (String place) {
		if (destinations.contains(place)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		int totalDistance = 0;
		for (Integer trip : tripDistance) {
			totalDistance += trip;
		}
		return this.name + " is a tourist with " + totalDistance + " total traveled kilometers.\n";
	}
	
	double rounding (double number, int places) {
		double scale = Math.pow(10, places);
		return Math.round(number * scale) / scale;
	}

}
