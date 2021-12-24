public class NewThread implements Runnable{

    Thread thread;
    public NewThread(String name){
        thread = new Thread(this, name);
    }

    public static NewThread createAndStart(String name){
        NewThread newThread = new NewThread(name);
        newThread.thread.start();
        return  newThread;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " started");
        try{
            for (int a = 0; a < 10; a++){
                Thread.sleep(400);
                System.out.println(thread.getName() + " is running, counter is " + a);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(thread.getName() + " finished");
    }
}
