```groovy
def myMethod(List<String> list) {
    list.eachWithIndex { String item, int index ->
        println "Item at index $index: $item"
        if (item == "stop") {
            return // This will only exit the eachWithIndex loop, not the method
        }
    }
    println "This line will always execute"
}

myMethod(["apple", "banana", "stop", "orange"])
```