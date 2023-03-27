public class stack
{
    private int[] arr;
    int toss;
    public stack()
    {
        arr=new int[5];
        toss=-1;
    }
    public stack(int n)
    {
        arr=new int[n];
        toss=-1;
    }
    public boolean isEmpty()
    {
        return toss==-1;
    }
    public boolean isfull()
    {
        return toss==arr.length-1;
    }
    public void push(int item) throws Exception
    {
        if(isfull())
        {
            throw new Exception("Stack is full");
        }
        toss++;
        arr[toss]=item;
        

    }
    public int size()
    {
        return toss+1;
    }
    public int pop()throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("stack is empty");
        }
        int x=arr[toss];
        toss--;
        return x;
    }
    public int peek()throws Exception{
        if(isEmpty())
        {
            throw new Exception("stack is empty");
        }
        int x=arr[toss];
        
        return x;
    }
    public void Display()
    {
        for(int i=0;i<=toss;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    

    
}