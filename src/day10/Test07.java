package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test07 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("java01", "5256");
		map.put("java02", "1234");
		map.put("java03", "4737");
		map.put("java04", "3234");
		map.put("java05", "8254");
		map.put("java06", "9984");
		map.put("java07", "1519");
		map.put("java08", "2234");
		map.put("java09", "3246");
		map.put("java10", "1118");

		// map 구조 순회
		Set<String> keys = map.keySet();

		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String id = (String) it.next();
			System.out.println(id + " = " + map.get(id));
		}

		// 로그인
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("id를 입력하세요");
			String id = scanner.nextLine().trim();

			if (!map.containsKey(id)) {
				System.out.println("id가 존재하지 않습니다.");
				continue;
			} else {
				while (true) {
					System.out.println("pw를 입력하세요");
					String pw = scanner.nextLine().trim();
					if (map.get(id).equals(pw)) {
						System.out.println("로그인 성공됨");
						break;
					} else {
						System.out.println("pw를 확인해주세요");
					}
				}
				break;
			}

		}

		scanner.close();
		scanner = null;
		System.out.println("end");
	}

}
