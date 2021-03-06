/*
 * Copyright 2004-2013 H2 Group. Multiple-Licensed under the H2 License,
 * Version 1.0, and under the Eclipse Public License, Version 1.0
 * (http://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package com.codefollower.lealone.dbobject.index;

import com.codefollower.lealone.result.Row;

/**
 * Represents a index node of a tree index.
 */
class TreeNode {

    /**
     * The balance. For more information, see the AVL tree documentation.
     */
    int balance;

    /**
     * The left child node or null.
     */
    TreeNode left;

    /**
     * The right child node or null.
     */
    TreeNode right;

    /**
     * The parent node or null if this is the root node.
     */
    TreeNode parent;

    /**
     * The row.
     */
    final Row row;

    TreeNode(Row row) {
        this.row = row;
    }

    /**
     * Check if this node is the left child of its parent. This method returns
     * true if this is the root node.
     *
     * @return true if this node is the root or a left child
     */
    boolean isFromLeft() {
        return parent == null || parent.left == this;
    }

}
