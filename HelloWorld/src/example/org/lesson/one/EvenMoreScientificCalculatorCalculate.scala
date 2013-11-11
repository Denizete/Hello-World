package example.org.lesson.one

object EvenMoreScientificCalculatorCalculate {
	def main(args: Array[String]): Unit = {
    	val calculator = new EvenMoreScientificCalculator("HP")
	    print(calculator.log(10));
	    //val calculator = new ScientificCalculator("HP")
        //print(calculator.log(10, 2));
    }
}