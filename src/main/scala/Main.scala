import java.io.File

object Main extends App {
  if (args.length < 1) {
    println("ERROR: brak argumentu")
    sys.exit(-1)
  }
  val path = args(0)
  val isDirAvailable = new File(path).exists()
  if (!isDirAvailable) {
    println(s"ERROR: nie ma takiej ścieżki: $path")
    sys.exit(-1)
  }
  new File(path)
    .listFiles
    .map(_.getName)
    .foreach(println)
}
