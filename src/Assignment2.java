//Basic Student Grading System
//Create three students with:

//String name
//
//        int mark1, mark2, mark3
//
//Calculate:
//
//Total marks
//
//Average (using arithmetic operators)
//
//Check if the student passed:
//Condition: average >= 50
//
//Print a report for each student:
//
//Name
//
//        Marks
//
//Average
//
//Pass/Fail
//
public class Assignment2 {
    public static void main(String[] args){
       String std1 = "Christine";
       int mrk1 = 40, mrk2 = 70, mrk3= 90;
       int totalstd1 = mrk1 + mrk2 + mrk3;
       int avrg1 = totalstd1/3;
       boolean pass = avrg1 >= 50;

       System.out.println("........report........");
       System.out.println("student name:"+ std1);
       System.out.println("Total marks:"+ totalstd1);
       System.out.println("Avrage score:"+ avrg1);
       System.out.println("passed/failed:"+ pass);

    }
}
