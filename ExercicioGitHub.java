public class ExercicioGitHub{
  public static void main(String[] args) {

    String nomeUsuario = "José";
    String cpf = "123.456.789-00"; 
        
    System.out.println("Iniciando o sistema de cadastro para: " + nomeUsuario);
    String cpfLimpo = cpf.replace(".", "").replace("-", "");

      if (cpfLimpo.length() == 11) {
        System.out.println("Erro: CPF inválido! O cadastro foi bloqueado.");
      } 
      else {
        System.out.println("Sucesso! O CPF foi validado e o cadastro concluído.");
      }
  }
}
