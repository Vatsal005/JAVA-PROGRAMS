/* 
Declare a class called coordinate to represent 3 dimensional Cartesian coordinates( x, y and z). Define following methods: 
- constructor
- display, to print values of members
- add_coordinates, to add three such coordinate objects to produce a resultant coordinate object. 
- main, to show use of above methods.
*/

import java.util.Scanner;

public class Co_ordinates{
    float total_x, total_y, total_z;
    float x1,y1,z1,x2,y2,z2;
    Co_ordinates(){}
    Co_ordinates(float x1,float y1,float z1,float x2,float y2,float z2){
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }
    void getval(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n");
        System.out.print("Enter X1 : ");
        x1 = sc.nextInt();
        System.out.print("Enter y1 : ");
        y1 = sc.nextInt();
        System.out.print("Enter z1 : ");
        z1 = sc.nextInt();
        System.out.print("Enter X2 : ");
        x2 = sc.nextInt();
        System.out.print("Enter y2 : ");
        y2 = sc.nextInt();
        System.out.print("Enter z2 : ");
        z2 = sc.nextInt();
    }
    void display(){
        total_x = x1+ x2;
        total_y = y1+ y2;
        total_z = z1+ z2;
        float result = total_x+total_y+total_z;
        System.out.println("===============================");
        System.out.println("The Result is : "+result+"\n");
    }
    public static void main(String[] args) {
        Co_ordinates co = new Co_ordinates();
        co.getval();
        co.display();
    }    
}
