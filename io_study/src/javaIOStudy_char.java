import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class javaIOStudy_char {

    public static void main(String[] args) {

        FileReader fr;
        FileWriter fw;
        BufferedReader br;
        BufferedWriter bw;

        try {
            fr = new FileReader("io_study/prac_char.txt");
            fw = new FileWriter("io_study/result_char.txt");
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line);
            }

            bw.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    } // main method

} // javaIOStudy_char class
