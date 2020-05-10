package com.self.lesson6.arrays;

import static com.self.util.Util.print;
import static java.util.Objects.nonNull;

import lombok.ToString;

@ToString
public class MyCustomArray<T> {

  private int length;
  private Object[] array;

  public MyCustomArray(int size) {
    array = new Object[size];
    length = 0;
  }

  void add(T a) {
    array[length] = a;
    length++;
  }

  //  int maxValue() {
  //      int value = Integer.MIN_VALUE;
  //      for(int v: array) {
  //          if(v > value) {
  //              value = v;
  //          }
  //      }
  //    return value;
  //  }

  T get(int index) {
    return (T) array[index];
  }

  int size() {
    return this.length;
  }

  // 0,1,2,3,4,5,6,7
  void delete(int index) {
    for (int i = index; i < length - 1; i++) {
      array[i] = array[i + 1];
    }
    array[length - 1] = null;
    this.length--;
  }

  boolean contains(T value) {
    for (Object element : array) {
      if (nonNull(element) && element.equals(value)) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {

    //    final MyArray<Integer> myArray = new MyArray<>(10);
    //    print(myArray.size());
    //    myArray.add(10);
    //    myArray.add(20);
    //    myArray.add(30);
    //    print(myArray.contains(20));
    //    print(myArray.contains(120));
    //    print(myArray.get(2));
    //    myArray.delete(1);
    //    print(myArray);

    final MyCustomArray<String> myCustomArray = new MyCustomArray<>(10);
    print(myCustomArray.size());
    myCustomArray.add("hey");
    myCustomArray.add("Prem");
    myCustomArray.add("Sneh");
    print(myCustomArray.contains("Prem"));
    print(myCustomArray.contains("ankit"));
    print(myCustomArray.get(2));
    myCustomArray.delete(1);
    print(myCustomArray);
    //    print(myArray.maxValue());
  }
}
