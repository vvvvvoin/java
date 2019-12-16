package day07;

public class Test05 {

	public static void main(String[] args) {
		
		Dog[] d;
		Fish[] f;
		Animal[] animals = {
					new Dog("푸들", "마루"),
					new Dog("진돗개", "댕댕이"),
					new Fish("구피"),				
					new Fish("재피르")				
		};
		
		for(Animal data : animals) {
			if(data instanceof Dog)((Dog)data).print();
			if(data instanceof Fish)((Fish)data).print();
			data.breath();
			
		}
				
		
	}

}
