/**
 * User
 */
public class User {

    public String name;
    public static int counter=0;

    static {  //shoul be in class.
        System.out.println("Ben bir static kod bloğuyum..");
        int random=(int) (Math.random()*10);
        System.out.println("Random Sayı: "+random);
        counter=random;
    }  // If static is not written, it will run every time an object is created.

    public User(String name){
        this.name=name;
        counter++;
    }
}