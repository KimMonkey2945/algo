package basic.String;

import java.util.Scanner;

public class 가장짧은문자거리 {

    /*
    * 설명

한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

문자열의 길이는 100을 넘지 않는다.


출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

*/

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);

        solution(input1, input2);

    }

    public static void solution(String str, char c) {

        int[] result = new int[str.length()];
        int p = 101;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != c){
                p++;
            }
            else{
                p = 0;
            }
            result[i] = p;
        }

        p = 101;

        for(int i = str.length()-1; i >= 0; i--){
            if(str.charAt(i) != c){
                p++;
                if(result[i] > p) result[i] = p;
            }else{
                p = 0;
            }
        }

        String re = "";
        for(int a : result){
            re += a + " ";
        }
        System.out.println(re);

    }
}
