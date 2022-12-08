package lesson_12_05_i_o;

//2. Создайте файл, используя FileOutputStream, с текстом:
// "This is my first experience when I myself work with IO API. I can do everything!"

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {

        File file = new File("./src/lesson_12_05_i_o/Test.txt");
        file.createNewFile();

        String text = "This is my first experience when I myself work with IO API. I can do everything!";

        FileOutputStream out = new FileOutputStream(file);
        Writer writer = new OutputStreamWriter(out);
        writer.write(text);
        writer.append(text);
        writer.append("\n");
        writer.close();

    }
}
