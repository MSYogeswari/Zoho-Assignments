package view;

import java.util.Scanner;

public class GetInput {
    Scanner sc = new Scanner(System.in);

    public int getInteger() {
        return sc.nextInt();
    }

    public String getString() {
        return sc.next();
    }

    public long getLong() {
        return sc.nextLong();
    }
}
