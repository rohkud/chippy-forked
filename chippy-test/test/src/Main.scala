import org.chipsalliance.diplomacy.lazymodule.LazyModule

object Main {
  def main(args: Array[String]): Unit = {
    val x: Option[LazyModule] = None
    println("Successfully imported diplomacy: " + x)
  }
}
