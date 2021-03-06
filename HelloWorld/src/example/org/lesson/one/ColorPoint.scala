package example.org.lesson.one

class ColorPoint(u: Int, v: Int, c: String) extends Point(u, v) {
	
    val color: String = c
	def compareWith(pt: ColorPoint): Boolean = (pt.x == x) && (pt.y == y) && (pt.color == color)
	override def move(dx: Int, dy: Int): ColorPoint = new ColorPoint(x + dy, y + dy, color)
    
}