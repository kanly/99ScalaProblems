package solutions

import problems.Problems

object Functional extends Problems {
  //01 Find the last element of a list
  override def last[A](list: List[A]): Option[A] = ???

  //02 Find the last but one element of a list
  override def penultimate[A](list: List[A]): A = ???

  //03 Find the Kth element of a list. (0 based)
  override def nth[A](k: Int, list: List[Any]): Any = ???

  //04 Find the number of elements of a list
  override def length(list: List[_]): Int = ???

  //05 Reverse a list.
  override def reverse[A](list: List[A]): List[A] = ???

  //06 Find out whether a list is a palindrome
  override def isPalindrome(list: List[_]): Boolean = ???

  //07 Flatten a nested list structure.
  override def flatten[A](listOfLists: List[List[A]]): List[A] = ???

  //08 Eliminate consecutive duplicates of list elements
  override def compress[A](list: List[A]): List[A] = ???

  //09 Pack consecutive duplicates of list elements into sublists.
  override def pack[A](list: List[A]): List[List[A]] = ???

  //10 Run-length encoding of a list.
  override def encode[A](list: List[A]): List[(Int, A)] = ???
}
