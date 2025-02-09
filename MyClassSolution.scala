```scala
class MyClass[T](val value: T) {
  def this() = {
    this(implicitly[Null] match {
       case null => null.asInstanceOf[T]
       case _ => null
     })
  }
}
```