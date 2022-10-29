package com.itstep.testjava.models;

import java.util.ArrayList;
import java.util.Comparator;

public class TreeNode<T> {
    private T value;
    private TreeNode<T> left,  right;

    public TreeNode(T value, TreeNode<T> left, TreeNode<T> right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode(T value){
        this(value, null, null);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public ArrayList<T> getValues(){
        ArrayList<T> values = new ArrayList<T>();
        if (left != null){
            values.addAll(left.getValues());
        }
        values.add(value);
        if (right != null){
            values.addAll(right.getValues());
        }
        return values;
    }

    public void add(T value, Comparator<T> comparator){
        if (comparator.compare(value, this.value) < 0){
            if (left == null){
                left = new TreeNode<T>(value);
            } else {
                left.add(value, comparator);
            }
        } else {
            if (right == null){
                right = new TreeNode<T>(value);
            } else {
                right.add(value, comparator);
            }
        }
    }

    public boolean isBalanced(){
        return Math.abs(numberLeft() - numberRight()) <= 1 && (left == null || left.isBalanced()) && (right == null || right.isBalanced());
    }

    public int numberLeft(){
        if (left == null){
            return 0;
        }
        return left.numberLeft() + left.numberRight() + 1;
    }

    public int numberRight(){
        if (right == null){
            return 0;
        }
        return right.numberLeft() + right.numberRight() + 1;
    }

    @Override
    public String toString() {
        return getValues().toString();
    }
}
