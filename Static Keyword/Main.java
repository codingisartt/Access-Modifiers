public class Main {

    public static void main(String[] args) {
    
        Course mat=new Course("Matematik", 70);
        Course fizik=new Course("Matematik", 20);
        Course kimya=new Course("Matematik", 100);

        //int[] notlar={70,20,100};
        Course[] dersler={mat,fizik, kimya};// classes can hold objects
        Calculate.calcAverage(dersler);
        Course.showName();
    }
}