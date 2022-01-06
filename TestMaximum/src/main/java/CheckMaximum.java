/*
* @author Atul Srivastav
* @date 5/5/2022
* Generics Programs
* */

public class CheckMaximum {
    /*
     * findMax method with three E @param
     * @return E
     * checking maximum among three values using GENERICS.
     * */
    public static <E extends Comparable<E>> E findMax(E a,E b,E c)
    {
        if((a.compareTo(b)>0)&&(a.compareTo(c)>0))
            return a;
        else
        if((b.compareTo(a)>0)&&(b.compareTo(c)>0))
            return b;
        else
            return c;
    }


    public static void main(String[] ar)
    {
        //calling findMax method with 3 integer values.
        System.out.println("5,16,9 and max is: "+findMax(5,16,9));
        //float variable declarations
        float a=5.6f;
        float b=16.6f;
        float c=9.2f;
        //calling findMax method with float values.
        System.out.println("5.4,16.6,9.2 and max is: "+findMax(a,b,c));
        //calling findMax method with string values.
        System.out.println("Apple,Peach,Banana and max is: "+findMax("Apple","Peach","Banana"));
    }
}
