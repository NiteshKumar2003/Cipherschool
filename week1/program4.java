package week1;

public class program4 {
    public static void main(String[] args) {
        char ch='A';
        while(ch<=90) {
            System.out.println(ch + " ");
            ch++;
        }
        do{
            System.out.print(ch + " ");
            ch++;
        }
        while(ch<='Z');
    }
}
