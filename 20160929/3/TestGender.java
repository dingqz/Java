public class TestGender
{
       public static void main(String[] args)
      {
            Gender g = Enum. valueOf(Gender.class , "FEMALE");
            System. out.println(g + "代表:" + g.getName());
            g.info();
      }
}


//FEMALE代表:女
//这个枚举值代表女性
