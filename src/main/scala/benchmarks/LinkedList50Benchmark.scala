package benchmarks

import java.util.concurrent.TimeUnit

import benchmarks.state.LinkedList50Holder
import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.BenchmarkMode
import org.openjdk.jmh.annotations.Mode
import org.openjdk.jmh.annotations.OutputTimeUnit
import org.openjdk.jmh.infra.Blackhole


class LinkedList50Benchmark {


  @BenchmarkMode(Array(Mode.Throughput))
  @OutputTimeUnit(TimeUnit.SECONDS)
  @Benchmark
  def run(bh: Blackhole, holder: LinkedList50Holder) = {
    bh.consume(holder.l(4))
    bh.consume(holder.l(9))
    bh.consume(holder.l(41))
    bh.consume(holder.l(23))
    bh.consume(holder.l(36))
    bh.consume(holder.l(24))
    bh.consume(holder.l(13))
    bh.consume(holder.l(19))
    bh.consume(holder.l(45))
    bh.consume(holder.l(28))
    bh.consume(holder.l(0))
    bh.consume(holder.l(5))
    bh.consume(holder.l(27))
    bh.consume(holder.l(37))
    bh.consume(holder.l(20))
    bh.consume(holder.l(32))
    bh.consume(holder.l(8))
    bh.consume(holder.l(12))
    bh.consume(holder.l(40))
    bh.consume(holder.l(1))
    bh.consume(holder.l(31))
    bh.consume(holder.l(33))
    bh.consume(holder.l(44))
    bh.consume(holder.l(16))
    bh.consume(holder.l(21))
    bh.consume(holder.l(43))
    bh.consume(holder.l(26))
    bh.consume(holder.l(11))
    bh.consume(holder.l(48))
    bh.consume(holder.l(6))
    bh.consume(holder.l(38))
    bh.consume(holder.l(2))
    bh.consume(holder.l(34))
    bh.consume(holder.l(47))
    bh.consume(holder.l(17))
    bh.consume(holder.l(49))
    bh.consume(holder.l(15))
    bh.consume(holder.l(30))
    bh.consume(holder.l(10))
    bh.consume(holder.l(42))
    bh.consume(holder.l(39))
    bh.consume(holder.l(25))
    bh.consume(holder.l(22))
    bh.consume(holder.l(7))
    bh.consume(holder.l(35))
    bh.consume(holder.l(29))
    bh.consume(holder.l(18))
    bh.consume(holder.l(3))
    bh.consume(holder.l(46))
    bh.consume(holder.l(14))
  }
}