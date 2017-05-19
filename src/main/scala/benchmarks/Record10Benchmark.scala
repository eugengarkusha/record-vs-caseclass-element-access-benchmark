package benchmarks

import java.util.concurrent.TimeUnit

import benchmarks.state.Record10Holder
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.BenchmarkMode
import org.openjdk.jmh.annotations.Mode
import org.openjdk.jmh.annotations.OutputTimeUnit
import org.openjdk.jmh.infra.Blackhole
import shapeless.record._

class Record10Benchmark {

  @BenchmarkMode(Array(Mode.Throughput))
  @OutputTimeUnit(TimeUnit.SECONDS)
  @Benchmark
  def run(bh: Blackhole, holder: Record10Holder) = {
    bh.consume(holder.r.get('f5))
    bh.consume(holder.r.get('f10))
    bh.consume(holder.r.get('f1))
    bh.consume(holder.r.get('f6))
    bh.consume(holder.r.get('f9))
    bh.consume(holder.r.get('f2))
    bh.consume(holder.r.get('f7))
    bh.consume(holder.r.get('f3))
    bh.consume(holder.r.get('f8))
    bh.consume(holder.r.get('f4))
  }
}