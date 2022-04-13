package dip.incorrect

import scala.util.Random

class AirConditioner(desiredTemperature: Double, thermometer: Thermometer) {
  private val THRESHOLD = 3

  @throws(classOf[InterruptedException])
  def start(): Unit = {
    while(true) {
      if(thermometer.measure() > desiredTemperature) {
        coolDown()
      }
      println("Working")
      Thread.sleep(5000)
    }
  }

  @throws(classOf[InterruptedException])
  def coolDown(): Unit = {
    while (thermometer.measure() > desiredTemperature - THRESHOLD) {
      println("Cooling down")
      Thread.sleep(5000)
    }
  }

}

class Thermometer {
  def measure(): Double = {
    Random.between(-20.0, 40.0)
  }
}