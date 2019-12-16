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
* scanner.nextLine() : nextln의 엔터의 메모리 값을 제거(무한루프에서의 문제가 되기에 삭제해야함)
* charAt() : String 타입을 인덱스 기준으로 char형으로 뽑아냄
* contains()  : 내용에 포함되어 있는 것을 찾음
* toUpperCase() : String 내용을 대문자로 변환
* length() : 크기 표시

* Character.isDigit() : 문자열이 존재하는 검사

* equals() : 주소값이 같음을 확인하는 함수
* equalsIgnoreCase() : 주소안의 데이터 값이 같은지 비교하는 함수

* Math.random() : 0 <= x < 1 의 값을 생성함

* lastIndexOf(' ') : Stirng의 타입의 몇번째 인덱스
* substring() : String 타입의 문자열을 자른다

> ```java
> String url = "http://www.naver.com";
> System.out.println(url.substring(url.lastIndexOf('/')));
> 
> //	실행결과
> //	6
> //	/www.naver.com
> ```

* System.arraycopy(num, 0, temp, 0, num.length); num의 인덱스 0부터 temp의 인덱스 0까지 num의 크기만큼 복사

