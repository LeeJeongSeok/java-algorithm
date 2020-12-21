package com.lee.algorithm.codeup;

/*
이번에는 줄을 바꿔 출력하는 출력문을 연습해보자.
다음과 같이 줄을 바꿔 출력해야 한다.

Hello
World
(두 줄에 걸쳐 줄을 바꿔 출력)

참고
백슬래시 문자 '\'는 글꼴 설정에 따라,
'W'와 비슷한 원표시('₩')로 보이기도 하지만 같은 문자이다.
printf( ) 함수를 이용해 문장을 출력할 때, 줄을 바꾸기 위해서는
'\n'(new line을 의미)을 줄을 바꿀 위치에 넣어야 한다.
'\t'는 탭(tab),
'\c'은 캐리지리턴(carriage return, 그 줄의 맨 앞으로 커서를 보냄)
등이 있다.

이러한 문자를 이스케이프(escape) 문자라고 하고,
출력하는 문장 안에서 원하는 형식에 맞추어 출력할 수 있도록
줄을 바꾸는 등의 특별한 의미들을 나타내기 위해 사용한다.

예시
printf("Hello\nWorld");

** 주의 : 본 화면에서 복사하여 붙여넣기하면 제대로 되지 않을 수 있으니 직접 소스코드를 작성해 넣어야한다.

출력
Hello
World
를 출력한다.

 */

public class Problem3 {

    public static void main(String[] args) {
        System.out.println("Hello\nWorld");
    }
}
