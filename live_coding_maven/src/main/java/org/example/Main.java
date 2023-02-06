package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public List<String> order(List<String> words) {

        Random random = new Random();
        List<String> temp_words = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < words.size(); i++) {

            for (int j = 0; j < words.size(); j++) {

                if (words.get(i).compareTo(words.get(j)) > 0) {
                    counter++;
                }
            }

            counter = 0;
        }

        return temp_words;
    }
}