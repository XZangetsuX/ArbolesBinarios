package app;

import Escuela.Alumno;
import btree.btree;
import node.node;

public class App {

	public static void main(String[] args) {
		btree<Integer> nums = new btree<Integer>();
		nums.add(5);
		nums.add(-1);
		nums.add(0);
		nums.add(24);
		nums.add(-6);
		nums.add(5);
		nums.add(9);
		nums.add(30);
		nums.add(35);
		nums.add(27);
		
		
		System.out.println(nums.maxDepth());
		System.out.println("--------------Inorder-------");
		nums.printInorder();
		System.out.println("--------------Postorder--------");
		nums.printPostOrder();
		System.out.println("--------------Preorder---------");
		nums.printPreorder();
		System.out.println("----------breadthSearch--------------");
		nums.breadthSearch();
	}

}
