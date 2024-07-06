import java.io.IOException;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine();
        try {
            System.out.println(calc(inStr));
        } catch (NumberFormatException e){
            System.out.println("throws Exception // т.к. введено неподходящее число");
        }

    }

    public static String calc(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("throws Exception // т.к. формат математической операции не удовлетворяет заданию");
            }
            System.exit(0);
        }



        int a = Integer.valueOf(parts[0]);
        int b = Integer.valueOf(parts[2]);
        int result = 0;

        //checking
        if ((a < 1)||(a > 10) || (b < 1)||(b > 10)) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("throws Exception // т.к.операнды должны быть в диапазоне 1 до 10");
            }
            System.exit(0);
        }
        if ((parts[1].equals("+")) || (parts[1].equals("-")) || (parts[1].equals("*")) || (parts[1].equals("/")))
            {
                switch (parts[1]) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                }
            } else
            {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("throws Exception // т.к. допустимые операторы являются +, -, /, *");
            }
            System.exit(0);
        }

        //counting

        return String.valueOf(result);



    }
}