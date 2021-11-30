package ru.vsu.cs;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    @Test
    public void testComparator1() {
        FileSort fileSort = new FileSort();
        List<String> file1 = fileSort.getList();
        List<String> file2 = new ArrayList<>();

        file1.sort(fileSort.comparator1);

        file2.add("Кольцевая очередь.mp4");
        file2.add("Локальные максимумы и минимумы.mp4");
        file2.add("Iokhannes_Itten_Iskusstvo_tsveta.pdf");
        file2.add("Java. Библиотека профессионала. Кей Хорстманн.pdf");
        file2.add("Math.pdf");
        file2.add("demidovich_sbornik.pdf");
        file2.add("Односвязный список.png");
        file2.add("Очередь.png");
        file2.add("Антропогенез.pptx");
        file2.add("Архитектура и живопись Барокко.pptx");
        file2.add("Особенности культуры Японии.pptx");
        file2.add("Художественная культура.pptx");

        for (int i = 0; i < file1.size(); i++) {
            Assert.assertEquals(file2.get(i), file1.get(i));
        }
    }

    @Test
    public void testComparator2() {
        FileSort fileSort = new FileSort();
        List<String> file1 = fileSort.getList();
        List<String> file2 = new ArrayList<>();

        file1.sort(fileSort.comparator2);

        file2.add("Художественная культура.pptx");
        file2.add("Особенности культуры Японии.pptx");
        file2.add("Архитектура и живопись Барокко.pptx");
        file2.add("Антропогенез.pptx");
        file2.add("Очередь.png");
        file2.add("Односвязный список.png");
        file2.add("demidovich_sbornik.pdf");
        file2.add("Math.pdf");
        file2.add("Java. Библиотека профессионала. Кей Хорстманн.pdf");
        file2.add("Iokhannes_Itten_Iskusstvo_tsveta.pdf");
        file2.add("Локальные максимумы и минимумы.mp4");
        file2.add("Кольцевая очередь.mp4");

        for (int i = 0; i < file1.size(); i++) {
            Assert.assertEquals(file2.get(i), file1.get(i));
        }
    }

    @Test
    public void testComparator3() {
        FileSort fileSort = new FileSort();
        List<String> file1 = fileSort.getList();
        List<String> file2 = new ArrayList<>();

        file1.sort(fileSort.comparator3);

        file2.add("Iokhannes_Itten_Iskusstvo_tsveta.pdf");
        file2.add("Java. Библиотека профессионала. Кей Хорстманн.pdf");
        file2.add("Math.pdf");
        file2.add("demidovich_sbornik.pdf");
        file2.add("Антропогенез.pptx");
        file2.add("Архитектура и живопись Барокко.pptx");
        file2.add("Кольцевая очередь.mp4");
        file2.add("Локальные максимумы и минимумы.mp4");
        file2.add("Односвязный список.png");
        file2.add("Особенности культуры Японии.pptx");
        file2.add("Очередь.png");
        file2.add("Художественная культура.pptx");

        for (int i = 0; i < file1.size(); i++) {
            Assert.assertEquals(file2.get(i), file1.get(i));
        }
    }

    @Test
    public void testComparator4() {
        FileSort fileSort = new FileSort();
        List<String> file1 = fileSort.getList();
        List<String> file2 = new ArrayList<>();

        file1.sort(fileSort.comparator4);

        file2.add("Художественная культура.pptx");
        file2.add("Очередь.png");
        file2.add("Особенности культуры Японии.pptx");
        file2.add("Односвязный список.png");
        file2.add("Локальные максимумы и минимумы.mp4");
        file2.add("Кольцевая очередь.mp4");
        file2.add("Архитектура и живопись Барокко.pptx");
        file2.add("Антропогенез.pptx");
        file2.add("demidovich_sbornik.pdf");
        file2.add("Math.pdf");
        file2.add("Java. Библиотека профессионала. Кей Хорстманн.pdf");
        file2.add("Iokhannes_Itten_Iskusstvo_tsveta.pdf");

        for (int i = 0; i < file1.size(); i++) {
            Assert.assertEquals(file2.get(i), file1.get(i));
        }
    }
}
