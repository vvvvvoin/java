package day06;

public class Test02 {

	public static void main(String[] args) {
		Time t1 = new Time();
		t1.setHour(13);
		//t1.setMintute(30);
		t1.setMintute(-30);
		
		t1.print();
	}

}

class Time{
	private int hour;
	private int mintute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour >=0 && hour < 24) this.hour = hour;
	}
	
	public int getMintute() {
		return mintute;
	}
	public void setMintute(int mintute) {
		if(mintute >=0 && mintute < 60) this.mintute = mintute;
	}
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second >=0 && second < 60) this.second = second;
	}
		
	
	public void print() {
		System.out.printf("%d시 : %d분 : %d초 %n", 
				hour, mintute,second);  //time클래스의 멥버자원때문에 static사용 못함
		}	

}