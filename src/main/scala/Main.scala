import java.io.File

object Main extends App {
  def getListOfSubDirectories(directoryName: String): Array[String] = {
    (new File(directoryName))
      .listFiles
      .map(_.getName)
  }
  getListOfSubDirectories(args(0)).foreach(println)
}
