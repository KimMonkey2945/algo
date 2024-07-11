package basic.String;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class 회문문자열 {

    /*
    * 설명

앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.

문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 대소문자를 구분하지 않습니다.


입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.


출력
첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.

*/

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));

    }

    public static String solution(String str) {
        String result = "NO";
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString().toLowerCase();
        if(str.toLowerCase().equals(reverse)){
            result = "YES";
        }
        return result;
    }
}
