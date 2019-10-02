import java.util.*;

public class Questions {
    /*
    Q5.
    The count-and-say sequence is a sequence of integers with the first five terms as following:
    1.     1
    2.     11
    3.     21
    4.     1211
    5.     111221

    1 is read off as "one 1" or 11.
    11 is read off as "two 1s" or 21.
    21 is read off as "one 2, then one 1" or 1211.
    Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
    Note: Each term of the sequence of integers will be represented as a string.

    Example 1:
    Input: 1
    Output: "1"

    Example 2:
    Input: 4
    Output: "1211"
    */
    public String countAndSay(int n) {
        String s = "1";
        if (n == 1) {
            return "1";
        }

        int i = 1;
        while(i < n) {
            s = getString(s);
            i ++;
        }
        return s;

    }

    private String getString(String s) {
        StringBuilder sb = new StringBuilder();
        int j = 0;
        while (j < s.length()) {
            char val = s.charAt(j);
            int count = 0;
            while (j < s.length() && s.charAt(j) == val) {
                j ++;
                count ++;
            }
            sb.append(String.valueOf(count));
            sb.append(val);
        }

        return sb.toString();

    }

     /*Q6. Given an input string , reverse the string word by word.
    Example:
    Input : “the sky is blue”
    Output : “blue is sky the”
    Assumptions:
    A word is defined as a sequence of non-space characters.
    The input string does not contain leading or trailing spaces.
    The words are always separated by a single space.

-----------------------------------------------------------------------------------------------------------------------
*/


    public String reverseWord (String s) {
        String[] words = s.split(" ");
        StringBuilder newStr = new StringBuilder();
        for (int i = words.length-1; i > 0; i --) {
            newStr.append(words[i] + " ");
        }
        return newStr.toString();
    }


    /*
        Q7.
        Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
        Example 1:
        Input:
        [
         [ 1, 2, 3 ],
         [ 4, 5, 6 ],
         [ 7, 8, 9 ]
        ]
        Output: [1,2,3,6,9,8,7,4,5]

        Example 2:
        Input:
        [
          [1, 2, 3, 4],
          [5, 6, 7, 8],
          [9,10,11,12]
        ]
        Output: [1,2,3,4,8,12,11,10,9,5,6,7]
    -----------------------------------------------------------------------------------------------------------------------
    */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) {
            return list;
        }
        int top = 0;
        int down = matrix.length -1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (top <= down && left <= right) {
            for (int j = left; j < right + 1; j ++) {
                list.add(matrix[top][j]);
            }
            top++;

            for (int i = top; i <= down; i ++) {
                list.add(matrix[i][right]);
            }
            right--;

            if (top <= down) {
                for (int j = right; j >= left; j --) {
                    list.add(matrix[down][j]);
                }
            }
            down--;

            if (left <= right) {
                for (int i = down; i >= top; i --) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }

        return list;
    }

    /*Q8.
    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this
    P   A   H   N
    A P L S I I G
    Y   I   R
    And then read line by line: "PAHNAPLSIIGYIR"
    Write the code that will take a string and make this conversion given a number of rows:
    String convert(string s, int numRows);
    Example 1:
    Input: s = "PAYPALISHIRING", numRows = 3
    Output: "PAHNAPLSIIGYIR"

    Example 2:
    Input: s = "PAYPALISHIRING", numRows = 4
    Output: "PINALSIGYAHRPI"
    Explanation:

    P     I    N
    A   L S  I G
    Y A   H R
    P     I

-----------------------------------------------------------------------------------------------------------------------
*/

    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int l = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();

        int i = 0;
        while (i < l) {
            for (int j = 0; j < numRows && i < l; j++)
                sb[j].append(c[i++]);
            for (int j= numRows-2; j >= 1 && i < l; j--)
                sb[j].append(c[i++]);
        }
        for (int j = 1; j < sb.length; j++)
            sb[0].append(sb[j]);
        return sb[0].toString();
    }


  /*

    Q9. Explain Encapsulation with an example. (Write at least 30-40 words).

           Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds
     together code and the data it manipulates.Other way to think about encapsulation is, it is a protective shield
     that prevents the data from being accessed by the code outside this shield.


   public class Person{
       private String name;
       private int age;​
       public int getAge (){
           return age;
       }
​
       public String getName(){
           return name;
       }
​
       public void setAge(int age){
           this.age = age;
       }
​
       public void setName(String name){
           this.name = name;
       }
   }

    In the above program the class Person is encapsulated as the variables are declared as private.
    The get methods like getAge() , getName() are set as public, these methods are used to access these variables.
    The setter methods like setName(), setAge() are also declared as public and are used to set the values of the
    variables.
*/
   /*   -----------------------------------------------------------------------------------------------------------------------

    Q10. What is the difference between Encapsulation and Abstraction


    1) The most important difference is that Abstraction solves the problem at design level
        while Encapsulation solves it implementation level.

    2) Abstraction is about hiding unwanted details while giving out most essential details,
        while Encapsulation means hiding the code and data into a single unit.

    3) Abstraction lets you focus on what the object does instead of how it does,
    while Encapsulation means hiding the internal details of how an object works.
    When you keep internal working details private, you can change it later with a better method.

    4) Abstraction focus on outer lookout e.g. moving of vehicle
    while Encapsulation focuses on internal working or inner lookout e.g. how exactly the vehicle moves.

    5) In Java, Abstraction is supported using interface and abstract class
    while Encapsulation is supported using access modifiers e.g. public, private and protected.

    */

}


