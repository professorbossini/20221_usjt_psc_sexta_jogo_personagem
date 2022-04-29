import java.util.Random;
//alta coesão
//desejamos classes altamente coesas
public class Jogo {
    public static void main(String[] args) throws Exception{
        //variável de referência
        // Personagem p;
        // p = new Personagem();
        Personagem p = new Personagem();

        //operador de acesso a membro: .
        p.nome = "João";
        p.energia = 102;
        Random gerador = new Random();
        //1: caçar
        //2: comer
        //3: dormir
        while(true){
        //for( ; ; ){
            int oQueFazer = gerador.nextInt(3) + 1;
            //fall-through
            //lógica em queda
            switch(oQueFazer){
                case 1:
                    p.cacar();
                    break;
                case 2:
                    p.comer();
                    break;
                case 3:
                    p.dormir();
                    break;
            }
            System.out.printf("Energia: %d, Fome: %d, Sono: %d\n", p.energia, p.fome, p.sono);
            System.out.println("==============================================================");
            Thread.sleep(5000);
        }

    }
}
