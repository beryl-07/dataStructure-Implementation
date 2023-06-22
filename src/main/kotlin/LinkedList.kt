class Node (val data:Int, var next:Node? = null)
class LinkedList (private var head:Node? = null,private var size:Int = 0) {
    fun print(){
        println("Printing list (size = $size):\n")
        var current = head
        while (current != null) {
            if (current.next != null) {
                print("${current.data} -> ")
            } else {
                print("${current.data} /0\n")
            }
            current = current.next
        }
    }
    fun insertFirst(data:Int){
        val newNode = Node(data)
        newNode.next = head
        head = newNode
        size++
    }
    fun insertLast(data:Int){
        val newNode = Node(data)
        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
    }
    fun insertMiddle(data:Int, position:Int){
        if (position < 0 || position > size) {
            throw Exception("Invalid position")
        } else {
            val newNode = Node(data)
            if (position == 0) {
                insertFirst(data)
            } else {
                var current = head
                var previous = head
                var index = 0
                while (index < position) {
                    previous = current
                    current = current?.next
                    index++
                }
                newNode.next = previous?.next
                previous?.next = newNode
            }
        }
    }
    fun deleteFirst(){
        if (head == null) {
            throw Exception("List is empty")
        } else {
            head = head?.next
            size--
        }
    }

    fun deleteEnd(){
        if (head == null) {
            throw Exception("List is empty")
        } else {
            var current = head
            var previous = head
            while (current?.next != null) {
                previous = current
                current = current.next
            }
            previous?.next = null
            size--
        }
    }

    fun deleteMiddle(position:Int){
        if (position < 0 || position > size) {
            throw Exception("Invalid position")
        } else {
            if (position == 0) {
                deleteFirst()
            } else {
                var current = head
                var previous = head
                var index = 0
                while (index < position) {
                    previous = current
                    current = current?.next
                    index++
                }
                previous?.next = current?.next
                size--
            }
        }
    }
}