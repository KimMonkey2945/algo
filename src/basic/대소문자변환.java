package basic;

import java.util.Scanner;

public class 대소문자변환 {

/*2. 대소문자 변환
    설명

    대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.


    입력
    첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.

    문자열은 영어 알파벳으로만 구성되어 있습니다.


    출력
    첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
    */

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        System.out.println(solution(input1));

    }

    public static String solution(String str){

        String result = "";
        // 문자열의 길이만큼 돌고
        for(int i = 0; i < str.length(); i++){
            // 하나씩 문자 타입으로 변환
            char a = str.charAt(i);
            if(a >= 65 && a <= 90){ // 아스키 코드 대문자의 범위
                // String 타입으로 변환하고 그에 맞게 대소문자로 변환
                result += String.valueOf(a).toLowerCase();
            }else{
                result += String.valueOf(a).toUpperCase();
            }
        }
        return result;
    }



}
