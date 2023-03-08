package source;


import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        // 입력 문자열
        String str = "치킨,피자,보쌈,족발,초밥,떡볶이,탕수육";
        String delim = ","; //구분자를 변수에 넣어줘서 구분자를 변수로도 생성가능

        /* 1. 구분자를 ","로 하는StringTokenizer를 생성하세요. */
        StringTokenizer st = new StringTokenizer(str,delim);
//        StringTokenizer st = new StringTokenizer(str,구분지어줄표시,(true,false));

        //countTokens() 전체토큰의 수를 반환한다.
        System.out.println(st.countTokens());
        /* 2. 모든 토큰을 출력하세요. */
        while(st.hasMoreTokens()){//boolean hasMoreTokens() 토큰이 남아있는지 알려줌
            System.out.println(st.nextToken());//토큰을 반환한다
        }
    }
}