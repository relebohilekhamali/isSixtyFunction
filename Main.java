//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {

    public static void main(String[] args) {
        int num1;
        int num2;

        System.out.println(isSixtyFive(30, 35));
        System.out.println(isSixtyFive(50, 10));
    }

    public static boolean isSixtyFive(int num1, int num2) {

        return num1 == 65 || num2 == 65 || (num1 + num2) == 65;
    }
}


