package ru.mirea.task13.opt1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++) {
            test.add(i);
        }
        for(int i = 0; i < test.size(); i++) {
            System.out.print(test.get(i) + " ");
        }
        System.out.print("\n");
        test.set(1, 14);

        for(int i = 0; i < test.size(); i++) {
            System.out.print(test.get(i) + " ");
        }
        System.out.print("\n");

        Collections.sort(test);

        for(int i = 0; i < test.size(); i++) {
            System.out.print(test.get(i) + " ");
        }
    }
}
