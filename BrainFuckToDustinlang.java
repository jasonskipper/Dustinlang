import java.util.*;

class BrainFuckToDustinlang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String convertedD = input.replaceAll(">", "D");
        String convertedU = convertedD.replaceAll("<", "U");
        String convertedS = convertedU.replaceAll("\\+", "S");
        String convertedT = convertedS.replaceAll("-", "T");
        String convertedI = convertedT.replaceAll("\\.", "I");
        String convertedN = convertedI.replaceAll(",", "N");
        String converted6 = convertedN.replaceAll("\\[", "6");
        String converted9 = converted6.replaceAll("\\]", "9");
        System.out.println(converted9);
    }
}
