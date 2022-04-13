package dip.factory

object Main extends App {

  private val factory: ServiceFactory = new ServiceFactoryImpl

  private val service: Service = factory.makeService()

}

//############

trait ServiceFactory {
  def makeService(): Service
}

class ServiceFactoryImpl extends ServiceFactory {
  override def makeService(): Service = new ConcreteService
}

//############

trait Service

class ConcreteService extends Service {
  println("Concrete Service created")
}