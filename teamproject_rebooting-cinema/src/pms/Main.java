package pms;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("안녕하세요. CGV영화관에 오신것을 환영합니다.");

    System.out.println("원하시는 기능을 선택해주세요.");

    System.out.println("1. 관리자 모드");
    System.out.println("2. 손님 모드");
    System.out.println("3. 회원 가입");
    System.out.println("0. 종료");

    int input = sc.nextInt();
    if(input == 1) {

      System.out.println();
      System.out.println("1. 영화 등록");
      System.out.println("2. 영화 삭제");
      System.out.println("3. 고객 관리");
      System.out.println("0. 뒤로가기");
      int input2 = sc.nextInt();
      if(input2 == 1) {
        System.out.println("영화 제목 : ");
        System.out.println("영화 감독 : ");
        System.out.println("영화 장르 : ");
      }

    } else if(input == 2) {
      System.out.println();
      System.out.println("1. 영화 예매");
      System.out.println("2  예매 취소");
      System.out.println("9. 영화관 조회");
      System.out.println("0. 뒤로가기");
    } else if(input == 0) {
      System.out.println();
      System.out.println("시스템을 종료합니다.");
    }



  }

}
