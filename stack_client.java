public class stack_client
{
    public static void main(String[] args)throws Exception
    {
      stack s=new stack(); 
      s.push(5);
      s.push(10);
      s.push(15);     
      s.push(20); 
      s.push(25);  
      System.out.println(s.peek());
      System.out.println(s.pop());
      s.Display();

    }
}