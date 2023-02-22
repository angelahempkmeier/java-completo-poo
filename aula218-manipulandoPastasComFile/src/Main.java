import java.io.File;

public class Main {
    public static void main(String[] args) {
        String strPath = "c:\\temp";

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory); //referenceMethods
        System.out.println("FOLDERS:");
        for(File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for(File file : files){
            System.out.println(file);
        }

        boolean success = new File(strPath + "\\subdir").mkdir();

    }
}