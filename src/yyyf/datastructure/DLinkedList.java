package yyyf.datastructure;

class Node<t>{
    t data;
    Node<t> pre;
    Node<t> next;

    public Node(){
        data = null;
        pre = null;
        next = null;
    }

    public Node(t data){
        this.data = data;
        pre = null;
        next = null;
    }
}

public class DLinkedList<t>{
    private Node<t> head;
    private int length;

    public DLinkedList(t data){
        head = new Node<t>(data);
        length = 1;
    }
    //获取最后一个节点
    public Node<t> getLastNode(){
        Node<t> p = head;
        while(p.next != null){
            p = p.next;
        }
        return p;
    }
    //获取头节点
    public Node<t> getHeadNode(){
        return head;
    }
    //从前向后向查找指定位置的节点
    public Node<t> getNodeByIndex_Next(int index){
        Node<t> p = head;

        for(int n = 0; n < index; n++){
            if(p.next != null){
                p = p.next;
            }
        }
        return p;
    }
    //从后向前查找指定位置的节点
    public Node<t> getNodeByIndex_Pre(int index){
        Node<t> p = getLastNode();

        for(int n = 0; n < index; n++){
            if(p.pre != null){
                p = p.pre;
            }
        }
        return p;
    }



    public void removeLastNode(){
        Node<t> temp = getLastNode();
        temp.pre.next = null;
        length--;
    }
    //添加头节点
    public void addHeadNode(t data){
        Node<t> temp = new Node<>(data);
        head.pre = temp;
        temp.next = head;

        head = temp;
        length++;

    }
    //在最后一个节点后面添加一个节点
    public void addNodeOnNext(t data){
        Node<t> lastNode = getLastNode();
        Node<t> temp = new Node<t>(data);
        lastNode.next = temp;
        temp.pre = lastNode;
        length++;
    }


    static void fun(DLinkedList list, int head){
        for(int n = 1;n< list.length;n++){
            list.getNodeByIndex_Pre(n-1).data = list.getNodeByIndex_Pre(n).data;
        }
        list.getHeadNode().data = head;
    }


    public static void main(String[] args) {
        DLinkedList<Integer> list = new DLinkedList<>(0);
        list.addNodeOnNext(1);
        list.addNodeOnNext(2);
        list.addNodeOnNext(3);


        list.addHeadNode(-1);
        list.removeLastNode();



        for(int n = 0;n< list.length;n++){
            System.out.println(list.getNodeByIndex_Next(n).data);
        }
        System.out.println(list.getHeadNode().data);

    }
}

