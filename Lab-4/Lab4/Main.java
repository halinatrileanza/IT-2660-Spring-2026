import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      long bubbleStart = System.nanoTime();
      Lab4.outputList(bubbleSortedList);
      long bubbleEnd = System.nanoTime();
      System.out.println("\nBubble sort time: " + (bubbleEnd-bubbleStart));


      System.out.println("\n\nInsertion sort results -------------------------------------------");
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);  
      long insStart = System.nanoTime();
      Lab4.outputList(insertionSortedList);
      long insEnd = System.nanoTime();
      System.out.println("\nInsertion sort time: " + (insEnd-insStart));
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here
    int n = integerList.size();
    ArrayList<Integer> list = new ArrayList<>(integerList);
    for (int i=1; i<n; i++){
      int sort = list.get(i);
      int j = i-1; 
      while(j>=0 && list.get(j) > sort) {
        list.set(j+1, list.get(j));
        j--;
      }
        list.set(j+1, sort);
    }


    return list;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    ArrayList<Integer> list = new ArrayList<>(integerList);
    int n = list.size();

    for (int i = 0; i < n - 1; i++) {
      boolean swapped = false;
      for (int j = 0; j < n - 1 - i; j++) {
        if (list.get(j) > list.get(j + 1)) {
          int sort = list.get(j);
          list.set(j, list.get(j + 1));
          list.set(j + 1, sort);
          swapped = true;
        }
      }
      if (!swapped) break;
    }
    return list;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}