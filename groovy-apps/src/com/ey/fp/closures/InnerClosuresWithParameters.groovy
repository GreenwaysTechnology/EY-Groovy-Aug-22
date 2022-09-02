
def counter(def state) {
    int a = 0;
    def inc = {
        a + it
    }
}
def inc = counter()
println inc(10)
println inc(20)