package basic.String;

import java.util.*;

public class 특정문자뒤집기 {

    /*
    * 설명

영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

* 출력
* 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

*/

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        solution(input1);

    }

    public static void solution(String str){
        StringBuilder result = new StringBuilder();
        List<Character> alpa = new ArrayList<>();
        int index = 0;
        for(char a : str.toCharArray()){
            if(Character.isAlphabetic(a)){
                alpa.add(a);
            }
        }

        Collections.reverse(alpa);

        for(char a : str.toCharArray()){
            if(Character.isAlphabetic(a)){
                result.append(alpa.get(index));
                index++;
            }else{
                result.append(a);
            }

        }
        System.out.println(result.toString());
    }
}
