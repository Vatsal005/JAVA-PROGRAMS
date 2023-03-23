// Create a Java program called Person_Faculty.java. Create a class Person with data members name, birth date and gender. Create another class faculty that inherits from class Person with data member title that holds values such as “assistant professor” or “professor”. Include a constructor and get and display methods for titles.
import java.util.Scanner;

class person{
    String name,b_date,gender;
    person(){}
    person(String name, String b_date, String gender){
        this.name = name;
        this.b_date = b_date;
        this.gender = gender;
    }
}
class faculty extends person{
    int title;
    faculty(){}
    faculty(int title){
        this.title = title;
    }
    void getval(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("\n\tSelect One"+"\n1.Assistant Professor \t2.Professor");
        System.out.print("Choose one : ");
        title = sc.nextInt();
        System.out.println("======================");
        System.out.print("Enter name : ");
        name = sc.next();
        System.out.print("Enter Birth_Date : ");
        b_date = sc.next();
        System.out.print("Enter Gender : ");
        gender = sc.next();
    }
    void display(){
        System.out.println("======================");
        if(title == 1){
            System.out.println("Chosen title : Assistant Professor");
        }
        else if (title == 2) {
            System.out.println("Chosen title : Professor");
        }
        else{
            System.out.println("Invalid...");
        }
        System.out.println("======================");
        System.out.println("Name : "+name);
        System.out.println("Birth Date : "+b_date);
        System.out.println("Gender : "+gender+"\n");
    }
}
public class Person_Faculty {
    public static void main(String[] args) {
        faculty fc = new faculty();
        fc.getval();
        fc.display();
    }
}
