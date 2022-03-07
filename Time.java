/*
* Date: 2021-09-10.
* File Name: Time.Java
* Author: Emelie Åslund
*
*/

package ea224qb_assign1;

public class Time {
	int hours;
	int minutes;
	int seconds;
	
	public Time() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}
	
	public Time(int h, int m, int s) {
		if (h >= 24 ) {
			hours = 23;
			minutes = 59;
			seconds = 59;
		} else if (h < 0) {
			hours = 0;
		} else if (m < 0) {
			minutes = 0;
		} else if (s < 0) {
			seconds = 0;
		} else {
			hours = h;
			minutes = m;
			seconds = s;
		}
	}
	
	public Time(int i) {
		int rem = i%3600;
		
		if (i/3600 >= 24) {
			hours = 23;
			minutes = 59;
			seconds = 59;
		} else if (i < 0) {
			hours = 0;
			minutes = 0;
			seconds = 0;
		} else {
			hours = i / 3600;
			minutes = rem / 60;
			seconds = rem % 60;
		}
		
	}
	
	public void setClock(int i) {
		int rem = i%3600;
		
		if (i/3600 >= 24) {
			hours = 23;
			minutes = 59;
			seconds = 59;
		} else if (i < 0) {
			hours = 0;
			minutes = 0;
			seconds = 0;
		} else {
			hours = i / 3600;
			minutes = rem / 60;
			seconds = rem % 60;
		}
	}
	
	public int getHours() {
		return hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public void setHours(int h) {
		if (h >= 24) {
			hours = 23;
		} else if (h < 0) {
			hours = 0;
		} else {
			hours = h;
		}
	}
	
	public void setMinutes(int m) {
		if (m >= 60) {
			minutes = 59;
		} else if (m < 0) {
			minutes = 0;
		} else {
			minutes = m;
		}
	}
	
	public void setSeconds(int s) {
		if (s >= 60) {
			seconds = 59;
		} else if (s < 0) {
			seconds = 0;
		} else {
			seconds = s;
		}
	}
	
	public void tick() {
		if (seconds == 59) {
			seconds = 0;
			if (minutes == 59) {
				minutes = 0;
				if (hours == 23) {
					hours = 0;
				} else {
					hours++;
				}
			} else {
				minutes++;
			}
		} else {
			seconds++;
		}
	}
	
	public void tickDown() {
		if (seconds == 0) {
			seconds = 59;
			if (minutes == 0) {
				minutes = 59;
				if (hours == 0) {
					hours = 23;
				} else {
					hours--;
				}
			} else {
				minutes--;
			}
		} else {
			seconds--;
		}
	}
	
	public Time addTime(Time t) {
		int h;
		int m;
		int s;
		int tempS;
		int tempM;
		int tempH;
		
		tempS = seconds + t.getSeconds();
		s = tempS % 60;
		tempM = tempS / 60 + minutes + t.getMinutes();
		m = tempM % 60;
		tempH = tempM / 60 + hours + t.getHours();
		h = tempH % 24;
		
		Time t1 = new Time(h, m, s);
		return t1;
	}
	
	public Time subtracTime(Time t) {
		int h;
		int m;
		int s;
		int tempS;
		int tempM;
		int tempH;
		
		tempS = seconds - t.getSeconds();
		
		if (tempS < 0) {
			s = tempS + 60;
			tempS = -1;
		} else {
			s = tempS;
		}
		
		tempM = minutes - t.getMinutes() + tempS;
		
		if (tempM < 0) {
			m = tempM + 60;
			tempM = -1;
		} else {
			m = tempM;
		}
		
		tempH = hours - t.getHours() + tempM;
		
		if (tempH < 0) {
			h = tempH + 24;
			tempH = -1;
		} else {
			h = tempH;
		}
		
		Time t1 = new Time(h, m, s);
		return t1;
		
	}
	
	public String toString() {
		String timeStr = String.format("%02d:%02d:%02d", hours, minutes, seconds);
		return timeStr;
	}
	
	public static void main(String[] args) {
//		
//		// Testing the methods as I do them, to make sure they work as intended.
//		
//		Time t1 = new Time();
//		System.out.println(t1.toString());
//		
//		Time t2 = new Time(1,6,3);
//		System.out.println(t2.toString());
//		
//		Time t3 = new Time(37,0,80);	
//		System.out.println(t3.toString());
//		
//		Time t4 = new Time(-10,0,-80);	
//		System.out.println(t4.toString());
//		
//		Time t5 = new Time(3600*24);	
//		System.out.println(t5.toString());
//		
//		Time t6 = new Time(-24);	
//		System.out.println(t6.toString());
//		
//		Time t7 = new Time(23,59,59);	
//		
//		// Test get methods
//		System.out.println(t2.getHours());
//		System.out.println(t2.getMinutes());
//		System.out.println(t2.getSeconds());
//		
//		// Test set methods
//		System.out.println(t1.toString());	
//		t1.setHours(23);
//		t1.setMinutes(22);
//		t1.setSeconds(44);		
//		System.out.println(t1.toString());
//		
//		// Test tick method
//		t1.tick();
//		System.out.println(t1.toString());
//		
//		t7.tick();
//		System.out.println(t7.toString());
//		
//		// Test tickDown method	
//		t7.tickDown();
//		System.out.println(t7.toString());
//		t7.tickDown();
//		System.out.println(t7.toString());
//		
//		// Test add time method
//		Time t8 = t2.addTime(t2);
//		System.out.println(t2.toString());
//		System.out.println(t8.toString());
//		
//		t8 = t7.addTime(t2);
//		System.out.println(t2.toString());
//		System.out.println(t7.toString());
//		System.out.println(t8.toString());
//		
//		// Test subtract time method	
//		Time t9 = new Time(1, 1, 1);
//		Time t10 = new Time(1, 1, 2);
//		
//		t8 = t9.subtracTime(t10);
//		System.out.println(t8.toString());
//
	}

}
