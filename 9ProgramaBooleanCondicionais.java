package TestaCaracteres;

public class ProgramaBooleanCondicionais {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 22;
        boolean acompanhado = true;

        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente voc� n�o pode entrar");
        }
    }
}