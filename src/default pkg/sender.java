
 import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileReader;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.Base64;

 public class Sender {

 static String line
 static String encodedStuff = ";

 public static void main(String[] args) {
File file1 = new File(System.getProperty("user.dir") + "//Messages// sentMessage.txt");
File file2 = new File(System.getProperty("user.dir") + "//Messages//receivedMessage.txt");
try {
BufferedReader br = new BufferedReader(new FileReader(file));
while((line = br.readLine()) != null) {
encodedStuff - Base64.getEncoder().encodeToString(line.getBytes());

}
FileWriter fw = new FileWriter(file2);

fw.write(encodedStuff);

fw.close();

} catch (IOException e) {
// TODO Auto-generated catch block

e.printStackTrace();
}
 }
 }

