package benchmarks

import java.util.concurrent.TimeUnit

import benchmarks.state.Array10Holder
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.BenchmarkMode
import org.openjdk.jmh.annotations.Mode
import org.openjdk.jmh.annotations.OutputTimeUnit
import org.openjdk.jmh.infra.Blackhole

class Array10Benchmark {

  @BenchmarkMode(Array(Mode.Throughput))
  @OutputTimeUnit(TimeUnit.SECONDS)
  @Benchmark
  def run(bh: Blackhole, holder: Array10Holder) = {
    bh.consume(holder.ar(4))
    bh.consume(holder.ar(9))
    bh.consume(holder.ar(0))
    bh.consume(holder.ar(5))
    bh.consume(holder.ar(8))
    bh.consume(holder.ar(1))
    bh.consume(holder.ar(6))
    bh.consume(holder.ar(2))
    bh.consume(holder.ar(7))
    bh.consume(holder.ar(3))
  }

}
