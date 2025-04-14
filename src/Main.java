

public class Main {
    public static void main (String [] args){
        Gerente gerente = new Gerente();

            gerente.setNome("Gabriel");
            gerente.setLogin("Gabriel@gmail.com");
            gerente.setSenha(12345678);

            System.out.println(gerente.getNome());
            System.out.println(gerente.getLogin());
            System.out.println(gerente.getSenha());

    }
    
}
