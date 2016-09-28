/**
 * Description:
 * <br/>Copyright (C), 2005 -2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

public class TestJavadocTag{
	
	public String hello(String name){
		return name + ",hi";
	}
	
	public static void main(String[] args){
		System.out.println("Hello,World!");
		System.out.println(new TestJavadocTag().hello("dingqz"));
	}
}

//Hello,World!
//dingqz,hi
