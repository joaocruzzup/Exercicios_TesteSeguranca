package Seguranca;

public class MainCriptografia {

    public static void main(String[] args) {

    }
    public static String criptografar(String mensagem, int chave) {
        String Criptmensagem = "";
        for(int i = 0; i < mensagem.length(); i++) {
            Criptmensagem += (char) (mensagem.charAt(i) + chave);
        }
        return Criptmensagem;
    }
}
