/*
    Given two strings str1 and str2 and below operations that can performed on str1. 
    Find minimum number of edits (operations) required to convert ‘str1’ into ‘str2’.
        1.Insert
        2.Remove
        3Replace
*/
package Edit_Distance;
import java.util.Arrays;
import java.util.Scanner;
public class EditDistace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(EditStringDistance(str1, str2, str1.length(), str2.length()));
    }
    public static int EditStringDistance(String str1, String str2, int x, int y) {
        int table[][] = new int[x+1][y+1];
        for(int i=0; i<=x; i++) {
            for(int j=0; j<=y; j++) {
                if(i==0) 
                    table[i][j] = j;
                else if(j==0) 
                    table[i][j] = i;
                else if(str1.charAt(i-1) == str2.charAt(j-1)) 
                    table[i][j] = table[i-1][j-1];
                else 
                    table[i][j] = 1 + min(table[i][j-1], 
                                      table[i-1][j],        
                                      table[i-1][j-1]);
            }
        }
        
        for(int items[]:table) {
            System.out.print(Arrays.toString(items));
            System.out.println();
        }
        return table[x][y];
    }
    private static int min(int i, int i0, int i1) {
        if(i > i0)          return Math.min(i0, i1);
        else if (i > i1)    return Math.min(i0, i1);
        else                return i;
    }
}
/*
    Algorithm
    if  str1[i-1] == str2[j-1]
        t[i][j] == t[i-1][j-1];
    else
        t[i][j] = min(t[i][j-1], t[i-1][j], t[i-1][j-1])
*/