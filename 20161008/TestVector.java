import java.util.*;

public class TestVector
{
       public static void main(String[] args)
      {
             Stack v = new Stack();
             //依次将三个元素push入"栈"
             v.push("Struts2权威指南");
             v.push("轻量级J2EE企业应用实战");
             v.push("ROR敏捷开发最佳实践");
             //输出：[Struts2权威指南, 轻量级J2EE企业应用实战, ROR敏捷开发最佳实践]
            System. out.println(v);
             //访问第一个元素，但并不将其pop出"栈"，输出：ROR敏捷开发最佳实践
            System. out.println(v.peek());
             //依然输出：[Struts2权威指南, 轻量级J2EE企业应用实战, ROR敏捷开发最佳实践]
            System. out.println(v);
             //pop出第一个元素，输出：ROR敏捷开发最佳实践
            System. out.println(v.pop());
             //依然输出：[Struts2权威指南, 轻量级J2EE企业应用实战]
            System. out.println(v);
      }
}


//[Struts2权威指南, 轻量级J2EE企业应用实战, ROR敏捷开发最佳实践]
//ROR敏捷开发最佳实践
//[Struts2权威指南, 轻量级J2EE企业应用实战, ROR敏捷开发最佳实践]
//ROR敏捷开发最佳实践
//[Struts2权威指南, 轻量级J2EE企业应用实战]