# JAVA_BASIC

## 기초 기본 명령어

### ECLIPS 기본 단축키

* ctrl + space bar : 리스트, 축약어 자동완성 (ex) syso)
* ctrl + shift + F : 자동정렬
* ctrl + alt + 방향기 : 복사
* alt + 방향기 : 위치이동
* ctrl + W : 현재 탭 닫기
* ctrl + Page up/down : 탭 이동

### JAVA 기본 API

* trim() : String 형에서 블랭크 제거
* Scanner
* scanner.nextLine() : nextln의 엔터의 메모리 값을 제거(무한루프에서의 문제가 되기에 삭제해야함)



```java
Scanner scanner = new Scanner(System.in);

System.out.println("이름을 입력하세요_");
name = scanner.nextLine();
System.out.println("국어점수를 입력하세요_");
kor = Integer.parseInt(scanner.nextLine());
System.out.println("수학점수를 입력하세요_");
math = scanner.nextInt();
scanner.nextLine(); // nexInt의 엔터의 메모리값을 제거 (무한루프에서는 문제가되기에 삭제해야함)
System.out.printf("이름 :  %s 국어점수 : %d 수학점수 : %d %n", name, kor, math);
//	실행결과
//	이름을 입력하세요_
//	홍길동
//	국어점수를 입력하세요_
//	50
//	수학점수를 입력하세요_
//	100
//	이름 :  홍길동 국어점수 : 50 수학점수 : 100
```

> 같은 int 타입이라도
>
> Integer.parseInt(scanner.nextLine()); 
>
> ---
>
> math = scanner.nextInt();
> scanner.nextLine(); 
>
> 로 두가지 방법으로 사용된다.



* charAt() : String 타입을 인덱스 기준으로 char형으로 뽑아냄
* contains()  : 내용에 포함되어 있는 것을 찾음
* toUpperCase() : String 내용을 대문자로 변환
* length() : 크기 표시

* Character.isDigit() : char, int 타입의 변수 값이 숫자인지를 true, false로 표현

```java
char c = '9';
System.out.printf("숫자입니까? %b %n", Character.isDigit(c));
//	실행결과
//	숫자입니까? true 
```

* equals() : 주소값이 같음을 확인
* equalsIgnoreCase() : 주소안의 데이터 값이 같은지 비교

* Math.random() : 0 <= x < 1 의 값을 생성함

* lastIndexOf(' ') : 문자열에서 탐색하는 문자열이 마지막으로 등장하는 위치에 대한 index를 반환
* substring() : String 타입의 문자열을 자른다

 ```java
 String url = "http://www.naver.com";
 System.out.println(url.substring(url.lastIndexOf('/')));
 //	실행결과
 //	6
 //	/www.naver.com
 ```

* System.arraycopy(num, 0, temp, 0, num.length); num의 인덱스 0부터 temp의 인덱스 0까지 num의 크기만큼 복사

