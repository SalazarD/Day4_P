package Practice2;

import java.util.ArrayList;

public class PartDemo {
	
	
	
	public static void main(String[] args) {
		int arraySize = 8;
		Part[] parts = new Part[arraySize];
		parts[0] = new Part(1,"Widget","acme-100-201", 5.30);
		parts[1] = new Part(2,"Doohickey","stl-123-503", 7.70);
		parts[2] = new Part(3,"Doodad","ace-430-100", 2.50);
		parts[3] = new Part(4,"Thingamabob","wld-100-201", 1.25);
		parts[4] = new Part(5,"Thingummy","acer-100-223", 9.95);
		parts[5] = new Part(6,"Thingamajig","race-1004-2011", 1.00);
		parts[6] = new Part(7,"Whatsits","ace-100-201", 3.20);
		parts[7] = new Part(8,"Somesuch","huh-123-4567", 0.00);
		Part[] cheapItems = findItemsCheaperThan(parts, 3.50);
		for (Part p: cheapItems) {
		System.out.println(p.getPartName()+
		", Cost:"+p.getCost());
		}
		
		
		System.out.println("\n");
		ArrayList<Part> matches = getProductsBy(parts, "ace");
		
		for(Part match: matches) {
			System.out.println(match.toString());
		}
		
		}
	
	public static Part[] findItemsCheaperThan(Part[] parts, double value) {
		
		int count = 0;
		
		for(int i = 0; i < parts.length; i++) {
			
			if(parts[i].getCost() < value) {
				count++;
			}
			
		}
		
		Part[] matches = new Part[count];
		
		int pos = 0;
		
		for(int i = 0; i < parts.length; i++) {
			
			if(parts[i].getCost() < value) {
				matches[pos] = parts[i];
				pos++;
			}
			
		}
		
		return matches;
		
	}
	
	
	public static ArrayList<Part> getProductsBy(Part[] parts, String company){
		
		ArrayList<Part> matches = new ArrayList<Part>();
		
		for(int i = 0; i < parts.length; i++) {
			
			if(parts[i].getPartSN().split("-")[0].equalsIgnoreCase(company)) {
				matches.add(parts[i]);
			}
			
		}
		
		return matches;
		
		
	}

}
