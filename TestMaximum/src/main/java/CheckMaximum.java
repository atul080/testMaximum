/*
* @author Atul Srivastav
* @date 5/5/2022
* Generics Programs
* */

public class CheckMaximum {
    public static Integer findMax(Integer a,Integer b,Integer c)
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
        System.out.println("5,16,9 and max is: "+findMax(5,16,9));

    }
}
