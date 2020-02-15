package code;
import java.io.*;
public class status{
    public String[] chamar() throws IOException
    {
        File file = new File("database/status.txt");
        file.createNewFile();
        String inf[] = new String[7];
        try (BufferedReader ler = new BufferedReader(new FileReader(file))) {
            for (int i = 0; i < 7; i++) {
                inf[i] = ler.readLine();
            }
            ler.close();
            /*  (i = 0) == usuários cadastrados
                (i = 1) == produtos cadastrados
                (i = 2) == vendas realizadas
                (i = 3) == compras realizadas
                (i = 4) == total arrecadado
                (i = 5) == total gasto
                (i = 6) == lucro
             */
        }
        return inf;
    }
    public void escrever(String inf[]) throws IOException{
        File file = new File("database/status.txt");
        PrintStream print = new PrintStream(file);
        print.println(inf[0]);
        print.println(inf[1]);
        print.println(inf[2]);
        print.println(inf[3]);
        print.println(inf[4]);
        print.println(inf[5]);
        print.println(inf[6]);
    }
}
