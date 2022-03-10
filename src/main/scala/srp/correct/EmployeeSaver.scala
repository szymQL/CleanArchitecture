package srp.correct

trait EmployeeSaver {
  def saveEmployee(employeeData: (Int, Int, Int, Int, Int)): Unit = {
    println(s"Employee: $employeeData saved in DB")
  }
}
