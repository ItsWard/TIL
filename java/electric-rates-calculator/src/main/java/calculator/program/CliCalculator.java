package main.java.calculator.program;

public interface CliCalculator {
    String setTitle(String title); // 시작 인터페이스 (전기요금 계산기가 아닌 다른 계산기 타이틀 넣을 수 있도록 인터페이스로 제작)
    String calc(Calculator calculator); // 전기요금 계산 프로그램 RatesCalculator 단독이 아닌 Calcurator 객체가 만들어질 경우 변경 예정

}

