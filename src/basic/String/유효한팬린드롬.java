package basic.String;

import java.util.Arrays;
import java.util.Scanner;

public class 유효한팬린드롬 {

    /*
    * 설명

앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.

문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

알파벳 이외의 문자들의 무시합니다.


입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.


출력
첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.

*/

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));

    }

    public static String solution(String str) {
        String result = "YES";
        String str2 = str.replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9]", "");

        StringBuilder sb = new StringBuilder(str2);
        String reverse = sb.reverse().toString().toLowerCase();
        char[] cha = str2.toLowerCase().toCharArray();
        char[] rever = reverse.toCharArray();

        for(int i = 0; i < cha.length; i++){
            if(Character.isAlphabetic(cha[i])){
                if(cha[i] != rever[i]){
                    result = "NO";
                    return result;
                }
            }
        }

        return result;
    }
}
