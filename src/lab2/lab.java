package lab2;

public class lab {

	public static void main(String[] args) {
		int age = 14;
		System.out.println(age);
		System.out.println(age >= 16);
		age = 17;
		System.out.println(age >=16 );
		boolean hasLicense = true;
		if (age >= 16 && hasLicense) { 
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
		double costOfMilk = 3.28;	
		int thirstLevel = 7;
		if (costOfMilk < 2.5 || thirstLevel > 6) {
		System.out.println("Milk Please"); 	
		} else {
			System.out.println("No Thanks");
		}
		
		int numberOfCookies = 20;
		int numberOfChildren = 12;
		if (numberOfCookies % numberOfChildren >= 5) {
			System.out.println("Jackpot!");
		} else if (numberOfCookies % numberOfChildren >= 2) {	
			System.out.println("Whoooohoooo!");	
		} else if (numberOfCookies % numberOfChildren >0) {
			System.out.println("Yes!");
		} else {
			System.out.println("Sad Face");
		}
		String loyaltyMemberStatus = "GOLD";
		double loyaltyMemberDiscount = 0.0;
		
		switch(loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = .1;
				break;
			case "GOLD":
				loyaltyMemberDiscount = .15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = .25;
				break;
		}
		System.out.println(loyaltyMemberDiscount);
		double billTotal = 640.50;
		double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
		System.out.println(adjustedTotal);
		
		if (adjustedTotal > 500) 
			if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
			}else if (loyaltyMemberStatus == "GOLD") {
					loyaltyMemberStatus = "PLATINUM";
				} 
			System.out.println(loyaltyMemberStatus);
		String username = "Tommy123";
		String password = "12345";
		
		if (username.equals("Tommy123") && password.equals("12345")) {
		System.out.println("login successful");
	} else {
		System.out.println("access denied");	
	}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		for (int i = 10; i > 0; i--) {
		System.out.println(i);
		}
		for (int i = 0; i <= 100; i += 2) {
		System.out.println(i);	
		}
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
			System.out.println(i + "EVEN");
			} else { 
				System.out.println(i + "ODD");	
		}
		}
		int i =100;
		while (i > 0) {
			System.out.println(i + " " + (i % 3));
			i--;
		
		
		}
	}

}
