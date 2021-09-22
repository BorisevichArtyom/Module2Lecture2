package by.it.academy;

import java.util.UUID;

public class StringRandomizer {
    public String randomString() {
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        StringRandomizer moduleTemp=new StringRandomizer();
        System.out.println(moduleTemp.randomString());
    }

}
