package com.atguigu.huashanlunjian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class OrderBy {
	
	
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		hashMap.put("BBB", Integer.valueOf(112));
		hashMap.put("AAA", Integer.valueOf(18));
		hashMap.put("CCC", Integer.valueOf(100));
		hashMap.put("DDD", Integer.valueOf(12));

		System.out.println("按key排序");
		SortedMap sortedMap = sortMapByKey(hashMap);
		

		for (Iterator iterator = sortedMap.entrySet().iterator(); iterator.hasNext();) {
			Entry<String, Integer> entry = (Entry<String, Integer>) iterator.next();
			System.out.println(entry);
		}

		System.out.println("按value排序");
		List<Map.Entry<String, Integer>> list = TestMapSort.sortMapByVal(hashMap);
		
		
		
		for (Map.Entry<String, Integer> mapping : list) {
			System.out.println(mapping.getKey() + ":" + mapping.getValue());
		}

	}

	private static SortedMap<String,Integer> sortMapByKey(HashMap<String, Integer> hashMap) {
		TreeMap<String, Integer> treeMap = new TreeMap<>(hashMap);
		return treeMap;
	}

//	Collections.sort             
//	TreeMap
//	Node head=new Node("A");
//	Node node1=new Node("B");
//	Node node2=new Node("C");
//	Node node3=new Node("D");
//	Node node4=new Node("E");
//	head.setNextNode(node1);
//	node1.setNextNode(node2);
//	node2.setNextNode(node3);
//	node3.setNextNode(node4);
//	
//	Node tmpNode=head;
//	while(tmpNode!=null){
//		System.out.println(tmpNode.getKey());
//		tmpNode=tmpNode.getNextNode();
//	}
//	
//	Node newHead=sortNode2(head);
//    tmpNode=newHead;
//	while(tmpNode!=null){
//		System.out.println(tmpNode.getKey());
//		tmpNode =tmpNode.getNextNode();
//	}
//	class Node {
//		private String key ;
//		private Node nextNode;
//		
//		public Node(String key){
//			this.key=key;
//		}
//		
//		public String getKey() {
//			return key;
//		}
//		public void setKey(String key) {
//			this.key = key;
//		}
//		public Node getNextNode() {
//			return nextNode;
//		}
//		public void setNextNode(Node nextNode) {
//			this.nextNode = nextNode;
//		}
//	}


}
