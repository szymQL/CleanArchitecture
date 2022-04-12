package srp.correct

trait HourReporter extends RegularHoursCalculator {
  def reportHours(): Unit = {
    println(s"${regularHours()} hours reported")
  }

  override def regularHours(): Int = 7
}
