let unnamedUntypedTuple = (4, 25)
println(unnamedUntypedTuple.0)
println(unnamedUntypedTuple.1)
let unnamedTypedTuple:(Int, Int) = (4, 25)
println(unnamedTypedTuple.0)
println(unnamedTypedTuple.1)
let namedUntypedTuple = (a:4, count:25)
println(namedUntypedTuple.a)
println(namedUntypedTuple.count)
let namedTypedTuple:(a:Int, count:Int) = (4, 25)
println(namedTypedTuple.a)
println(namedTypedTuple.count)
let nestedTuple = (4, (12, 25))
println(nestedTuple.1.0)
println(nestedTuple.1.1)