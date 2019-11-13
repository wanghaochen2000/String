package Strig;

public class Strig 
{
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


    }
}
