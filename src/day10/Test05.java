package day10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import util.MyUtil;

public class Test05 {

	public static void main(String[] args) {
		//Set<String> set = new HashSet<String>();//중복 안나옴, 출력순서 알 수 없음
		Set<String> set = new TreeSet<String>();//abc, 가나다 fh 정렬해서 나옴
		set.add("홍길동");
		set.add("김길동");
		set.add("최길동");
		set.add("박길동");
		set.add("홍길동");
		
		MyUtil.iteratorPrint(set);
		
	}

}
