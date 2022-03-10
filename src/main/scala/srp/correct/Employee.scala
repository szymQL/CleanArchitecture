package srp.correct

class Employee extends PayCalculator with HourReporter with EmployeeSaver {

  private val employeeData = (1, 2, 3, 4, 5)

  def payCalculation(): Unit = {
    calculatePay()
  }

  def hoursReporting(): Unit = {
    reportHours()
  }

  def save(): Unit = {
    saveEmployee(employeeData)
  }
}
