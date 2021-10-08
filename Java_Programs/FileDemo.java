    import java.io.*;
    public class FileDemo {
        public static void main(String[] args) {

            try {
                File file = new File("E:\\MKPITS STUDY\\java program\\6 oct\\javaFile123.txt");
                if (file.createNewFile()) {
                    System.out.println("New File is created!");
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
