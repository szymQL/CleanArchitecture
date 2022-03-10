import lsp.correct.{Rectangle, Square}

object Main extends App {

  val rect: Rectangle = new Square(4)

  assert(rect.area == 16)

}
