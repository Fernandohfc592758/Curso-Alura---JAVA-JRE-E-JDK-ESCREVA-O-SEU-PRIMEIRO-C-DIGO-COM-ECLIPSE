package TestaCaracteres;

public class ProgramaTestaCondicionais {

    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 25;
        int quantidadePessoas = 4;

        if (idade >= 18) {

            System.out.println("Você tem mais que 18 anos");
            System.out.println("Seja bem vindo ao clube!!!");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("voce nao tem 18, mas pode entrar, pois está acompanhado");
            } else {

                System.out.println("infelizmente voce nao pode entrar");
            }
        }
    }

}
