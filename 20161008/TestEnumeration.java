import java.util.*;

public class TestEnumeration
{
       public static void main(String[] args)
      {
             Vector v = new Vector();
             v.add("Struts2权威指南");
             v.add("轻量级J2EE企业应用实战");
             Hashtable scores = new Hashtable();
             scores.put("语文" , 78) ;
             scores.put("数学" , 88) ;
             Enumeration em = v.elements();
             while (em.hasMoreElements())
            {
                  System. out.println(em.nextElement());
            }
             Enumeration keyEm = scores.keys();
             while (keyEm.hasMoreElements())
            {
                  Object key = keyEm.nextElement();
                  System. out.print(key + "--->" );
                  System. out.print(scores.get(key) + "\n" );
            }
      }
}


//Struts2权威指南
//轻量级J2EE企业应用实战
//语文--->78
//数学--->88
