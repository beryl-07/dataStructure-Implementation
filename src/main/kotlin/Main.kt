fun main() {
    // Simple linked list
        val list = LinkedList()
        try {
            list.deleteFirst()
        } catch (e:Exception) {
            println(e.message)
        }
        list.insertFirst(1)
        list.insertLast(90)
        list.insertFirst(35)
        list.insertMiddle(77, 2)
        list.insertFirst(10)
        list.insertFirst(5)
        list.deleteEnd()
            list.print()
        list.deleteMiddle(2)
            list.print()
        list.deleteFirst()
            list.print()
}