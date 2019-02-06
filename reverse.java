import java.util.*;
public class reverse {
public static void main(String[] args)
   {
      String[] L = {"0", "1", "10", "11", "100", "101", "111"};
      String[] M  = {"00", "01", "001", "11", "0100", "101", "0111"};
      String[] LL = {"00", "01", "010", "011", "0100", "0101", "0111", "10", "11", "110", "111", "1100",
        "1101", "1111", "100", "101", "1010", "1011", "10100", "10101", "10111", "1110", "11100", "11101", "11111",
        "1000", "1001", "10010", "10011", "100100", "100101", "100111", "10110", "101100", "101101", "101111",
        "11110", "111100", "111101", "111111"};
      String num = "";
      HashSet <String> newset = new HashSet <String>();
      List<String> list = new ArrayList<>();

      for(int i=0; i<40; i++){
            for(int j=0; j <7; j++){
                String moo = M[j];
                String mu = LL[i];
                String reverseM = new StringBuffer(moo).reverse().toString();
                num = mu + reverseM;
                list.add(num);
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
