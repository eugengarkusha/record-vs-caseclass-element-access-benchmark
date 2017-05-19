package benchmarks

import java.util.concurrent.TimeUnit

import benchmarks.state.LinkedList10Holder
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.BenchmarkMode
import org.openjdk.jmh.annotations.Mode
import org.openjdk.jmh.annotations.OutputTimeUnit
import org.openjdk.jmh.infra.Blackhole

class LinkedList10Benchmark {


  @BenchmarkMode(Array(Mode.Throughput))
  @OutputTimeUnit(TimeUnit.SECONDS)
  @Benchmark
  def run(bh: Blackhole, holder: LinkedList10Holder) = {
    bh.consume(holder.l(4))
    bh.consume(holder.l(9))
    bh.consume(holder.l(0))
    bh.consume(holder.l(5))
    bh.consume(holder.l(8))
    bh.consume(holder.l(1))
    bh.consume(holder.l(6))
    bh.consume(holder.l(2))
    bh.consume(holder.l(7))
    bh.consume(holder.l(3))
  }
}