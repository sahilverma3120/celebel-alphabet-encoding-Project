import java.io. BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;
public class Receiver {
static String Line
public static void main(String[] args) {
File file = new File(System.getProperty("user.dir") + "//Messages//receivedMessage.txt");
try {
BufferedReader br = new BufferedReader(new FileReader(file));
while((line = br.readLine()) !=null) {
String decodedStuff = new String(Base64.getDecoder().decode(line));
System.out.println(decodedStuff);
}
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}
