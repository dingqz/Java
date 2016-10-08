import java.util.*;

public class TestLinkedList2
{
       public static void main(String[] args)
      {
             LinkedList books = new LinkedList();
             //将字符串元素加入队列的尾部
             books.offer("Struts2权威指南");
             books.offer("Struts2权威指南2");
             //将一个字符串元素入栈
             books.push("轻量级J2EE企业应用实战");
             books.push("轻量级J2EE企业应用实战2");
             //将字符串元素添加到队列的头部
             books.offerFirst("ROR敏捷开发最佳实践");
             books.offerFirst("ROR敏捷开发最佳实践2");
             
             System.out.println(books);
             for (int i = 0; i < books.size() ; i++ )
            {
                  System. out.println(books.get(i));
            }
             System.out.println("------------------");
             
             //访问、并不删除队列的第一个元素
            System. out.println(books.peekFirst());
             //访问、并不删除队列的最后一个元素
            System. out.println(books.peekLast());
             //采用出栈的方式将第一个元素pop出队列
            System. out.println(books.pop());
             //下面输出将看到队列中第一个元素被删除
            System. out.println(books);
             //访问、并删除队列的最后一个元素
            System. out.println(books.pollLast());
             //下面输出
            System. out.println(books);

      }
}

//[ROR敏捷开发最佳实践2, ROR敏捷开发最佳实践, 轻量级J2EE企业应用实战2, 轻量级J2EE企业应用实战, Struts2权威指南, Struts2权威指南2]
//ROR敏捷开发最佳实践2
//ROR敏捷开发最佳实践
//轻量级J2EE企业应用实战2
//轻量级J2EE企业应用实战
//Struts2权威指南
//Struts2权威指南2
//------------------
//ROR敏捷开发最佳实践2
//Struts2权威指南2
//ROR敏捷开发最佳实践2
//[ROR敏捷开发最佳实践, 轻量级J2EE企业应用实战2, 轻量级J2EE企业应用实战, Struts2权威指南, Struts2权威指南2]
//Struts2权威指南2
//[ROR敏捷开发最佳实践, 轻量级J2EE企业应用实战2, 轻量级J2EE企业应用实战, Struts2权威指南]



