package examples;

public class Example3 {
    public static void main(String args[]) {
        String s1 = "Cybercom";
        String s2 = "Cybercom";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3 = s1;
        String s4 = new String("Cybercom");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
