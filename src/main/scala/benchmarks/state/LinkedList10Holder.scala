package benchmarks.state

import org.openjdk.jmh.annotations.Level
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.Setup
import org.openjdk.jmh.annotations.State

import scala.util.Random.nextInt

@State(Scope.Thread)
class LinkedList10Holder {

  @Setup(Level.Iteration)
  def setUp() = {
    l = Stream.continually(nextInt).take(10).toList
  }

  var l :List[Int] = _
}
