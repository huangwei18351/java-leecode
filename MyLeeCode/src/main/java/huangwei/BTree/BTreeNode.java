package huangwei.BTree;

/**
 * @Description:二叉树节点
 * @Date: 2022/1/16 15:22
 */
public class BTreeNode {
    int val;
    BTreeNode left;
    BTreeNode right;
    public BTreeNode(){

    }

    public BTreeNode (int val){
        this.val = val;
    }

    public BTreeNode (int val, BTreeNode left, BTreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public BTreeNode getLeft() {
        return left;
    }

    public void setLeft(BTreeNode left) {
        this.left = left;
    }

    public BTreeNode getRight() {
        return right;
    }

    public void setRight(BTreeNode right) {
        this.right = right;
    }
}
