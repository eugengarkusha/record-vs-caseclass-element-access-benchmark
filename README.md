This repo shows the potential performance benefits that array based HLists and Records
may have over the existing shapeless linked list based implementations.


The following command will run the individual benchmarks(found in benchmarks package):
```bash
sbt "jmh:run -i 10 -wi 10 -f 2 -t 1  <benchmark class name>"
```


results I got on my machine:
```
[info] Benchmark                         Mode  Cnt      Score       Error  Units

[info] CaseClass10Benchmark.run        thrpt   20  45197361.345 ± 2144171.155  ops/s
[info] Record10Benchmark.run           thrpt   20  13866064.420 ±  359288.306  ops/s

[info] CaseClass50Benchmark.run        thrpt   20   9461564.873 ±  291869.926  ops/s
[info] Record50Benchmark.run           thrpt   20    459163.384 ±    9579.445  ops/s

[info] Array10Benchmark.run            thrpt   20  43447239.908 ±  873775.108  ops/s
[info] LinkedList10Benchmark.run       thrpt   20  13483603.150 ±  447480.762  ops/s

[info] Array50Benchmark.run            thrpt   20   8850419.915 ±  201545.220  ops/s
[info] LinkedList50Benchmark.run       thrpt   20    492907.254 ±   12815.076  ops/s
```


