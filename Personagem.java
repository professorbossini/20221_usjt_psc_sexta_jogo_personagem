// class Point{
//     final int x, y;

//     public Point(int x, int y){
//         this.x = x;
//         this.y = y;
//     }

//     void m(){
//         Point p = new Point (2, 3);
//         System.out.println(p.x);
//     }
// }

public class Personagem{
    //atributos(variáveis)
    private String nome;
    private int energia;
    private int fome;
    private int sono;
    private final static int MAX_ENERGIA = 10;
    private final static int MIN_ENERGIA = 0;
    private final static int MAX_FOME = 10;
    private final static int MIN_FOME = 0;
    private final static int MAX_SONO = 10;
    private final static int MIN_SONO = 0;


    //método de acesso(getter)
    //tipo de retorno
    //nome
    //lista de parâmetros
    //corpo
    

    //setter
    // public void setEnergia(int energia){
    //     this.energia = energia;
    // }


    public Personagem(String nome){
        this();
        this.nome = nome;
    }

    public Personagem(){
        this(MAX_ENERGIA, MIN_FOME, MIN_SONO);
        // energia = 10;
        // fome = 0;
        // sono = 0;
    }

    public Personagem (int energia, int fome, int sono){
        //resolver o problema usando o operador ternário
        //se a energia estiver no intervalo válido, fazer a atribuição. caso contrário, atribuir 10
        //anti-pattern: números mágicos
        this.energia = energia >= MIN_ENERGIA && energia <= MAX_ENERGIA ? energia : MAX_ENERGIA;
        this.fome = fome >= MIN_FOME && fome <= MAX_FOME ? fome : MIN_FOME;
        this.sono = sono >= MIN_SONO && sono <= MAX_SONO ? sono : MIN_SONO;

        // if (energia >= 0 && energia <= 10)
        //     this.energia = energia;
        // if (fome >= 0  && fome <= 10)
        //     this.fome = fome;
        // if (sono >= 0 && sono <= 10)
        //     this.sono = sono;
    }

    
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