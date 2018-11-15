package homework2;

import singleton.User;

public class Main {
	
	public static void main(String [] args) {
		Owner [] owner = new Owner[15];
		
		int i = 0; 
		for(Owner user : owner) {
			owner[i] = new Owner("naksoo" + i);
			owner[i].start();
			i++;
		}
	}
	
}
