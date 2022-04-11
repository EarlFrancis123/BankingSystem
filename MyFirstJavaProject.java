import java.util.Scanner;
class MyfirstJavaProject{

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int count;
        int maximun;
        int increment;

        System.out.println("Please Input a maximun count");
        maximun = input.nextInt();

        System.out.println("Please Input a increment number");
        increment = input.nextInt();
        System.out.println(maximun);
        System.out.println(increment);
      


for(count = 0 ; count <= 10; count++){
System.out.println("for loop");
}
count++;
while(count <= 10 ){
System.out.println("while loop");

}

do{

}
while(count <= 10 );
    System.out.println("do whie loop");

    


switch (count) {
    case 10: System.out.println("Case is 10");
        
        break;

    
}




input.close();

    }
}
