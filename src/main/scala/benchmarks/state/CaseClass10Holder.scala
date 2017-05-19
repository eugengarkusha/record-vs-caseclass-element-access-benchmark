package benchmarks.state

import model.CaseClass10
import org.openjdk.jmh.annotations.Level
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.Setup
import org.openjdk.jmh.annotations.State

import scala.util.Random.{nextInt => i}

@State(Scope.Thread)
class CaseClass10Holder {

  @Setup(Level.Iteration)
  def setUp() = {
    cc = CaseClass10(i,i,i,i,i,i,i,i,i,i)
  }

 var cc: CaseClass10 =  _
}
