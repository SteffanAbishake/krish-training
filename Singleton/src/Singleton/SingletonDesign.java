package Singleton;

public class SingletonDesign {

    private static volatile SingletonDesign exampart;

    private SingletonDesign() {
        if(exampart != null) {
            throw new RuntimeException("Please use the  getExam method");
        }

    }

    public static SingletonDesign getExam() {

        if(exampart == null) {
            synchronized (SingletonDesign.class) {
                if(exampart == null) {
                    exampart = new SingletonDesign();
                    countdown();
                }
            }
        }
        return exampart;
    }

    public static void countdown() {
        for(int j = 10; j >= 0; j--) {
            System.out.println("Remaining time :" +
                    j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            if(j==0) {
                System.out.println("Times up");
            }
        }
    }



}
