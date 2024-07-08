package basic.String;

import java.util.Scanner;

public class 문자찾기 {

  /*  1. 문자 찾기
    설명

    한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.

    대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.


    입력
    첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.

    문자열은 영어 알파벳으로만 구성되어 있습니다.*/





    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();

        System.out.println(solution(input1, input2));

    }

    public static int solution(String str, String str2){
            // 문자를 하나씩 가져와 대문자 변환 및 문자 타입의 배열에 저장
           char[] strU = str.toUpperCase().toCharArray();
           char[] str2U = str2.toUpperCase().toCharArray();

           int result = 0;
            // 하나씩 순환하면서 같으면 result++를 해준다 여기서 문자는 원시타입이므로 ==로 비교
          for(int i = 0; i < strU.length; i++){
              if(strU[i] ==  str2U[0]){
                result++;
              }
          }

          return result;

    }

}
