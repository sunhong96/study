package chap_10;

import chap_10.converter.Convertible;
import chap_10.converter.KRWConverter;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
//        converter.convert(1);

//        convertUSD(public void convert(int USD) {
//            System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
//        }, 2);

        convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"), 2);
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"); //함수형 인터페이스를 사용하기위해서는 추상매서드가 1개만이어야함 1:1매칭을시켜야되서
        convertUSD(convertible,1);
    }

    public static void convertUSD(Convertible converter, int USD){
        converter.convert(USD);
    }
}
