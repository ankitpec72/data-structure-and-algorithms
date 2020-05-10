package com.self.lesson6.arrays;

import static java.util.Objects.isNull;

import java.util.Arrays;

public class ReverseTheString {

  public static void main(String[] args) {
    String line = "Hey Ankit! How are you?";
    System.out.println(reverseTheWholeStringLine(line));
    System.out.println(reverseTheStringWords(line));
    System.out.println(reverseTheWholeStringLine("a"));
  }

  private static String reverseTheWholeStringLine(String line) {

    if (isNull(line) || line.length() < 2) {
      return line;
    }
    int totalItems = line.length() - 1;
    char[] chars = line.toCharArray();
    for (int i = 0; i < (totalItems / 2); i++) {
      char beg = chars[i];
      chars[i] = chars[totalItems - i];
      chars[totalItems - i] = beg;
    }
    return new String(chars);
  }

  private static String reverseTheStringWords(String line) {
    if (isNull(line) || line.length() < 2) {
      return line;
    }
    final String[] array = line.split(" ");
    int totalItems = array.length - 1;
    for (int i = 0; i < (totalItems / 2); i++) {
      String beg = array[i];
      array[i] = array[totalItems - i];
      array[totalItems - i] = beg;
    }
    return Arrays.toString(array);
  }
}
