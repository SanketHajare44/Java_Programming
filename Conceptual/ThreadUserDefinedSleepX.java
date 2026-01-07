// Code to demonstrate thread scheduling
class Demo extends Thread
{
    public void run()
    {
        int i = 0;
        try
        {
            for(i = 1; i <= 5; i++)
            {
                Thread.sleep(1000);
                System.out.println("Inside run method of : "+Thread.currentThread().getName());
            }
        }
        catch(InterruptedException iobj)
        {}
    }
}

class ThreadUserDefinedSleepX
{
    public static void main(String A[])
    {
        System.out.println("Inside main thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");
 
        try
        {        
            dobj1.start();
            dobj2.start();

            dobj2.join();
            dobj1.join();
        }
        catch(InterruptedException iobj)
        {}

        System.out.println("End of main thread");
    }
}