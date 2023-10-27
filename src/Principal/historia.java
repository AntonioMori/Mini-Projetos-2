package Principal;
import java.util.Scanner;

public class historia{

    public static void output(String texto){
        System.out.println(texto);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        output("Você acordou em uma ilha deserta, mas não se lembra do que aconteceu.\n" +
        "Ao verificar os seus bolsos voce encontra uma carteira com um documento, ao ler o documento "+
        "você descobre que o seu nome é...");
        
        //criação do personagem principal
        String protagonista = input.nextLine(); //entrada do nome desejado
        personagem sobrevivente = new personagem( protagonista, "humano" ,10,1,"masculino",100);
        
        output("\nAo ler o seu nome " + protagonista + " você se lembra de como foi parar lá, mas percebe que um"+ 
        " carangueijo gigante está vindo em sua direção, o que você faz?");
        
        output("\n1 - Correr para a floresta\n2 - jogar uma pedra nele\n");

        int escolha = input.nextInt();

        if (escolha == 1) {
            
            output("\nVocê corre para a floresta e consegue fugir dele, mas agora você está com fadiga.");
            sobrevivente.addEstamina(-3);
            sobrevivente.getEstamina();
        } 
        else{
            
            //criando um personagem carangueijo gigante 
            personagem carangueijo = new personagem("carangueijo gigante","animal marinho",100,50);
            int danoCarangueijo = carangueijo.dano;//pegando o valor do dano do carangueijo
            output("\nVocê joga uma pedra nele e ele se assusta, se tornando mais agressivo ainda,"+
            " ele se aproxima e te ataca.");
            sobrevivente.addVida(-danoCarangueijo);//tirando a vida do sobrevivente de acordo com o dano do carangueijo
        }      

        input.close();
    } 
    

}