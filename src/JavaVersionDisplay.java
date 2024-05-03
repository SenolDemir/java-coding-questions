public class JavaVersionDisplay {

    /*

    Write a Java program to check whether Java is installed on your computer.
    Expected Output

    Java Version: 1.8.0_71
    Java Runtime Version: 1.8.0_71-b15
    Java Home: /opt/jdk/jdk1.8.0_71/jre
    Java Vendor: Oracle Corporation
    Java Vendor URL: http://Java.oracle.com/
    Java Class Path: .
     */



    public static void main(String[] args) {

        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("JRE version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java class path: " + System.getProperty("java.class.path"));



    }
}
