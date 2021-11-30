package ru.vsu.cs;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        FileSort fileSort = new FileSort();
        List<String> file = fileSort.getList();
        fileSort.printResult(file);

        file.sort(fileSort.comparator1);
        fileSort.printResult(file);

        file.sort(fileSort.comparator2);
        fileSort.printResult(file);

        file.sort(fileSort.comparator3);
        fileSort.printResult(file);

        file.sort(fileSort.comparator4);
        fileSort.printResult(file);
    }
}
