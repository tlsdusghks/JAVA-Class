import java.util.Scanner;

public class scanner {
    // public static void main(String[] args) {
    //     //Scanner 객체 생성하기
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("=== 자기소개 프로그램 ===");

    //     System.out.print("이름을 입력하세요: ");

    //     //한 줄 전체 입력받기 (공백 포함)
    //     String name = scanner.nextLine();

    //     //나이 입력받기
    //     System.out.print("나이를 입력하세요: ");
    //     int age = scanner.nextInt();

    //     //키 입력받기
    //     System.out.print("키(cm)를 입력하세요: ");
    //     double height = scanner.nextDouble();

    //     //결과 출력하기
    //     System.out.println("\n=== 당신의 정보 ===");
    //     System.out.println("이름: " + name);
    //     System.out.println("나이: " + age + "세");
    //     System.out.println("키: " + height + "cm");
        
    //     // 인사말
    //     System.out.println("\n안녕하세요, " + name + "님! 반갑습니다! 🎉");

    //     //Scanner 객체 닫기
    //     scanner.close();
    // }


    public static void add_method(Scanner scanner) {
        Scanner scanner = new Scanner(System.in);
        int result;
        System.out.println("숫자를 입력하세요");
        int number1 = scanner.nextInt();

        System.out.println("숫자를 입력하세요");
        int number2 = scanner.nextInt();
        result = number1 + number2;

        System.out.println("간단한 덧셈");
        System.out.println(number1 + " + " + number2 + " = " + result);


    }


    public static void circle_area_circumference(Scanner scanner) {

    System.out.println("반지름을 입력하세요");
    double radius = scanner.nextDouble();
    double arear = radius * radius * Math.PI;
    double circumference = 2.0 * radius * Math.PI;

    System.out.println("원의 면적과 원의 둘레");
    System.out.println("원의 면적 : " + arear + "[m^2]");
    System.out.println("원의 둘레 : " + circumference + "[m]");

 
    }

}
