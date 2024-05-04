public class Operadores6 {

    public static void main(String[] args) {

        String nomeUm = "Dell";
        String nomeDois = new String("Dell");
        // usando equals consigo comparar se os valores de 2 ou mais objetos são iguais
        System.out.println(nomeUm.equals(nomeDois));

        int numeroUm = 5;
        int numeroDois = 6;

        boolean simNao = numeroUm == numeroDois;

        if (numeroUm > numeroDois) {
            System.out.println("A nossa condição é: " + simNao);
        } else {
            System.out.println("A nossa condição é: " + simNao);
        }
    }
}
