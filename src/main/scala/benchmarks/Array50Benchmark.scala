package benchmarks

import java.util.concurrent.TimeUnit

import benchmarks.state.Array50Holder
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.BenchmarkMode
import org.openjdk.jmh.annotations.Mode
import org.openjdk.jmh.annotations.OutputTimeUnit
import org.openjdk.jmh.infra.Blackhole


class Array50Benchmark {

  @BenchmarkMode(Array(Mode.Throughput))
  @OutputTimeUnit(TimeUnit.SECONDS)
  @Benchmark
  def run(bh: Blackhole, holder: Array50Holder) = {
    bh.consume(holder.ar(4))
    bh.consume(holder.ar(9))
    bh.consume(holder.ar(41))
    bh.consume(holder.ar(23))
    bh.consume(holder.ar(36))
    bh.consume(holder.ar(24))
    bh.consume(holder.ar(13))
    bh.consume(holder.ar(19))
    bh.consume(holder.ar(45))
    bh.consume(holder.ar(28))
    bh.consume(holder.ar(0))
    bh.consume(holder.ar(5))
    bh.consume(holder.ar(27))
    bh.consume(holder.ar(37))
    bh.consume(holder.ar(20))
    bh.consume(holder.ar(32))
    bh.consume(holder.ar(8))
    bh.consume(holder.ar(12))
    bh.consume(holder.ar(40))
    bh.consume(holder.ar(1))
    bh.consume(holder.ar(31))
    bh.consume(holder.ar(33))
    bh.consume(holder.ar(44))
    bh.consume(holder.ar(16))
    bh.consume(holder.ar(21))
    bh.consume(holder.ar(43))
    bh.consume(holder.ar(26))
    bh.consume(holder.ar(11))
    bh.consume(holder.ar(48))
    bh.consume(holder.ar(6))
    bh.consume(holder.ar(38))
    bh.consume(holder.ar(2))
    bh.consume(holder.ar(34))
    bh.consume(holder.ar(47))
    bh.consume(holder.ar(17))
    bh.consume(holder.ar(49))
    bh.consume(holder.ar(15))
    bh.consume(holder.ar(30))
    bh.consume(holder.ar(10))
    bh.consume(holder.ar(42))
    bh.consume(holder.ar(39))
    bh.consume(holder.ar(25))
    bh.consume(holder.ar(22))
    bh.consume(holder.ar(7))
    bh.consume(holder.ar(35))
    bh.consume(holder.ar(29))
    bh.consume(holder.ar(18))
    bh.consume(holder.ar(3))
    bh.consume(holder.ar(46))
    bh.consume(holder.ar(14))
  }

}
