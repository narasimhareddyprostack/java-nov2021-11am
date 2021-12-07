import java.io.*;
public class Demo{
public static void main(String[] args) {
	 try{
        PrintWriter  p  = new PrintWriter("abc.txt");
        p.println("Hello, GM");
        }
     catch(FileNotFoundException e){
            System.out.print(e);
        }
       
	}
}