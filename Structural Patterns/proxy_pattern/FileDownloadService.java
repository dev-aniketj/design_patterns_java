public class FileDownloadService implements Service {

  private String filename;

  public FileDownloadService(String filename) {
    this.filename = filename;
    loadFile(filename);
  }

  private void loadFile(String filename) {
    System.out.println("Loading " + filename);
  }

  @Override
  public void downloadFile() {
    System.out.println("File " + filename + " is being downloaded");
  }
}
