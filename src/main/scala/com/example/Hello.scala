package com.example

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }
}

class Foo {
  import org.ensime.filewatcher.FileWatchService
  val f = new FileWatchService()
}
