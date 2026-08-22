// Extend Thread
class Hi extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.err.println("Hi");
            try { Thread.sleep(1000); } catch (Exception e) { e.printStackTrace(); }
        }
    }
}

class Hukunam extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.err.println("Huku");
            try { Thread.sleep(1000); } catch (Exception e) { e.printStackTrace(); }
        }
    }
}

class Methodreading {
    public static void main(String[] args) {
        Hi n1 = new Hi();
        Hukunam n2 = new Hukunam();
        
        // Use start() to trigger the new threads
        n1.start();
        n2.start();
    }
}