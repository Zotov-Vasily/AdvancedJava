package JavaMultithreading;

import java.util.concurrent.Semaphore;

public class FirstSem {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(1);
        CommonResource resource = new CommonResource();
        new Thread(new CountThread(resource, semaphore, "CountThread 1")).start();
        new Thread(new CountThread(resource, semaphore, "CountThread 2")).start();
        new Thread(new CountThread(resource, semaphore, "CountThread 3")).start();
    }
}

class CommonResource{
    int x = 0;
}

class CountThread implements Runnable {

    CommonResource resource;
    Semaphore semaphore;
    String name;

    public CountThread(CommonResource resource, Semaphore semaphore, String name) {
        this.resource = resource;
        this.semaphore = semaphore;
        this.name = name;
    }


    @Override
    public void run() {

        try {
            System.out.println(name + " ожидает разрешение");
            semaphore.acquire();
            resource.x = 1;
            for (int i = 1; i < 5; i++){
                System.out.println(this.name + ": " + resource.x);
                resource.x++;
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println(name + " освобождает разрешение");
        semaphore.release();

    }
}
