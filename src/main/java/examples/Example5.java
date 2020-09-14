package examples;

public class Example5 {

    private static Integer number;

    public static String convertInWords() {
        switch (number) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            default: return "other";
        }
    }

    public static void main(String[] args) {
        System.out.println(convertInWords());
    }

}

