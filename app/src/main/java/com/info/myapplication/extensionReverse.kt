package com.info.myapplication



fun main() {
    val intArray = arrayOf(1, 2, 3, 4, 5, 6,7)
    var size = intArray.size

    fun kotlin.Array<Int>.specificReverse(index: Int = 0) {
        var x = 0
        
        if(index>size/2) {
            for (i in 1..(size-index)/2){
                var temp = intArray[index]
                intArray[index] = intArray[size - x - 1]
                intArray[size - x - 1] = temp
                x++
            }
        }
            else if(index==size/2){

            for (i in index..(size / 2)+1) {
                var temp = intArray[i]
                intArray[i] = intArray[size - x - 1]
                intArray[size - x - 1] = temp
                x++
            }

        }else {

            for (i in index..size / 2) {
                var temp = intArray[i]
                intArray[i] = intArray[size - x - 1]
                intArray[size - x - 1] = temp
                x++
            }
        }
    }

    intArray.specificReverse(1)
    for (i in intArray) {
        print("$i ")
    }
}





