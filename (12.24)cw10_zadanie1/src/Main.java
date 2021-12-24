public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread started");
        NewThread thread1 = NewThread.createAndStart("First thread");
        NewThread thread2 = NewThread.createAndStart("Second thread");
        NewThread thread3 = NewThread.createAndStart("Third thread");
        try{
            thread1.thread.join();
            thread2.thread.join();
            thread3.thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main thread finished");
    }
}
