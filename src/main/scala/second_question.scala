object second_question {
    def countLetterOccurrences(words: List[String]): Int = {
      val Word_Letter_Count = words.map(_.length)
      val Total_Letter_Count = Word_Letter_Count.reduce(_ + _)
      Total_Letter_Count
    }

    def main(args: Array[String]): Unit = {
      val words = List("apple", "banana", "cherry", "date")
      val Total_Letter_Count = countLetterOccurrences(words)
      println(s"Total count of letter occurrences: $Total_Letter_Count")
    }

}
