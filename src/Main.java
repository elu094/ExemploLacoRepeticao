import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] nomesJogadores = new String[10];
        Scanner sc = new Scanner(System.in);

        //inicialização; condição; incremento;
        // ++ -> vai somar +1 i = i + 1
        for (int i = 0; i < 10; i++) {
            System.out.println("informe o nome do Player " + i);
            nomesJogadores[i] = sc.next();
        }

        // Pedir o nome do time A (5 nomes)
        // Pedir os nomes do time A
        // Pedir o nome do time B
        // Pedir os nomes do time B (5 nomes)

        System.out.println("informe o time A");
        String nomeTimeA = sc.next();

        String[] nomePlayersTimeA = new String[5];

        for (int i = 0; +i < 5; i++) {
            System.out.println("informe o Player" + i);
            nomePlayersTimeA[i] = sc.next();
        }
        System.out.println("informe o time A");
        String nomeTimeB = sc.next();

        String[] nomePlayersTimeB = new String[5];

        for (int i = 0; +i < 5; i++) {
            System.out.println("informe o Player" + i);
            nomePlayersTimeB[i] = sc.next();

        }
    }}