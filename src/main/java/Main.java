import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
        Date datum = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String strDate= formatter.format(datum);

        String ichbins = System.getProperty("ich.bins");
        String origFile = args[0];
        String kopieFile = origFile + strDate;


        File sourceFile = new File(ichbins+"\""+origFile);
        File finaleFile = new File(ichbins+"\""+kopieFile);

        System.out.printf("kopiere file %s nach %s\n", sourceFile.toPath(), finaleFile.toPath());



        try{
            Files.copy(sourceFile.toPath(), finaleFile.toPath());
        }catch(Exception ex){
            System.out.println("fehler");
            ex.printStackTrace();
        }

    }


    public static String GetMessage(){
        return " Hello Exam";
    }
}


