import java.util.*;

class M
{
       int age ;
       public M(int age)
      {
             this.age = age;
      }
}
class N
{
       int age ;
       public N(int age)
      {
             this.age = age;
      }
}
public class TestTreeSet3
{
       public static void main(String[] args)
      {
             TreeSet ts = new TreeSet( new Comparator()
            {
                   public int compare(Object o1, Object o2)
                  {
                         int age1 = o1 instanceof M ? ((M)o1). age :((N)o1).age ;
                         int age2 = o1 instanceof M ? ((M)o2). age :((N)o2).age ;
                         return age1 - age2;

                         /*
                        M m1 = (M)o1;
                        M m2 = (M)o2;

                        if (m1.age > m2.age)
                        {
                              return -1;
                        }
                        else if (m1.age == m2.age)
                        {
                              return 0;
                        }
                        else
                        {
                              return 1;
                        }
                        */
                  }
            }) ;   
             ts.add(new M(5));
             ts.add(new M(-3));
             ts.add(new N(9));
            System. out.println(ts);
      }
}


//Exception in thread "main" java.lang.ClassCastException: M cannot be cast to N
//at TestTreeSet3$1.compare(TestTreeSet3.java:28)
//at java.util.TreeMap.put(TreeMap.java:530)
//at java.util.TreeSet.add(TreeSet.java:238)
//at TestTreeSet3.main(TestTreeSet3.java:52)


