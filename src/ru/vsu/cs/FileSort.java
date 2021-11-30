package ru.vsu.cs;

import java.io.File;
import java.util.*;

public class FileSort {

    public List<String> getList() {
        File dir = new File("D:\\Мои документы"); //pathname указывает на директорию
        List<String> words = new ArrayList<>();
        for (File file : Objects.requireNonNull(dir.listFiles())) {
            if (file.isFile())
                words.add(file.getName());
        }
        Collections.shuffle(words);
        return words;
    }

    public String[] getSplitWords(String str1, String str2) {
        String name1 = str1.substring(0, str1.lastIndexOf('.'));
        String name2 = str2.substring(0, str2.lastIndexOf('.'));
        String format1 = str1.substring(str1.lastIndexOf('.') + 1);
        String format2 = str2.substring(str2.lastIndexOf('.') + 1);
        return new String[]{name1, name2, format1, format2};
    }

    public Comparator<String> comparator1 = (str1, str2) -> {
        String[] arr = getSplitWords(str1, str2);
        int partOfTheName = arr[2].compareTo(arr[3]);
        if (partOfTheName == 0) {
            partOfTheName = arr[0].compareTo(arr[1]);
        }
        return partOfTheName;
    };

    public Comparator<String> comparator2 = (str1, str2) -> {
        String[] arr = getSplitWords(str1, str2);
        int partOfTheName = arr[3].compareTo(arr[2]);
        if (partOfTheName == 0) {
            partOfTheName = arr[1].compareTo(arr[0]);
        }
        return partOfTheName;
    };

    public Comparator<String> comparator3 = (str1, str2) -> {
        String[] arr = getSplitWords(str1, str2);
        return arr[0].compareTo(arr[1]);
    };

    public Comparator<String> comparator4 = (str1, str2) -> {
        String[] arr = getSplitWords(str1, str2);
        return arr[1].compareTo(arr[0]);
    };

    public void printResult(List<String> file) {
        for (String s : file) {
            System.out.println(s);
        }
        System.out.println("-------------------------------");
    }
}
