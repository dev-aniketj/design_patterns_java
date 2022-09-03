public class Client {

  public static void main(String[] args) {
    String filename = "file.txt";
    Service service = new ProxyFile(filename);

    service.downloadFile();
  }
}
