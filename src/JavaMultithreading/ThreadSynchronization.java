package JavaMultithreading;

public class ThreadSynchronization {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Создаем и запускаем несколько потоков для одновременного изменения счета
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                account.deposit(10);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                account.winthdraw(5);
            }
        });

        thread1.start();
        thread2.start();

        // Ждем завершения работы потоков
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Печатаем итоговый баланс счета
        System.out.println("Итоговый баланс: " + account.getBalance());
    }
}

