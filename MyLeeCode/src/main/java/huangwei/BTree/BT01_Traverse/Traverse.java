package huangwei.BTree.BT01_Traverse;

import huangwei.BTree.BTreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.DelayQueue;

/**
 * @Description:遍历方式
 * @Date: 2022/1/16 15:39
 */
public class Traverse {
    /**
     * 前序遍历
     */
    public static void preTraverse(BTreeNode root, List<Integer> res){
        if(root != null){
            res.add(root.getVal());
            preTraverse(root.getLeft(), res);
            preTraverse(root.getRight(), res);
        }
    }

    /**
     * 1.根节点入栈
     * 2.若栈不为空，每次从栈中弹出
     * 3.处理该节点，放入数组
     * 4.根节点之后是左孩子，由于栈的特性，先右孩子入栈，然后左孩子入栈
     * 5.重复2-4
     * @param root
     * @param res
     */
    public static void preTraverseNoRecursion(BTreeNode root, List<Integer> res){
        if(root != null){
            //定义一个栈
            Deque<BTreeNode> deque = new ArrayDeque<>();
            deque.push(root);
            while(!deque.isEmpty()){
                BTreeNode poll = deque.pop();
                res.add(poll.getVal());
                if(poll.getRight() != null){
                    deque.push(poll.getRight());
                }

                if(poll.getLeft() != null){
                    deque.push(poll.getLeft());
                }
            }
        }
    }

    /**
     * 中序遍历
     */
    public static void inTraverse(BTreeNode root, List<Integer> res){
        if(root != null){
            preTraverse(root.getLeft(), res);
            res.add(root.getVal());
            preTraverse(root.getRight(), res);
        }
    }

    /**
     * 后序遍历
     */
    public static void postTraverse(BTreeNode root, List<Integer> res){
        if(root != null){
            preTraverse(root.getLeft(), res);
            preTraverse(root.getRight(), res);
            res.add(root.getVal());
        }
    }

    //入栈顺序，头 进出， 左进， 右进；出的顺序 头，右， 左；倒序则是左，右，头
    public static void postTraverseNoRecursion(BTreeNode root, LinkedList<Integer> res){
        if(root != null){
            //定义一个栈
            Deque<BTreeNode> deque = new ArrayDeque<>();
            deque.push(root);
            while (!deque.isEmpty()){
                BTreeNode node = deque.pop();
                res.addFirst(node.getVal());
                if(node.getLeft() != null){
                    deque.push(node.getLeft());
                }

                if(node.getRight() != null){
                    deque.push(node.getRight());
                }
            }
        }
    }
}
