package candidatura;
import java.util.concurrent.ThreadLocalRandom;;

public class processoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
        //System.out.println("Processo Seletivo!");

    }

        static void imprimirSelecionados(){
            String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
            System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

            for(int indice=0; indice < candidatos.length; indice++){
                System.out.println("O candidato de nª" + (indice+1) + " é o " + candidatos[indice]);
            }

            System.out.println("Forma abreviada  de interação for each");

            for (String candidato: candidatos)  {
                System.out.println("O candidato selecionado foi " + candidato);
            }

        }

    static void selecaoCandidatos(){

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

            while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
                
                String candidato = candidatos [candidatosAtual];
                double salarioPretendido = valorPretendido();


                System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
                if (salarioBase >= salarioPretendido) {
                        System.out.println("O candidato " + candidato + " foi selecionado para vaga");
                        candidatosSelecionados++;                    
                }
                candidatosAtual++;
            }

    }

        static double valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
        }


    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) { 
        System.out.println("LIGAR PARA O CANDIDATO");

    } else if(salarioBase == salarioPretendido)

    System.out.println(" LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    else {
        System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
    }

    //Arrays com a lista de candidatos

}

