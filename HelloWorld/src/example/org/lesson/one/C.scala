package example.org.lesson.one

class C {
	var acc = 0
	def minc = { acc += 1 }
	val finc = { () => acc += 1 }
}