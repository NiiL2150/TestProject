package com.itstep.testjava.models;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Comparator;

public class TreeSet<T> {
    private TreeNode<T> root;
    private Comparator<T> comparator;
    private boolean isBalanced;

    public TreeSet(Comparator<T> comparator) {
        root = new TreeNode<T>(null, null, null);
        this.comparator = comparator;
    }

    public TreeSet(T value, Comparator<T> comparator){
        root = new TreeNode<T>(value);
        this.comparator = comparator;
    }

    public TreeSet(ArrayList<T> values, Comparator<T> comparator){
        this.comparator = comparator;
        for (T value : values) {
            add(value);
        }
        if(root == null){
            root = new TreeNode<T>(null, null, null);
        }
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public Comparator<T> getComparator() {
        return comparator;
    }

    public void setComparator(Comparator<T> comparator) {
        this.comparator = comparator;
        this.sort();
    }

    public ArrayList<T> getValues(){
        return root.getValues();
    }

    @Override
    public String toString() {
        return root.toString();
    }

    //add node to tree
    public void add(T value){
        if(root == null){
            root = new TreeNode<T>(value);
            isBalanced = true;
        }
        else{
            root.add(value, comparator);
            checkIsBalanced();
        }
    }

    public void addAll(ArrayList<T> values){
        for(T value : values){
            add(value);
        }
    }

    public void checkIsBalanced(){
        isBalanced = root.isBalanced();
    }

    public void balance(){
        ArrayList<T> values = getValues();
        write(values);
    }

    public void sort(){
        ArrayList<T> values = getValues();
        values.sort(comparator);
        write(values);
    }

    private void write(ArrayList<T> values){
        root = new TreeNode<T>(values.get(values.size() / 2));
        for (int i = 0; i < values.size() / 2; i++){
            add(values.get(i));
        }
        for (int i = values.size() / 2 + 1; i < values.size(); i++){
            add(values.get(i));
        }
        isBalanced = true;
    }
}
