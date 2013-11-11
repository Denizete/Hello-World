package example.org.lesson.one

class Point(xc: Int, yc: Int) {
	val x: Int = xc
	val y: Int = yc
	def move(dx: Int, dy: Int): Point = new Point(x + dx, y + dy)
}