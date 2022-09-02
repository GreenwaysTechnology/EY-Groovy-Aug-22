/**
 * the value of owner by default is the current object.
 * the value of owner can be changed during runtime, after changing the owner property may have
 * new value.
 */

def mycls = {
    println "Owner $owner"
    println "This $this"

}
mycls()