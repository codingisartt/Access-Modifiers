public class Calculate {
    public static void calcAverage(Course[] notes){//static method *** 
        double total=0;
        for(Course i:notes){ // this i an object. **
            total+=i.note;
        }

        double average=total/notes.length;
        System.out.println("Ortalamanız: "+average);
    }
}
