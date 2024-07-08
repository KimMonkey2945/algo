package basic.String;

import java.util.Scanner;

public class 문장속단어 {

/*    3. 문장 속 단어
    설명
    한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.

    문장속의 각 단어는 공백으로 구분됩니다.


    입력
    첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.


    출력
    첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
    단어를 답으로 합니다.*/




    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));

    }

    public static String solution(String str){
        String result = "";
        // split 으로 공백을 기준으로 배열에 담고
        String[] strArr = str.split(" ");
        System.out.println(strArr.length);

        for(int i = 0; i < strArr.length; i++){
            // 단순 길이를 비교해주면서 큰 값을 result 넣는다
            // 코드 길이가 같으면 어짜피 큰값만 바뀌므로 가장 앞의 값이 들어가게된다.
            if(strArr[i].length() > result.length()){
                result = strArr[i];
            }
        }

        return result;
    }
}
