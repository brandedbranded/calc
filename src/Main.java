import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static String calc(String input) throws Exception{
        input = input.replace(" ","");
        String [] data = null;
        String[] rightWriting= input.split("[-*+/]");
        int length=rightWriting.length;
        if(length!=2) throw new Exception("Неверный ввод");

            if (input.contains("+")) {
                data = input.split("\\+");
                String result = Integer.toString(Integer.parseInt(data[0]) + Integer.parseInt(data[1]));
                input = result;
            } else if (input.contains("-")) {
                data = input.split("-");
                String result = Integer.toString(Integer.parseInt(data[0]) - Integer.parseInt(data[1]));
                input = result;
            } else if (input.contains("*")) {
                data = input.split("\\*");
                String result = Integer.toString(Integer.parseInt(data[0]) * Integer.parseInt(data[1]));
                input = result;
            } else if (input.contains("/")) {
                data = input.split("/");
                String result = Integer.toString(Integer.parseInt(data[0]) / Integer.parseInt(data[1]));
                input = result;
            }
            else throw new Exception("Неккорректный знак");

        if (Integer.parseInt(data[0])<1)
            throw new Exception("Число должно быть от 1 до 10");
        if (Integer.parseInt(data[1])<1)
            throw new Exception("Число должно быть от 1 до 10");
        if (Integer.parseInt(data[0])>10)
            throw new Exception("Число должно быть от 1 до 10");
        if (Integer.parseInt(data[1])>10)
            throw new Exception("Число должно быть от 1 до 10");

        return input;

        }
    public static void main(String[] args) throws Exception {
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println(result);
    }
}





