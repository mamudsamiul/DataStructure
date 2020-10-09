/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.capgemini.datastructuretest;

import org.junit.Test;

import com.capgemini.datastructure.Node;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class MyNodeTest {
	@Test
	public void given3NumberWhenLinkedShouldPassedLinkedListTest() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
}
