# scala-anonfun-debug

```
$ ./gradlew --quiet runApp
tekumara.AnonFunDebug$$anonfun$1@23223dd8[serialVersionUID=0,lazys$lzy$4=null,bitmap$0$3=0]
tekumara.Obj$$anonfun$objFoo$1@3f0ee7cb[serialVersionUID=0,s$2=obj,lazys$lzy$3=null,bitmap$0$2=0]

In Scala 2.11 the following will contain an $outer object reference:

tekumara.TraitA$$anonfun$traitFoo$1@35bbe5e8[serialVersionUID=0,$outer=tekumara.Obj$@5a39699c,lazys$lzy$2=null,s$3=trait,bitmap$0$4=0]
tekumara.ClassA$$anonfun$classFoo$1@1134affc[serialVersionUID=0,$outer=tekumara.ClassA@129a8472,s$1=class,lazys$lzy$1=null,bitmap$0$1=0]
```