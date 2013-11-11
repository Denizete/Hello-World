package example.org.lesson.one

object ExecuteC {
  
  def main(args: Array[String]): Unit = {
	val c = new C
	println(c.minc); // calls c.minc()
	println(c.finc);
  }
}