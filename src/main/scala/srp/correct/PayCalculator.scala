package srp.correct

trait PayCalculator extends RegularHoursCalculator {
  def calculatePay(): Unit = {
    println(s"Pay calculated for ${regularHours()}")
  }

  override def regularHours(): Int = 7
}
