import java.util.*;
public class string {
public static void main(String[] args)
   {
      String[] L = {"0", "1", "10", "11", "100", "101", "111"};
      String[] M  = {"00", "01", "001", "11", "0100", "101", "0111"};
      String num = "";
      HashSet <String> newset = new HashSet <String>();
      List<String> list = new ArrayList<>();

      for(int i=0; i<7; i++){
        for(int j=0; j <7; j++){
            num = M[i] + L[j];
            String reverse = new StringBuffer(num).reverse().toString();
            list.add(reverse);
            num ="";
          }
        }
        List<String> list2 = new ArrayList<String>();
        HashSet<String> lookup = new HashSet<String>();
        for (String item : list) {
          if (lookup.add(item)) {
            list2.add(item);
          }
        }
        list = list2;
        System.out.println(list);
 }
}
