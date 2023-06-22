package Seguranca;
public class MainCriptografia {

    public static void main(String[] args) {
        int chave = 11;
        String mensagem = "A turma 5 do Catalisa é a melhor pq SIM!!!";
        String mensagemCriptofrada = criptografar(mensagem, chave);
        String mensagemDescriptografada = descriptografar(mensagemCriptofrada,chave);

        System.out.println("Mensagem criptografada: " + mensagemCriptofrada);
        System.out.println("Mensagem descriptografada: " + mensagemDescriptografada);
    }

    public static String criptografar(String mensagem, int chave) {
        String Criptmensagem = "";
        for (int i = 0; i < mensagem.length(); i++) {
            Criptmensagem += (char) (mensagem.charAt(i) + chave);
        }
        return Criptmensagem;
    }

    public static String descriptografar(String mensagemCriptografada, int chave) {
        String Descriptmensagem = "";
        for (int i = 0; i < mensagemCriptografada.length(); i++) {
            Descriptmensagem += (char) (mensagemCriptografada.charAt(i) - chave);
        }
        return Descriptmensagem;
    }
}
