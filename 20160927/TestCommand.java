public class TestCommand
{
       public static void main(String[] args)
      {
            ProcessArray pa = new ProcessArray();
             int[] target = {3, -4, 6, 4};
             //第一次处理数组，具体处理行为取决于PrintCommand
            pa.process(target , new PrintCommand());
            System. out.println("------------------" );
             //第二次处理数组，具体处理行为取决于AddCommand
            pa.process(target , new AddCommand());
      }
}



//迭代输出目标数组的元素:3
//迭代输出目标数组的元素:-4
//迭代输出目标数组的元素:6
//迭代输出目标数组的元素:4
//------------------
//数组元素的总和是:9
