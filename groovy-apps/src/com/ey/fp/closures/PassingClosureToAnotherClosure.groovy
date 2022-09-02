//Passing Closure to another closure

def connect = null
connect = { callback ->
    callback()
}
connect = {
    it()
}
connect({
    println "Connect Closure"
})
connect()

def auth = { userName, password, resolve, reject ->
    if (userName == 'admin' && password == 'admin') {
        resolve('Login Success')
    } else {
        reject('Login failed')
    }
}
auth('admin', 'admin', { println it }, { println it })