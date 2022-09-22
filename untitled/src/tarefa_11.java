import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class tarefa_11 {

    public static void main(String args[]) {
        listaDeCadastro();
    }

    private static String listaDeCadastro() {
        System.out.println("**** Lista de Cadastro ****");
            List<Scanner> lista = new ArrayList<>();
            Scanner Contato = new Scanner(System.in);
            String a;
            System.out.println(" Entre com seu nome ");

            System.out.println(" Entre com seu Sexo ");
            String sexo = Contato.next();

       // Contato a = new Contato("Thiago", "M");
//        Contato b = new Contato("Gabriel", "M");
//        Contato c = new Contato("Fernanda", "F");
//        Contato d = new Contato("Thais", "F");

        lista.add( Contato);
//        lista.add(b);
//        lista.add(c);
//        lista.add(d);
        //System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);


        return null;
    }
}
