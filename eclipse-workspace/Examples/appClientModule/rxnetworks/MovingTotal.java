package rxnetworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MovingTotal {
  List<List<Integer>> list1 = new ArrayList<>();
  public  void append(Integer[] list) {
    if (list1.size() == 0) {
      List tempList = Arrays.asList(list);
      list1.add(tempList);
    } else {
      List tempList =  new ArrayList<>();
      List temp = list1.get(list1.size()-1).subList(1, list1.get(list1.size()-1).size());
     
      tempList.addAll(temp);
      List tempList2 = Arrays.asList(list);
      tempList.addAll(tempList2);
     
      list1.add(tempList);
    }
   
  }

  public boolean find(int n) {
   
    return list1.stream()
        .map(i -> i.stream().mapToInt(j->j.intValue()).sum())
        .peek(i-> System.out.println(i))
        .collect(Collectors.toList())
        .contains(n)?true:false;
  }
  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Integer arr[] = {1,2,3};
   
    MovingTotal movingTotal = new MovingTotal();
   
    movingTotal.append(arr);
   
    System.out.println(movingTotal.find(7));
    Integer arr2[] = {4};
    movingTotal.append(arr2);
    System.out.println(movingTotal.find(9));
   
  }

}