package huangwei.BTree;

import huangwei.BTree.BT01_Traverse.Traverse;
import sun.plugin.javascript.navig.Link;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description:运行程序
 * @Date: 2022/1/16 21:45
 */
public class Main {
    public static BTreeNode createBTree(int[] arr, int i) {
        if (i >= arr.length) {
            return null;
        }
        //创建根节点
        BTreeNode root = new BTreeNode(arr[i]);
        //创建左节点
        root.setLeft(createBTree(arr, 2 * i + 1));
        //创建右节点
        root.setRight(createBTree(arr, 2 * i + 2));

        return root;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 5, 6, 7};
        BTreeNode root = createBTree(arr, 0);
        System.out.println(root);
        List<Integer> result = new ArrayList<>();
        Traverse.preTraverseNoRecursion(root, result);
        System.out.println(result);
        LinkedList<Integer> linkedList = new LinkedList<>();
        Traverse.postTraverseNoRecursion(root, linkedList);
        System.out.println(linkedList);
    }
}


