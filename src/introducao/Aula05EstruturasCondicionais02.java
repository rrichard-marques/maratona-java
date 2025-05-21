package introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {

        // idade > 15 categoria infantil
        // idade >= 15 && < 18 categoria juvenil
        // idade >= 18 categoria adulta

        int idade = 20;

        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        } if (idade > 18) {
            System.out.println("Categoria Adulto");
        }
    }
}
