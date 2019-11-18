实验四 字符串实验
==
一实验目的
--
    1掌握字符串String及其方法的使用
2掌握异常处理结构
3掌握利用main方法中的args数组传递
二实验要求
--
   1运用字符串的方法完成每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”允许提供输入参数，统计古诗中某个字或词出现的次数
   2 实现利用main方法中的args数组传递
三实验过程
--
   本实验有三个要求，首先完成每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。编写一个separateword类实现，运用for循环完成没7个加入一个，在7个加入。换行。从main中传入args【0】作为输入的字符串。然后是第二个要求我写了countword类实现了查找词，先用while（contains）找到那个词，找到了就加一，然后删除那个词在循环，知道没有找到退出循环。最后加入异常处理，当值是空的时候触发ArrayIndexOutOfBoundsException  提示未提供任何参数。
四流程图
--

 ![image](https://github.com/wanghaochen2000/String/blob/master/捕获.JPG)



	
五核心代码
--
public static void separateword(String d) 
	{
		String s2="";
    	for(int i=0;i<d.length()/7;i++)
    		if(i%2==0)
    			s2=s2+d.substring(0+7*i,7+7*i)+",";
    		else
    			s2=s2+d.substring(0+7*i,7+7*i)+"。";
        for(int i=0;i<s2.length()/16;i++)
        	System.out.print(s2.substring(0+16*i,16+16*i)+"\n");        
    	}
此段实现了运用for循环1.	每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”通过输入字符串长度来经行循环次数。
public static void countWord(String s,String word)
	{	
		int count = 0;		
		String s3="";		
		int index;		
		while(s.contains(word))
		{			
			count++;
		    index = s.indexOf(word);
		    s3 = s.substring(index + word.length());		
		    s = s3;			
		}	
		System.out.println("count:" + count);	
	}
此段实现了允许提供输入参数，统计古诗中某个字或词出现的次数。先是一个while循环，判断条件是字符串s中存不存在word，如果存在返回true进入循环，计数次数加一，然后删除该词然后进入下一次循环知道没有该词返回false退出循环。
  public static void main(String args[ ])
    {  	
    	try
    	{
    	String s1=args[0];
    	String s3=args[1];
    	separateword(s1);
    	countWord(s1,s3);
    	}
    	catch(ArrayIndexOutOfBoundsException ne)
    	{
   		 System.out.println("未提供任何参数！");
   	    }
    	catch(NumberFormatException nb)
    	{
    		System.out.println("不是字或者词！");
    	}
这是主函数，通过args传入字符串s1和字符串s3
然后调用separateword类实现分词，在调用countWord类实现计数。最后如果出现错误则跳出相对应的错误让调试员知道。
六系统运行截图
--
 ![image](https://github.com/wanghaochen2000/String/blob/master/123.jpg)
  ![image](https://github.com/wanghaochen2000/String/blob/master/1234.jpg)

 




七编程感想
--
   通过本次编程，我学会了字符串String及其方法的使用。掌握了异常处理结构，能利用main方法中的args数组传递。我能更好的更整洁的写java了，可以把每个功能写成一个类，然后在main里调用。灵活的运用while，for。if等基本。完成实验。

