```groovy
def myMethod(List<String> list) {
    boolean stopIteration = false
    list.eachWithIndex { String item, int index ->
        println "Item at index $index: $item"
        if (item == "stop") {
            stopIteration = true
            return // Exit the closure
        }
    }
    if(!stopIteration){
        println "This line will only execute if the list doesn't contain 'stop'"
    }
}

myMethod(["apple", "banana", "stop", "orange"])
myMethod(["apple", "banana", "orange"])
```