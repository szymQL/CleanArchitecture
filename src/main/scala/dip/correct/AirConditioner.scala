package dip.correct

import scala.util.Random

trait Sensor {
  def measure(): Double
}

class AirConditioner(desiredTemperature: Double, temperatureSensor: Sensor) {
  private val THRESHOLD = 3

  @throws(classOf[InterruptedException])
  def start(): Unit = {
    while(true) {
      if(temperatureSensor.measure() > desiredTemperature) {
        coolDown()
      }
      println("Working")
      Thread.sleep(5000)
    }
  }

  @throws(classOf[InterruptedException])
  def coolDown(): Unit = {
    while (temperatureSensor.measure() > desiredTemperature - THRESHOLD) {
      println("Cooling down")
      Thread.sleep(5000)
    }
  }

}

class Thermometer extends Sensor {
  override def measure(): Double = {
    Random.between(-20.0, 40.0)
  }
}
