public class ReportGenerator {
  private DataStorage storage;

  public ReportGenerator (DataStorage storage) {
    this.storage = storage;
  }

  public void generateReport(String reportData) {
    System.out.println("Generating report... ");
    storage.writeData(reportData);
  }
}
