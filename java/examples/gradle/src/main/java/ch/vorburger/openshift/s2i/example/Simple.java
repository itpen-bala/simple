package ch.vorburger.openshift.s2i.example;

class Simple {

    public static void main(String[] args) {

        while(true) {
            System.out.println("Sleeping...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}