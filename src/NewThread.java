public class NewThread implements Runnable
{
    @Override
    public void run ()
    {
        System.out.println("Hello Thread");
    }

    public static void main (String[] args)
    {
        NewThread newThread = new NewThread();
        Thread thread = new Thread(newThread);

        thread.start();
    }
}
