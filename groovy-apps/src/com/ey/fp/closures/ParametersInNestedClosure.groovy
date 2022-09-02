def counter(state = 0) {
    return { seed = 0, incrementBy = 1 ->
        println("State $state Seed $seed  IncrementBy $incrementBy")
    }
}

def cls = counter(10)
cls(12, 10)
//shortcut calling inner closure and passing parameters
counter(13)(100, 25)

//def counterCls = {
//    state = 0 ->
//        return { seed = 0, incrementBy = 1 ->
//            println("State $state Seed $seed  IncrementBy $incrementBy")
//        }
//}
//using it
def counterCls = {
        return { seed = 0, incrementBy = 1 ->
            println("State $it Seed $seed  IncrementBy $incrementBy")
        }
}
counterCls(23)(10, 89)