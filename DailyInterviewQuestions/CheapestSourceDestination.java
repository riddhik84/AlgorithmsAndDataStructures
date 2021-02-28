/*
You are given a huge list of airline ticket prices between different cities around the world on a given day. These are all direct flights. Each element in the list has the format (source_city, destination, price).

Consider a user who is willing to take up to k connections from their origin city A to their destination B. Find the cheapest fare possible for this journey and print the itinerary for that journey.

For example, our traveler wants to go from JFK to LAX with up to 3 connections, and our input flights are as follows:

[
    ("JFK", "ATL", 150),
    ("ATL", "SFO", 400),
    ("ORD", "LAX", 200),
    ("LAX", "DFW", 80),
    ("JFK", "HKG", 800),
    ("ATL", "ORD", 90),
    ("JFK", "LAX", 500),
]
Due to some improbably low flight prices, the cheapest itinerary would be JFK -> ATL -> ORD -> LAX, costing $440
*/

import java.util.*;

public class CheapestSourceDestination {
	public static void main(String args[]){
		//create the input data
		FlightData f1 = new FlightData("JFK", "ATL", 150);
		FlightData f2 = new FlightData("ATL", "SFO", 400);
		FlightData f3 = new FlightData("ORD", "LAX", 200);
		FlightData f4 = new FlightData("LAX", "DFW", 80);
		FlightData f5 = new FlightData("JFK", "HKG", 800);
		FlightData f6 = new FlightData("ATL", "ORD", 90);
		FlightData f7 = new FlightData("JFK", "LAX", 500);
		
		//Input data
		String source = "JFK";
		String destination = "LAX";
		
		ArrayList<FlightData> data = new ArrayList<>();
		data.add(f1);
		data.add(f2);
		data.add(f3);
		data.add(f4);
		data.add(f5);
		data.add(f6);
		data.add(f7);
				
		int cost = getCheapestCost(source, destination, data);
		System.out.println("Lowest cost is: " + cost);
	}
	
	public static int getCheapestCost(String source, String destination, ArrayList<FlightData> data){	
		int totalCost = 0;
		
		HashMap<String, Integer> costmap = new HashMap<>();
		for(FlightData d : data){
			StringBuilder s = new StringBuilder();
			s.append(d.getSource());
			s.append("->");
			s.append(d.getDestination());
			
			//System.out.println(s.toString());
			
			costmap.put(s.toString(), d.getCost());
		}
		
		String dest = "";
		
		int min = Integer.MAX_VALUE;
		while(!dest.equals(destination)){
			for(Map.Entry<String, Integer> entry : costmap.entrySet()){
				String key = entry.getKey();
				System.out.println(key);
				
				int value = entry.getValue();
				
				if(key.contains(source+"->")){
					System.out.println("found " + key);
					if(min > value){
						min = value;
						String[] arr = key.split("->");
						dest = arr[1];
					}
				}
				totalCost += min;
				source = dest;
				min = Integer.MAX_VALUE;
			}
		}
		return totalCost;
	}
}

class FlightData {
	String source;
	String destination;
	int cost;
	
	public FlightData(String source, String destination, int cost){
		this.source = source;
		this.destination = destination;
		this.cost = cost;
	}
	
	public String getSource(){
		return source;
	}
	
	public String getDestination(){
		return destination;
	}
	
	public int getCost(){
		return cost;
	}
}


