package srp.incorrect

class Employee extends RegularHoursCalculator {

  def calculatePay(): Unit = {
    println(s"Pay calculated for ${regularHours()} hours")
  }

  def reportHours(): Unit = {
    println(s"${regularHours()} hours reported")
  }

  def saveEmployee(): Unit = {
    println("Employee saved in DB")
  }

}
