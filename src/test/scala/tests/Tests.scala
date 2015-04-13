package tests

import org.scalatest.{FlatSpec, Matchers}
import problems.Problems

trait Tests extends FlatSpec with Matchers {
  this: Problems =>

  "(01) last" should "find last element of a list" in {
    last(List(1, 1, 2, 3, 5, 8)) shouldBe 8
  }

  "(02) penultimate" should "find the last but one element of a list" in {
    penultimate(List(1, 1, 2, 3, 5, 8)) shouldBe 5
  }

  "(03) nth" should "find the Nth element of a list" in {
    nth(2, List(1, 1, 2, 3, 5, 8))
  }

  "(04) length" should "find the number of elements of a list" in {
    length(List(1, 1, 2, 3, 5, 8)) shouldBe 6
  }

  "(05) reverse" should "reverse a list" in {
    reverse(List(1, 1, 2, 3, 5, 8)) shouldBe List(8, 5, 3, 2, 1, 1)
  }

  "(06) isPalindrome" should "find out whether a list is a palindrome" in {
    isPalindrome(List(1, 2, 3, 2, 1)) shouldBe true
    isPalindrome(List(1, 2, 3, 3, 1)) shouldBe false
  }

  "(07) flatten" should "flatten a nested list structure" in {
    flatten(List(List(1, 1), 2, List(3, List(5, 8)))) shouldBe List(1, 1, 2, 3, 5, 8)
  }

  "(08) compress" should "eliminate consecutive duplicates of list elements" in {
    compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List('a, 'b, 'c, 'a, 'd, 'e)
  }

  "(09) pack" should "pack consecutive duplicates of list elements into sublists" in {
    pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  }

  "(10) encode" should "run-length encoding of a list" in {
    encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe  List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }
}
