public class MyThread implements Runnable{

    Thread thread;
    TickTock tt;
    public MyThread(String name, TickTock tt){
        thread = new Thread(this, name);
        this.tt = tt;
    }

    public static MyThread createAndStart(String name, TickTock tt){
        MyThread myThread = new MyThread(name, tt);
        myThread.thread.start();
        return myThread;
    }

    @Override
    public void run() {
        if(thread.getName().compareTo("tik") == 0){
            for(int a = 0; a < 5; a++){
                tt.tick(true);
            }
            tt.tick(false);
        }
        else{
            for(int a = 0; a < 5; a++){
                tt.tock(true);
            }
            tt.tock(false);
        }
    }
}
