package lesson_11_30_input_output;

import java.io.*;

public class Test {
    public static void main(String[] args) {

        // %b %B -> boolean
//        System.out.printf("%b%n", "aaa");
//        System.out.printf("%B%n", "bbbb");
//        System.out.printf("%B%n", 5);

        //input stream -> byte stream
        // input stream reader -> char stream

//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        System.out.println(n1 + n2);

//        InputStreamReader fStream = new InputStreamReader(new InputStream() {
//            @Override
//            public int read() throws IOException {
//                return 0;
//            }
//        });

        try {
            InputStreamReader fStream = new InputStreamReader(new FileInputStream("src/lesson_11_30_input_output/poem" +
                    ".txt"));
            int data = fStream.read();

            while (data != -1) {
//                System.out.print( (char) data);
                data = fStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        InputStreamReader fStream = null;
        FileInputStream fileText = null;
        BufferedReader br = null;
        try {
            fileText = new FileInputStream("src/lesson_11_30_input_output/poem" +
                    ".txt");
            fStream = new InputStreamReader(fileText);
            br = new BufferedReader(fStream);
            String line = br.readLine();

//            System.out.println(line);

//            br.lines().forEach(
//                    (String s) -> System.out.println(s)
//            );

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileText != null) {
                    fileText.close();
                    fileText = null;
                }

                if (fStream != null) {
                    fStream.close();
                    fStream = null;
                }

                if (br != null) {
                    br.close();
                    br = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        File file = new File("src/lesson_11_30_input_output/delama.txt");
        boolean isExists = file.exists();
        System.out.println("file delama exists: " + isExists);

        file = new File("src/lesson_11_30_input_output/poem.txt");
        isExists = file.exists();
        System.out.println("file poem exists: " + isExists);
        System.out.println(file.length());
        System.out.printf("file %s is dir: %b\n", file.getName(), file.isDirectory());


        file = new File("src/lesson_11_30_input_output/data");
        if (!file.exists()) {
            System.out.println("directory doesn't exist, creating");
            file.mkdir();
        } else {
            System.out.println("directory already created");
        }



    }
}
