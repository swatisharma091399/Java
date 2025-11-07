package LabSheet4;

class VarargsExample {
    static void printStrings(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

public class code14 {
    public static void main(String[] args) {
        VarargsExample.printStrings("Hello", "World", "Java");
    }
}
