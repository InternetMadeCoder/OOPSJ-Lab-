import java.util.concurrent.Semaphore;

class SharedResource {
    private Semaphore semaphore = new Semaphore(1);

    public void accessResource(String threadName) {
        try {
            semaphore.acquire();
            System.out.println(threadName + " accessed the resource.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(threadName + " released the resource.");
            semaphore.release();
        }
    }
}

class SemaphoreThread extends Thread {
    private SharedResource resource;
    private String name;

    public SemaphoreThread(SharedResource resource, String name) {
        this.resource = resource;
        this.name = name;
    }

    @Override
    public void run() {
        resource.accessResource(name);
    }
}

public class Prob4 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread t1 = new SemaphoreThread(resource, "Thread 1");
        Thread t2 = new SemaphoreThread(resource, "Thread 2");

        t1.start();
        t2.start();
    }
} 