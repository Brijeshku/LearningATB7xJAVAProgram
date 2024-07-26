package ex_forloop;

public class Lab0047 {

    public static void main(String[] args) {
        char code = 'B';
        int val = switch (code) {
            case 'A':
                yield 65;  // Yield value for case 'A'
            case 'B':
                yield 66;  // Yield value for case 'B'
            default:
                throw new IllegalStateException("Unexpected value: " + code); // Throws exception for unexpected values
        }; // End of switch expression

        System.out.println(val); // Move this outside of the switch expression
    }
}







