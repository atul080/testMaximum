/*
* @author Atul Srivastav
* @date 5/5/2022
* Generics Programs
* */

import java.util.*;

public class CheckMaximum {
    /*
     * findMax method with three STRING @param
     * @return STRING
     * checking maximum among given values.
     * */
    public static <E extends Comparable<E>> void findMax(ArrayList a)
    {
        Collections.sort(a);
        //calling printMax method to print the max among the givrn inputs.
        printMax(a);
    }
    /*
    * printMax method to print the maximum among given inputs.
    * @param sorted arraylist
    * */
    public static void printMax(ArrayList a)
    {
        System.out.println("max is: "+a.get(a.size()-1));
    }

    public static void main(String[] ar)
    {
        //making object  of scanner class.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter.");
        int n=sc.nextInt();
        //declaring a arraylist by taking size from user.
        ArrayList elements=new ArrayList(n);
        //taking n elements
        System.out.println("Enter the "+n+" elements.");
        for(int i=0;i<n;i++)
            elements.add(sc.next());
        //calling findMax method to find max
        findMax(elements);
    }
}
