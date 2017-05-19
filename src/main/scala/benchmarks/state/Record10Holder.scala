package benchmarks.state

import model.CaseClass10
import org.openjdk.jmh.annotations.Level
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.Setup
import org.openjdk.jmh.annotations.State
import shapeless._

import scala.util.Random.{nextInt => i}

@State(Scope.Thread)
class Record10Holder {

  val lg = LabelledGeneric.apply[CaseClass10]

  @Setup(Level.Iteration)
  def setUp() = {
    r = lg.to(CaseClass10(i,i,i,i,i,i,i,i,i,i))
  }

  var r: lg.Repr =  _
}
