public class NewThread implements Runnable
{
    private int id; // Aufgabe2

    NewThread (int id) // eine ID braucht man damit man die Veränderung bzw. den Unterschied bei Aufgabe 1 sieht
    {
        this.id = id;
    }


    @Override // gehört zu Interfaces
    public void run ()
    {
        System.out.println("Hello Thread");

        try {
                Thread.sleep(5000); // Aufgabe 2
            } catch (InterruptedException e)
        {
                e.printStackTrace();
            }

    }

    public static void main (String[] args)
    {

        for (int i = 0; i < 5; i++)
        {
            NewThread newThread = new NewThread(i);
            Thread thread = new Thread(newThread);

            // immer nur eines hernehmen
            thread.start(); // gibt ohne Sortierung aus, führt es gleichzeitig aus, dauert nich lange
            //thread.run(); //gibt mit Sortierung an, WEIL er es nicht gleichzeitig ausführt, führt es nicht gleichzeitig aus
        }
    }
}
