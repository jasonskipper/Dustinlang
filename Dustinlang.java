import java.util.*;

/*
> : D
< : U 
+ : S 
- : T 
. : I 
, : N 
[ : 6
] : 9 
*/

class Dustinlang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pointer = 0;
        int memoryLimit = 65535;
        byte memory[] = new byte[memoryLimit];

        System.out.println("Enter the Dustinlang program you wish to run: ");
        String input = scanner.nextLine();

        int c = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'D') {
                if (pointer == memoryLimit - 1) {
                    pointer = 0;
                } else {
                    pointer += 1;
                }
            } else if (input.charAt(i) == 'U') {
                if (pointer == 0) {
                    pointer = memoryLimit - 1;
                } else {
                    pointer -= 1;
                }
            } else if (input.charAt(i) == 'S') {
                memory[pointer] += 1;
            } else if (input.charAt(i) == 'T') {
                memory[pointer] -= 1;
            } else if (input.charAt(i) == 'I') {
                System.out.print((char) (memory[pointer]));
            } else if (input.charAt(i) == 'N') {
                memory[pointer] = (byte) (scanner.next().charAt(0));
            } else if (input.charAt(i) == '6') {
                if (memory[pointer] == 0) {
                    i++;
                    while (c > 0 || input.charAt(i) != '9') {
                        if (input.charAt(i) == '6') {
                            c++;
                        } else if (input.charAt(i) == '9') {
                            c--;
                        }
                        i++;
                    }
                }
            } else if (input.charAt(i) == '9') {
                if (memory[pointer] != 0) {
                    i--;
                    while (c > 0 || input.charAt(i) != '6') {
                        if (input.charAt(i) == '9') {
                            c++;
                        } else if (input.charAt(i) == '6') {
                            c--;
                        }
                        i--;
                    }
                    i--;
                }
            }
        }

    }
}
