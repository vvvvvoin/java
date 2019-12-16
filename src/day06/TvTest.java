package day06;

public class TvTest {

	public static void main(String[] args) {
		TV t1 = new TV();
		t1.model = "stv";
		t1.size = 25;
		t1.setChannel(11);
		t1.channelDown();
		t1.channelDown();
		t1.powerOn();
		t1.print();

		TV t2 = new TV();
		t2.model = "ltv";
		t2.size = 32;
		t2.setChannel(21);
		t2.print();

//		t2 = t1;
//		t2.print();
//		t2 = null;
//		t1 = null;
		System.out.println("=================================");
		new TV().print();
		System.out.println("=================================");

		TV[] tvs = new TV[3];
		tvs[0] = t1;
		tvs[1] = t2;

		t2 = null;
		t1 = null;

		for (int i = 0; i < tvs.length; i++) {
			if (tvs[i] == null)
				break;
			if (tvs[i] != null) {
				tvs[i].print();
				tvs[i].powerOn();
			}
		}
	}
}

class TV {
	int size;
	int channel;
	String model;
	boolean power;

	public void print() {
		System.out.printf("TV %s, %d 인치, power : %b, channel %d %n", model, size, power, channel);
	}

	public void powerOn() {
		this.power = true;
	}

	public void powerOff() {
		this.power = false;
	}

	public void channelUp() {
		this.channel++;
	}

	public void channelDown() {
		this.channel--;
	}

	public void setChannel(int c) {
		this.channel = c;
	}
}
