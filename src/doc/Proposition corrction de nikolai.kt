package fr.uga.miage.m1.mailing

// Base prototype
abstract class Shape() {
    var x: Int = 0
    var y: Int = 0
    var color: String = "black"

    // Prototype constructor in the base class
    protected constructor(source: Shape) : this() {
        this.x = source.x
        this.y = source.y
        this.color = source.color
    }

    abstract fun clone(): Shape

    override fun toString(): String =
        "${this::class.simpleName}(x=$x, y=$y, color=$color)"
}

// Concrete prototype
class Rectangle : Shape {
    var width: Int = 0
    var height: Int = 0

    // Regular no-argument constructor
    constructor() : super()

    // Prototype / copy constructor
    constructor(source: Rectangle) : super(source) {
        this.width = source.width
        this.height = source.height
    }

    override fun clone(): Rectangle = Rectangle(this)

    override fun toString(): String =
        "${super.toString()}, width=$width, height=$height"
}

// Concrete prototype
class Circle : Shape {
    var radius: Int = 0

    // Regular no-argument constructor
    constructor() : super()

    // Prototype / copy constructor
    constructor(source: Circle) : super(source) {
        this.radius = source.radius
    }

    override fun clone(): Circle = Circle(this)

    override fun toString(): String =
        "${super.toString()}, radius=$radius"
}