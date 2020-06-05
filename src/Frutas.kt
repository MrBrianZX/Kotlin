class Frutas(){
    private var color:String = ""
    private var sabor:String = ""
    private var precio:Double = 0.0
    private var vida:Int = 0

    /*init {
        this.color = color;
        this.sabor = sabor;
        this.precio = precio;
    }*/

    constructor(color:String, sabor:String, precio:Double):this(){
        this.color = color
        this.sabor = sabor
        this.precio = precio

    }

    fun getColor():String{
        return this.color
    }

}