public class Main{
    static void main() {
        Thread thread = Thread.currentThread();
        try {
            while (true) {
                System.out.println("Проверка проекта");
                Thread.sleep(1001);
            }
        } catch (InterruptedException e){
            System.out.println("Ошибка!");
        }
    }
}
