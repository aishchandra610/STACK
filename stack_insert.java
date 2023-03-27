import java.util.Stack;
public class stack_insert
{
    public static void main(String [] args)
    {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s);
        insert(s,0);
        System.out.println(s);
    }
    public static void insert(Stack<Integer> s,int item)
    {
         if(s.isEmpty())
    {
        s.push(item);
        return;
    }
    int x=s.pop();
    insert(s,item);
    s.push(x);
    }
   
}