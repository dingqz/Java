import java.util.*;

public class TestForeach
{
       public static void main(String[] args)
      {
             //创建一个集合
             Collection books = new HashSet();
             books.add(new String("轻量级J2EE企业应用实战" ));
             books.add(new String("Struts2权威指南"));
             books.add(new String("基于J2EE的Ajax宝典"));
             for (Object obj : books)
            {
                  String book = (String)obj;
                  System. out.println(book);
                   if (book.equals("Struts2权威指南" ))
                  {
                         //下面代码会引发ConcurrentModificationException异常
                        books.remove(book);
                  }
            }
            System. out.println(books);
      }
}


//Struts2权威指南
//Exception in thread "main" java.util.ConcurrentModificationException
//	at java.util.HashMap$HashIterator.nextEntry(HashMap.java:793)
//	at java.util.HashMap$KeyIterator.next(HashMap.java:828)
//	at TestForeach.main(TestForeach.java:12)
