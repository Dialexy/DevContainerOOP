public interface Seekable {
  void seek(int position);
  int getCurrentPosition();
  int getDuration();
}
