
public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Juan","Pedro","Raul"};

        String concatenado = "";
        for (String n:nombres){
            concatenado += n + " ";
        }
        System.out.println(concatenado);


    }
}