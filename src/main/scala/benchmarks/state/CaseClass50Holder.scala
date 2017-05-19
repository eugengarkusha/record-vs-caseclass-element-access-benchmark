package benchmarks.state

import model.CaseClass50
import org.openjdk.jmh.annotations.Level
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.Setup
import org.openjdk.jmh.annotations.State

import scala.util.Random.{nextInt => i}

@State(Scope.Thread)
class CaseClass50Holder {

  @Setup(Level.Iteration)
  def setUp() = {
    cc = CaseClass50(i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i,i)
  }

 var cc: CaseClass50 =  _
}
