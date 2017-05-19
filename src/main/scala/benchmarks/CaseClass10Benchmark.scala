package benchmarks

import java.util.concurrent.TimeUnit

import benchmarks.state.CaseClass10Holder
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.BenchmarkMode
import org.openjdk.jmh.annotations.Mode
import org.openjdk.jmh.annotations.OutputTimeUnit
import org.openjdk.jmh.infra.Blackhole

class CaseClass10Benchmark {

  @BenchmarkMode(Array(Mode.Throughput))
  @OutputTimeUnit(TimeUnit.SECONDS)
  @Benchmark
  def run(bh: Blackhole, holder: CaseClass10Holder) = {
    bh.consume(holder.cc.f5)
    bh.consume(holder.cc.f10)
    bh.consume(holder.cc.f1)
    bh.consume(holder.cc.f6)
    bh.consume(holder.cc.f9)
    bh.consume(holder.cc.f2)
    bh.consume(holder.cc.f7)
    bh.consume(holder.cc.f3)
    bh.consume(holder.cc.f8)
    bh.consume(holder.cc.f4)
  }
}