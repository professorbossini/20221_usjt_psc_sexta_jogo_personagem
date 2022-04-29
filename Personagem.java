public class Personagem{
    //atributos(variáveis)
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    
    //comportamentos(métodos)
    
    //tipo de retorno
    //nome
    //lista de parâmetros
    //corpo
    
    void cacar(){
        if(energia >= 2){
            System.out.println(nome + " caçando...");
            //energia = energia - 2;
            energia -= 2;
        }
        else{
            System.out.printf ("%s sem energia para caçar...\n", nome);
        }
        fome = fome + 1 <= 10 ? fome + 1 : 10;
        sono = Math.min(sono + 1, 10);
    }

    //tipo de retorno
    //nome
    //lista de parametros
    //corpo
    void comer(){
        if (fome >= 1){
            System.out.println(nome + " comendo...");
            energia = Math.min(energia + 1, 10);
            fome--;
        }
        else{
            System.out.printf("%s sem fome...\n", nome);
        }
    }

    void dormir(){
        if (sono >= 1){
            System.out.printf("%s dormindo...", nome);
            energia = energia + 1 <= 10 ? energia + 1 : 10;
            //sono = sono - 1;
            //sono -= 1;
            //sono--;
            --sono;
        }
        else{
            System.out.printf("%s sem sono...\n", nome);
            //String s = String.format("%s sem sono...\n", nome);
        }

    }
}