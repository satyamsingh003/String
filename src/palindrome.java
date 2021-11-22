import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String original,reverse="";
        Scanner sc = new Scanner(System.in);
        original=sc.nextLine();
        for(int i=original.length()-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        if (original.equals(reverse)){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not a palindrome number");
        }
    }
}
