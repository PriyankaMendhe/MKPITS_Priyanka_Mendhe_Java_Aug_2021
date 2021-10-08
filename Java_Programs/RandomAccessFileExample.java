

import java.io.IOException;
    import java.io.RandomAccessFile;

    public class RandomAccessFileExample {
        static final String FILEPATH ="E:\\MKPITS STUDY\\java program\\6 oct\\write.txt";
        public static void main(String[] args) {
            try {
                System.out.println(new String(readFromFile(FILEPATH, 0, 17)));
                writeToFile(FILEPATH, "I love my country and my people", 31);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // user defind method to read data from file

        private static byte[] readFromFile(String filePath, int position, int size)
                throws IOException {
            RandomAccessFile file = new RandomAccessFile(filePath, "r");  // "r" read mode
            file.seek(position);
            byte[] bytes = new byte[size];
            file.read(bytes);
            file.close();
            return bytes;
        }

   //user defind method to write data in file
        private static void writeToFile(String filePath, String data, int position)// write from mention position
                throws IOException {
            RandomAccessFile file = new RandomAccessFile(filePath, "rw");// "rw"
            file.seek(position);
            file.write(data.getBytes());
            file.close();
        }
    }

