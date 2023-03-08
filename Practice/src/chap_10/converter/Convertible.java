package chap_10.converter;

@FunctionalInterface// 함수형 인터페이스라는걸 말해주고 설정해주는것
public interface Convertible {
    void convert(int USD);
}
