package JavaMultithreading;

import java.util.concurrent.Semaphore;

public class SecondSem {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(2);
        for (int i = 1; i < 6; i++)
            new Philosopher(semaphore, i).start();
    }
}

class Philosopher extends Thread {
    Semaphore semaphore;
    int num = 0;
    int id;

    Philosopher(Semaphore semaphore, int id){
        this.semaphore = semaphore;
        this.id = id;
    }

    public void run() {
        try {
            while (num < 3) {
                semaphore.acquire();
                System.out.println("Философ " + id+" садится за стол");
                sleep(500);
                num++;

                System.out.println("Философ " + id+" выходит из-за стола");
                semaphore.release();
            }
        }
        catch (InterruptedException e) {
            System.out.println("у философа " + id + " проблемы со здоровьем");
        }
    }
}
