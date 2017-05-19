package benchmarks

import java.util.concurrent.TimeUnit

import benchmarks.state.Record50Holder
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.BenchmarkMode
import org.openjdk.jmh.annotations.Mode
import org.openjdk.jmh.annotations.OutputTimeUnit
import org.openjdk.jmh.infra.Blackhole
import shapeless.record._


class Record50Benchmark {

  @BenchmarkMode(Array(Mode.Throughput))
  @OutputTimeUnit(TimeUnit.SECONDS)
  @Benchmark
  def run(bh: Blackhole, holder: Record50Holder) = {
    bh.consume(holder.r.get('f5))
    bh.consume(holder.r.get('f10))
    bh.consume(holder.r.get('f42))
    bh.consume(holder.r.get('f24))
    bh.consume(holder.r.get('f37))
    bh.consume(holder.r.get('f25))
    bh.consume(holder.r.get('f14))
    bh.consume(holder.r.get('f20))
    bh.consume(holder.r.get('f46))
    bh.consume(holder.r.get('f29))
    bh.consume(holder.r.get('f1))
    bh.consume(holder.r.get('f6))
    bh.consume(holder.r.get('f28))
    bh.consume(holder.r.get('f38))
    bh.consume(holder.r.get('f21))
    bh.consume(holder.r.get('f33))
    bh.consume(holder.r.get('f9))
    bh.consume(holder.r.get('f13))
    bh.consume(holder.r.get('f41))
    bh.consume(holder.r.get('f2))
    bh.consume(holder.r.get('f32))
    bh.consume(holder.r.get('f34))
    bh.consume(holder.r.get('f45))
    bh.consume(holder.r.get('f17))
    bh.consume(holder.r.get('f22))
    bh.consume(holder.r.get('f44))
    bh.consume(holder.r.get('f27))
    bh.consume(holder.r.get('f12))
    bh.consume(holder.r.get('f49))
    bh.consume(holder.r.get('f7))
    bh.consume(holder.r.get('f39))
    bh.consume(holder.r.get('f3))
    bh.consume(holder.r.get('f35))
    bh.consume(holder.r.get('f48))
    bh.consume(holder.r.get('f18))
    bh.consume(holder.r.get('f50))
    bh.consume(holder.r.get('f16))
    bh.consume(holder.r.get('f31))
    bh.consume(holder.r.get('f11))
    bh.consume(holder.r.get('f43))
    bh.consume(holder.r.get('f40))
    bh.consume(holder.r.get('f26))
    bh.consume(holder.r.get('f23))
    bh.consume(holder.r.get('f8))
    bh.consume(holder.r.get('f36))
    bh.consume(holder.r.get('f30))
    bh.consume(holder.r.get('f19))
    bh.consume(holder.r.get('f4))
    bh.consume(holder.r.get('f47))
    bh.consume(holder.r.get('f15))
  }
}