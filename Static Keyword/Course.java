public class Course {
    public String name;
    public int note; //for objects
    public static int count=0; //static ** belonging to the class

    public Course(String name, int note){
        this.name=name;
        this.note=note;
        count++;
    }
    public void login(){
        count++;
    }
     public static void showName(){
         System.out.println();
     }
}
