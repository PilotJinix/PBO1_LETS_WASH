package pertama;
import java.util.Scanner;
import java.util.ArrayList;

public abstract class Person {
    ArrayList Username = new ArrayList();
    ArrayList Password = new ArrayList();
    Scanner scanner = new Scanner(System.in);

    public abstract void tambahakun();
}

