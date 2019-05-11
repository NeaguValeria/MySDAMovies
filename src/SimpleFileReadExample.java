import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SimpleFileReadExample {

    public static void main(String[] args) {
        String absolutePath = " C:\\Users\\40757\\IdeaProjects\\MySDAMovies\\movies.txt";
        String relativePath = "movies.txt";

        File file = new File(relativePath);
        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());
        //afisare linii din fisier + exceptia
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();//citi timp e dif de nul afisez linia si trec la urmatoarea
            }
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
