import java.io.PrintWriter;

public class TesteTipoDeRetorno {
    public static void main(String[] args) throws Exception{
        System.out.println("oi");

        PrintWriter escritor = new PrintWriter("Arquivo.txt");

        escritor.write("texto");

        double raiz = Math.sqrt(2);

        System.out.println(raiz);
    }
}
