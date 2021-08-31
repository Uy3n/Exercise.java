import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = keyboard.nextLine();

        int lengde = input.length();
        int count = 0;
        for (int i = 0; i < lengde; i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                count ++;
            }
        }
        System.out.println(count);

        System.out.println(toUpperCase(input));

        System.out.println("Nhập chuỗi: ");
        String str = keyboard.nextLine();
        toUpperCaseAfterDot(str);
    }

    public static String toUpperCase(String givenString) {
        String[] arr = givenString.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static void toUpperCaseAfterDot(String givenString) {
        givenString = givenString.substring(0,1).toUpperCase() + givenString.substring(1);
        
        String[] arr = givenString.split("");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(".")) {
                sb.append(arr[i]);
                sb.append(" ");
                sb.append(arr[i+2].toUpperCase());
                i = i + 2;
            } else {
                sb.append(arr[i]);
            }
        }

        System.out.println(sb.toString().trim());
    }
}