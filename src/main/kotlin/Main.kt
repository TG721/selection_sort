class Main(private var arr: Array<Int>) {

    public fun printArr() {
        for (i in arr)
            print("$i ")
    }

    public fun getArr(): Array<Int>{
        return arr
    }

    public fun selectionSort(array: Array<Int>) {
        for (i in 0 until array.size-1) {
            var min = i;
            for (j in i + 1 until array.size) {
                if(array[min]>array[j]){
                    min = j
                }

            }
            var temp = array[i]
            array[i] = array[min]
            array[min] = temp
        }
    }


}

fun main(){
    var main = Main(arrayOf(3, 4, 1, 23, 4, 5))
    main.printArr()
    main.selectionSort(main.getArr())
    print("\n")
    main.printArr()
}