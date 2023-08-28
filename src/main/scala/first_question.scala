object first_question {
    def calculateAverage(temperatures: List[Double]): Double = {
      val Fahrenheit_T = temperatures.map(celsius => (celsius * 9 / 5) + 32)
      val Total_Fahrenheit_T = Fahrenheit_T.reduce(_ + _)
      val Average_Fahrenheit_T = Total_Fahrenheit_T / temperatures.length
      Average_Fahrenheit_T
    }

    def main(args: Array[String]): Unit = {
      val temperatures = List(0.0, 10.0, 20.0, 30.0)
      val Average_Fahrenheit_T = calculateAverage(temperatures)
      println(s"Average Fahrenheit temperature: $Average_Fahrenheit_T")
    }

}
