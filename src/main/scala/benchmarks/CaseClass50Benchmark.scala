package benchmarks

import java.util.concurrent.TimeUnit

import benchmarks.state.CaseClass50Holder
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.BenchmarkMode
import org.openjdk.jmh.annotations.Mode
import org.openjdk.jmh.annotations.OutputTimeUnit
import org.openjdk.jmh.infra.Blackhole

class CaseClass50Benchmark {

  @BenchmarkMode(Array(Mode.Throughput))
  @OutputTimeUnit(TimeUnit.SECONDS)
  @Benchmark
  def run(bh: Blackhole, holder: CaseClass50Holder) = {
    bh.consume(holder.cc.f5)
    bh.consume(holder.cc.f10)
    bh.consume(holder.cc.f42)
    bh.consume(holder.cc.f24)
    bh.consume(holder.cc.f37)
    bh.consume(holder.cc.f25)
    bh.consume(holder.cc.f14)
    bh.consume(holder.cc.f20)
    bh.consume(holder.cc.f46)
    bh.consume(holder.cc.f29)
    bh.consume(holder.cc.f1)
    bh.consume(holder.cc.f6)
    bh.consume(holder.cc.f28)
    bh.consume(holder.cc.f38)
    bh.consume(holder.cc.f21)
    bh.consume(holder.cc.f33)
    bh.consume(holder.cc.f9)
    bh.consume(holder.cc.f13)
    bh.consume(holder.cc.f41)
    bh.consume(holder.cc.f2)
    bh.consume(holder.cc.f32)
    bh.consume(holder.cc.f34)
    bh.consume(holder.cc.f45)
    bh.consume(holder.cc.f17)
    bh.consume(holder.cc.f22)
    bh.consume(holder.cc.f44)
    bh.consume(holder.cc.f27)
    bh.consume(holder.cc.f12)
    bh.consume(holder.cc.f49)
    bh.consume(holder.cc.f7)
    bh.consume(holder.cc.f39)
    bh.consume(holder.cc.f3)
    bh.consume(holder.cc.f35)
    bh.consume(holder.cc.f48)
    bh.consume(holder.cc.f18)
    bh.consume(holder.cc.f50)
    bh.consume(holder.cc.f16)
    bh.consume(holder.cc.f31)
    bh.consume(holder.cc.f11)
    bh.consume(holder.cc.f43)
    bh.consume(holder.cc.f40)
    bh.consume(holder.cc.f26)
    bh.consume(holder.cc.f23)
    bh.consume(holder.cc.f8)
    bh.consume(holder.cc.f36)
    bh.consume(holder.cc.f30)
    bh.consume(holder.cc.f19)
    bh.consume(holder.cc.f4)
    bh.consume(holder.cc.f47)
    bh.consume(holder.cc.f15)
  }
}