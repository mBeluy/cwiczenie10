public class TickTock {
    String state;
    synchronized void tick(boolean running){
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        if(!running){
            state = "ticked";
            notify();
            return;
        }
        System.out.println("tik");
        state = "ticked";
        notify();
        try{
            while (!state.equals("tocked")){
                wait();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized  void tock(boolean runnig){
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        if(!runnig){
            state = "tocked";
            notify();
            return;
        }
        System.out.println("tak");
        state = "tocked";
        notify();
        try{
            while (!state.equals("ticked")){
                wait();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
