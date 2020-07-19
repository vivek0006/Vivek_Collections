import java.util.ArrayList;
import java.util.Scanner;

class DemoList
{
    ArrayList<Integer> list=new ArrayList<Integer>();
    void add(int element)
    {
        list.add(element);
    }
    int get(int position)
    {
        return list.get(position);
    }
    int position(int element)
    {
        return list.indexOf(element);
    }
    void remove(int position)
    {
        list.remove(list.get(position));
    }
    void removelast()
    {
        list.remove(list.get(list.size()-1));
    }
    void print()
    {
        System.out.print(list);
        System.out.println();
    }
}
public class List
{
    private static Scanner s;

	public static void main(String args[])
    {
        DemoList demoList=new DemoList();
        s = new Scanner(System.in);
        System.out.println("Enter integers from 1-5");
        
        int ch;
        while (s.hasNext())
        {
            ch=s.nextInt();
            if(ch==1)
            {
                demoList.add(s.nextInt());
            }
            else if(ch==2)
            {
                System.out.println("Element is:"+demoList.get(s.nextInt()));
            }
            else if(ch==3)
            {
                System.out.println("Position is:"+demoList.position(s.nextInt()));
            }
            else if(ch==4)
            {
                demoList.remove(s.nextInt());
            }
            else if(ch==5)
            {
                demoList.removelast();
            }
            else
            {
                demoList.print();
            }
        }
    }
}