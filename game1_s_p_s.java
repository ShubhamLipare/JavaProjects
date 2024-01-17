import java.util.Scanner;
import java.util.Random;
class Play{

    int user,comp;

    public void getIp(){
        System.out.println("Enter \n 0-Stone \n 1-Paper \n2-Scissor");
        System.out.println("Enter your choise here:");
        Scanner sc=new Scanner(System.in);
        user=sc.nextInt();
    }

    public void compIp(){
        Random random=new Random();
        comp=random.nextInt(3);
        System.out.println(comp);
    }

    public void result(){
        if(user==comp){
            System.out.println("Its a draw");
        }

        else if((user==0 && comp==2) || (user==1 && comp==0) || (user==2 && comp==1)){
            System.out.println("You WON!!!!!!!!!");
        }

        else{
            System.out.println("You Lost :(");
        }
    }



}

public class game1_s_p_s {
    public static void main(String[] args){

        Play obj=new Play();
        obj.getIp();
        obj.result();
    }


}
