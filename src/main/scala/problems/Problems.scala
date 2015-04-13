package problems


trait Problems {
  //01 Find the last element of a list
  def last[A](list: List[A]): Option[A]

  //02 Find the last but one element of a list
  def penultimate[A](list: List[A]): Option[A]

  //03 Find the Kth element of a list. (0 based)
  def nth[A](k: Int, list: List[A]): Option[A]

  //04 Find the number of elements of a list
  def length(list: List[_]): Int

  //05 Reverse a list.
  def reverse[A](list: List[A]): List[A]

  //06 Find out whether a list is a palindrome
  def isPalindrome(list: List[_]): Boolean

  //07 Flatten a nested list structure.
  def flatten(listOfLists: List[Any]): List[Any]

  //08 Eliminate consecutive duplicates of list elements
  //If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  def compress[A](list: List[A]): List[A]

  //09 Pack consecutive duplicates of list elements into sublists.
  //If a list contains repeated elements they should be placed in separate sublists.
  def pack[A](list: List[A]): List[List[A]]

  //10 Run-length encoding of a list.
  //Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
  def encode[A](list:List[A]):List[(Int,A)]
}
