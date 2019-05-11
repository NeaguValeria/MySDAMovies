import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class SimpleFileWriteExample {

    public static void main(String[] args) {
        String relativePath = "out.txt";
        File file = new File(relativePath);
        try {

            String message1 = "message 1 ";
            String message2 = "message 2 ";
            String message3 = "message 3 ";

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(message1);
            bufferedWriter.newLine();
            bufferedWriter.write(message2);
            bufferedWriter.close();
            bufferedWriter.write(message3);
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
