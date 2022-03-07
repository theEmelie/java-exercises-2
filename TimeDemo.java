package ea224qb_assign1;

import java.util.Scanner;

public class TimeDemo {

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		int userInput;
		
		System.out.println("Enter seconds passed since midnight: ");
		
		userInput = scannerObject.nextInt();
		
		Time timeA = new Time(userInput);

		timeA.tick();
		System.out.println(timeA);
		timeA.tick();
		System.out.println(timeA);
		timeA.tick();
		System.out.println(timeA);
		timeA.tick();
		System.out.println(timeA);
		timeA.tick();
		System.out.println(timeA);
		timeA.tick();
		System.out.println(timeA);
		timeA.tick();
		System.out.println(timeA);
		timeA.tick();
		System.out.println(timeA);
		timeA.tick();
		System.out.println(timeA);
		timeA.tick();
		System.out.println(timeA);

		System.out.println("Enter a time (hours, minutes, seconds): ");
		
		int h = scannerObject.nextInt();
		int m = scannerObject.nextInt();
		int s = scannerObject.nextInt();
		
		Time timeB = new Time(h, m, s);
		
		timeB.tick();
		System.out.println(timeB);
		timeB.tick();
		System.out.println(timeB);
		timeB.tick();
		System.out.println(timeB);
		timeB.tick();
		System.out.println(timeB);
		timeB.tick();
		System.out.println(timeB);
		timeB.tick();
		System.out.println(timeB);
		timeB.tick();
		System.out.println(timeB);
		timeB.tick();
		System.out.println(timeB);
		timeB.tick();
		System.out.println(timeB);
		timeB.tick();
		System.out.println(timeB);
		
		Time sum = timeA.addTime(timeB); 
		System.out.println("timeA + timeB = " + sum);
		
		Time timeC;
		
		timeC = timeA.subtracTime(timeB);
		System.out.println("timeA - timeB = " + timeC);
		
		scannerObject.close();
	}

}
