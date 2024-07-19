package Classes_And_Objects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class ComplexObjectStructures {

	public static void main(String[] args) {
		Traveler t1 = new Traveler("Jim");
		Traveler t2 = new Traveler("Jonh");
		Traveler t3 = new Traveler("Jack");
		Traveler t4 = new Traveler("Ben");
		Traveler t5 = new Traveler("Lisa");
		String[] places = {"Barcelona", "Boston", "Rome", "Tokyo", "Beijing", "Sydney", "Paris", "Madrid", "Berlin", "Vienna", "Ulaanbaatar", "Cairo", "London", "Riga", "Jail"};
		Random rand = new Random();
		ArrayList<Traveler> tourists = new ArrayList<Traveler>();
		tourists.add(t1);
		tourists.add(t2);
		tourists.add(t3);
		tourists.add(t4);
		tourists.add(t5);
		
		// Randomly assigns destinations for travelers/tourists.
		for (int i = 1; i < 11; i++) {
			for(Traveler tourist : tourists) {
				int index = rand.nextInt(places.length);
				tourist.addDestination(places[index]);
			}
		}
		// Randomly assigns traveled distances for tourists, because maybe they traveled to same place multiple times
		// and chose different routes. I set the max distance 15319 km, because it is the distance from Riga to Sydney.
		for (int i = 1; i < 11; i++) {
			for (Traveler tourist : tourists) {
				int distance = rand.nextInt(15319);
				tourist.addDistance(distance);
			}
		}
		
		for (Traveler tourist : tourists) {
			tourist.timesAroundGlobe();
			if (tourist.haveBeen("Riga")) {
				System.out.println("Congratulations, " + tourist.name + ", you know how to pick a travel destinations!");
			} else {
				System.out.println(tourist.name + ", you forgot to visit Riga!");
			}
			System.out.println(tourist);
		}
		
		System.out.println(t5.haveBeen("Boston"));
	
	}

}
