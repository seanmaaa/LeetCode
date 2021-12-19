/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
        def _addTwoNumbers(l0: ListNode, round: Int, l1: Option[ListNode], l2: Option[ListNode]): ListNode = {
            if (l1.isEmpty && l2.isEmpty && round == 0) return l0
            val sum = l1.getOrElse(new ListNode(0)).x + l2.getOrElse(new ListNode(0)).x + round
            val nl = new ListNode(sum % 10)
            l0.next = nl
            println(l0.next)
            _addTwoNumbers(nl, sum / 10, Option(l1.getOrElse((new ListNode(0))).next), Option(l2.getOrElse((new ListNode(0))).next))
        }
        val initV = new ListNode((l1.x + l2.x) % 10)
        _addTwoNumbers(initV, (l1.x + l2.x) / 10, Option(l1.next), Option(l2.next))
        initV
    }
}