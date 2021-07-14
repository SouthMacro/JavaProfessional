package Lesson1.Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListIterator {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            String data = generateRandomString();
            stringList.add(data);
        }

        Iterator<String> it = stringList.iterator();

        for (Iterator<String> iter = it; iter.hasNext(); ) {
            String data = iter.next();
            System.out.println(data);
        }
    }

    // Took from: https://www.w3schools.com/java/java_iterator.asp
    public static String generateRandomString(){
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }
}
