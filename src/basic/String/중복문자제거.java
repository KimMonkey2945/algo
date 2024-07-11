package basic.String;

import java.util.*;

public class 중복문자제거 {

    /*
    * 설명

소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.


입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.


출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.

*/

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        solution(input1);

    }

    public static void solution(String str) {

        Set<Character> strSet = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for(char a : str.toCharArray()){
            strSet.add(a);
        }

        Iterator iter = strSet.iterator();
        while (iter.hasNext()){
            result.append(iter.next());
        }

        System.out.println(result.toString());

    }
}
