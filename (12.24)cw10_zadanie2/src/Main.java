public class Main {

    public static void main(String[] args) {
	    TickTock tt = new TickTock();
        MyThread myThread1 = MyThread.createAndStart("tik", tt);
        MyThread myThread2 = MyThread.createAndStart("tok", tt);
        try{
            myThread1.thread.join();
            myThread2.thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
