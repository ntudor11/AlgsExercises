public class MyTask implements Runnable {

  @Override
  public void run(){
    System.out.println("A thread.");
  }

  public static void main(String[] args){
    MyTask task1 = new MyTask();
    Thread t1 = new Thread(task1);
    t1.start();
  }
}
