package oi.pp.linklist;

/**
 * 「链表 linked list」
 *  是一种线性数据结构，其中的每个元素都是一个节点对象，各个节点通过“引用”相连接。
 *  引用记录了下一个节点的内存地址，通过它可以从当前节点访问到下一个节点。
 *
 *  链表的设计使得各个节点可以分散存储在内存各处，它们的内存地址无须连续
 *
 * @author supanpan
 * @date 2024/01/14
 */
public class Main {
    public static void main(String[] args) {
        demo2InsertNode();

    }

    /**
     * 初始化链表Demo
     * 1、初始化各个节点对象
     * 2、构建节点之间的引用关系
     * 3、从头节点出发，通过引用关系遍历链表（依次访问所有节点）
     *
     */
    private static void demo1InitLinkedList() {
        // 新建单链表节点
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        // 构建链表
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        // 遍历链表
        printLinkedList(node1);

        printLinkedList(node2);
        // 不能这么玩，会死循环
        // printLinkedList(node3);
    }

    public static void demo2InsertNode() {
        // 新建单链表节点
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(5);
        ListNode node4 = new ListNode(7);
        // 构建链表
        node1.next = node2;
        node2.next = node3;
        // 遍历链表
        printLinkedList(node1);
        insert(node1,node4);
        printLinkedList(node1);

    }


    /* 在链表的节点 n0 之后插入节点 P */
    static void insert(ListNode n0, ListNode P) {
        ListNode n1 = n0.next;
        P.next = n1;
        n0.next = P;
    }

    /**
     * 访问链表中索引为 index 的节点
     *
     */
    ListNode access(ListNode head, int index) {
        for (int i = 0; i < index; i++) {
            if (head == null)
                return null;
            head = head.next;
        }
        return head;
    }

    /**
     * 在链表中查找值为 target 的首个节点
     *
     */
    int find(ListNode head, int target) {
        int index = 0;
        while (head != null) {
            if (head.val == target)
                return index;
            head = head.next;
            index++;
        }
        return -1;
    }
    /**
     * 遍历打印链表
     *
     */
    private static void printLinkedList(ListNode node1) {
        while (node1 != null) {
            System.out.print(node1.val + " ");
            node1 = node1.next;
        }
        System.out.println();
    }
}

