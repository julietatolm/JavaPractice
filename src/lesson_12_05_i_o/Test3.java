package lesson_12_05_i_o;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

//3. Создать несколько файлов в папке testfolder, вывести на экран список файлов, удалить файлы

public class Test3 {
    public static void main(String[] args) throws IOException {

        File newDir = new File("src/lesson_12_05_i_o/testfolder");
        newDir.mkdir();
        File file1 = new File("src/lesson_12_05_i_o/testfolder/Test1");
        File file2 = new File("src/lesson_12_05_i_o/testfolder/Test2");
        File file3 = new File("src/lesson_12_05_i_o/testfolder/Test3");
        File file4 = new File("src/lesson_12_05_i_o/testfolder/Test4");

        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();
        file4.createNewFile();

        System.out.println(Arrays.toString(newDir.listFiles()));

        file1.delete();
        file2.delete();
        file3.delete();
        file4.delete();
    }
}
