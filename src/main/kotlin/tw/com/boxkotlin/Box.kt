package tw.com.boxkotlin

open class Box(var length: Float, var width: Float, var height:Int) {

    fun validate(length: Float,width: Float,height: Int) : Boolean {
        return  (this.length > length && this.width > width && this.height > height)
    }
}

class Box3(length: Float, width: Float, height:Int) : Box(length,width,height) {

}

class Box5(length: Float, width: Float, height:Int) : Box(length,width,height) {

}
