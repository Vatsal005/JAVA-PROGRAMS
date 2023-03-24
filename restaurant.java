package assignment.pkg7;

import java.util.Scanner;

class data{
    String name;
    int product;
    int coupn;
    int quantity;
    String[] r_manu = new String[] {
        "IP","MD,","JMD","GS","CS","B"
    };
    int[] r_prize = new int[]{
        150,140,110,150,180,100
    };
}
class bill extends data{
    void manu(){
        System.out.println("          Order Now        ");
        System.out.println("============================");
        System.out.println("   Product           Prize");
        System.out.println("1.Italian Pizza      150rs");
        System.out.println("2.Masala Dhosa       140rs");
        System.out.println("3.Jain Masala Dhosa  110rs");
        System.out.println("4.Grill Sandwitch    150rs");
        System.out.println("5.Cheez Sandwitch    180rs");
        System.out.println("6.Burger             100rs");
        System.out.println("7.To Exit");
    }
    void take_order(int exit){
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose One : ");
        product = sc.nextInt();
        if(product == 7){
            return;
        }
        System.out.println("============================");
        System.out.print("Enter Quantity : ");
        quantity = sc.nextInt();
        System.out.println("============================");
        take_order(product);
    }
    void coupen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\tChoose Coupen with Luck");
        System.out.println("1.A \n2.B \n3.C \n4.D \n5.No Code");
        System.out.print("Enter one : ");
        coupn = sc.nextInt();
    }
    void bill(){
        System.out.println("============================");
        System.out.println("");
    }
    
}

public class restaurant {
    public static void main(String args[]){
        bill b = new bill();
        b.manu();
        b.take_order(1);
        b.coupen();
    }
}