public interface Downloadable {
  void download();
  boolean isDownloaded();
  long getFileSize();
}
