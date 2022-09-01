def getUser(callback) {
    callback('User info')
}

getUser({ String info ->
    println info
})
getUser({
    println it
})
///////////////////////////////
//multi parameters with some logic

def auth(userName, password, resolve, reject) {
    if (userName.equals("admin") && password.equals("admin")) {
        resolve("Login success")
    } else {
        reject("Login Failed")
    }
}

auth("admin", "admin", {println it}, {println it})
auth("foo", "admin", {println it}, {println it})


















