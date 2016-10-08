import java.util.*;

public class TestListIterator
{
       public static void main(String[] args)
      {
            String[] books = {
                   "Struts2权威指南" ,
                   "轻量级J2EE企业应用实战"
            };
             List bookList = new ArrayList();
             for (int i = 0; i < books.length ; i++ )
            {
                   bookList.add(books[i]);
            }
             ListIterator lit = bookList.listIterator();
             while (lit.hasNext())
            {
                  System. out.println(lit.next());
                   lit.add("-------分隔符-------");
            }
            System. out.println("==========下面开始反向迭代===========" );
             while(lit.hasPrevious())
            {
                  System. out.println(lit.previous());
            }
      }
}




//Struts2权威指南
//轻量级J2EE企业应用实战
//==========下面开始反向迭代===========
//-------分隔符-------
//轻量级J2EE企业应用实战
//-------分隔符-------
//Struts2权威指南
