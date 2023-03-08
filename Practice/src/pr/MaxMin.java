package pr;

public class MaxMin {
    public static void main(String[] args) {
        int[] score = {77, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {
            if(score[i] > max){
                max = score[i];
            }else if (score[i] < min){
                min = score[i];
            }
        }

        System.out.println("최대값=" + max);
        System.out.println("최소값=" + min);


        String src = "ABCDE";
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println("ch[" + i +"] : " + ch);
        }
    }
}
