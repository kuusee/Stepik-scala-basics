package exercieses

import scala.reflect.internal.util.TriState.False


class Logger(val msgNum: Int = 0) {
  def info: Logger = {
    println("INFO New Message")
    new Logger(msgNum + 1)
  }

  def info(n: Int): Logger = {
    if (n <= 0) this
    else info.info(n - 1)
  }

  def print: Unit = println(this.msgNum)
}

abstract class LogList[+A] {
  def last: A
  def previous: LogList[A]
  def isEmpty: Boolean
  def all: A
  def add(msg: A): LogList[A]
}

object Empty extends LogList {
  override def last: String = throw new NoSuchElementException
  override def previous: LogList = throw new NoSuchElementException
  override def isEmpty: Boolean = true
  override def all: String = s""
  override def add(msg: String): LogList = new Log(msg, Empty)
}

class Log[+A](head: A, tail: LogList[A]) extends LogList[A] {
  override def last: String = head
  override def previous: LogList[A] = tail
  override def isEmpty: Boolean = false
  override def all: String =
    {
      if (!this.tail.isInstanceOf[LogList]) this.head
      else s"${this.head} ${this.previous.all}"
    }
  override def add(msg: String): LogList = new Log(msg, this)
}


object LogSystem extends App{
//  val logger = new Logger()
//  logger.info.info.info.print
//  logger.info.print
//  logger.info(3).print
  val login = new Log("Log1", new Log("Log2", new Log("Log3", Empty)))
  println(login.last)
  println(login.previous.last)
  println(login.all)
}


