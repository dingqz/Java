public class TestTwoDimension
{
       public static void main(String[] args)
      {
             //定义一个二维数组
             int[][] a;
             //把a当成一维数组进行初始化，初始化a是一个长度为3的数组
             //a数组的数组元素又是引用类型
            a = new int [3][];
             //把a数组当成一维数组，遍历a数组的每个数组元素
             for (int i = 0; i < a.length ; i++ )
            {
                  System. out.println(a[i]);
            }
             
             
             
             //初始化a数组的第一个元素
            a[0] = new int [2];
             //访问a数组的第一个元素所指数组的第二个元素
            a[0][1] = 6;
            
            //把a数组当成一维数组，再次遍历a数组的每个数组元素
            for (int i = 0; i < a.length ; i++ )
           {
                 System. out.println(a[i]);
           }
            
             //a数组的第一个元素是一个一维数组，遍历这个一维数组
             for (int i = 0 ; i < a[0].length ; i ++ )
            {
                  System. out.println(a[0][i]);
            }
             
             
             
             
             //同时初始化二维数组的2个维数
             int[][] b = new int [3][4];
             for (int i = 0; i < b[0].length; i++) {
				System.out.println(b[0][i]);
			}
             
             
             //使用静态初始化的语法来初始化一个二维数组
            String[][] str1 = new String[][]{ new String[3]  , new String[]{"hello" }};
             //使用简化的静态初始化语法来初始化二维数组
            String[][] str2 = {new String[3]  , new String[]{"hello" }};

      }
}


//null
//null
//null
//[I@1bab50a
//null
//null
//0
//6
//0
//0
//0
//0

