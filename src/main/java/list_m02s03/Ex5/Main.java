package list_m02s03.Ex5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Concurso> lista = new ArrayList<>(); //cria uma lista vazia
        Path arquivo = Paths.get("C:\\Projetos\\modulo-02\\Listas_Semanais\\Lista_Semanas_1_4\\src\\main\\java\\list_m02s03\\Ex5\\megasena.txt");

        if(Files.notExists(arquivo)) {
            System.out.println("Arquivo não encontrado!");
        }

        List<String> linhas = Files.readAllLines(arquivo);

        for(String linha : linhas) {
            String[] split = linha.split(",");

            //Nº Concurso
            int nro = Integer.parseInt(split[0]);

            //Data Concurso
            String dataStr = split[1]; // data como String
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(dataStr, formatador);

            //Nºs Sorteados
            int[] nrosSorteados = new int[6];
            for(int i = 0; i<=5; i++) {
                String n = split[i + 2];
                nrosSorteados[i] = Integer.parseInt(n);
            }
            //Instanciando
            Concurso concurso = new Concurso(nro, data, nrosSorteados);
            lista.add(concurso);

        }
        lista.forEach(c -> System.out.println(c));

    }
}
