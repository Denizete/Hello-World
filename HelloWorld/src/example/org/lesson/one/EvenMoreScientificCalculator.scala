package example.org.lesson.one

class EvenMoreScientificCalculator(brand: String) extends ScientificCalculator(brand) {
	def log(m: Int): Double = log(m, math.exp(1))
}