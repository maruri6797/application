package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int math = 0;
        int science = 0;
        int replay = 0;

        while ((math <= 30 || science <= 30) && replay < 3) {
            replay = replay + 1;
            System.out.println("----" + replay + "回目の試験を行います");

            System.out.println("数学の点数を入力してください：");
            String inputMath = reader.readLine();

            System.out.println("科学の点数を入力してください：");
            String inputScience = reader.readLine();

            math = Integer.parseInt(inputMath);
            science = Integer.parseInt(inputScience);
        }

        System.out.println("お疲れ様です。合計" + replay + "回受験しました");
        System.out.println("数学の点数は" + math + "点でした");
        System.out.println("科学の点数は" + science + "点でした");
    }
}