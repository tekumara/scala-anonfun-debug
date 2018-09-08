package tekumara

import java.lang.reflect.Field

import org.apache.commons.lang3.builder.ReflectionToStringBuilder

class ClassA {

  def classFoo(s: String): () => String = {
    lazy val lazys = s

    () => {
      lazys
    }
  }

}

trait TraitA {

  def traitFoo(s: String): () => String = {
    lazy val lazys = s

    () => {
      lazys
    }
  }

}

object Obj extends TraitA {

  def objFoo(s: String): () => String = {
    lazy val lazys = s

    () => {
      lazys
    }
  }

}

object AnonFunDebug {

  def main(args: Array[String]) = {
    lazy val lazys = "main"
    val a = () => {
      lazys
    }

    val b = Obj.objFoo("obj")

    val c = Obj.traitFoo("trait")

    val d = new ClassA().classFoo("class")

    println(new AllFieldsReflectionToStringBuilder(a).toString())
    println(new AllFieldsReflectionToStringBuilder(b).toString())

    println()
    println("In Scala 2.11 the following will contain an $outer object reference:")
    println()

    println(new AllFieldsReflectionToStringBuilder(c).toString())
    println(new AllFieldsReflectionToStringBuilder(d).toString())
    ()
  }

}

class AllFieldsReflectionToStringBuilder(obj: Object) extends ReflectionToStringBuilder(obj) {
  override protected def accept(field: Field): Boolean = true
}
