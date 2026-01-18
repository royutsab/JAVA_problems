package miniproject;

import java.util.Scanner;

public class OPerationClass {
	Scanner input = new Scanner(System.in);
	 private Node root;

	    public void insert(Student student) {
	        root = insertRec(root, student);
	    }

	    private Node insertRec(Node root, Student student) {
	        if (root == null) {
	            return new Node(student);
	        }

	        if (student.rollNumber < root.data.rollNumber) {
	            root.left = insertRec(root.left, student);
	        } else if (student.rollNumber > root.data.rollNumber) {
	            root.right = insertRec(root.right, student);
	        } else {
	            System.out.println(" Record with Roll Number " + student.rollNumber + " already exists.");
	        }

	        return root;
	    }

	    public  int delete(int rollNumber) {
	    	int[] status =  new int[1];
	        root = deleteRec(root, rollNumber,status);
	        return status[0];
	    }

	    private Node deleteRec(Node root, int rollNumber, int[] status) {
	        if (root == null) {
	           status[0] = -1;
	            return null;
	        }

	        if (rollNumber < root.data.rollNumber) {
	            root.left = deleteRec(root.left, rollNumber,status);
	        } else if (rollNumber > root.data.rollNumber) {
	            root.right = deleteRec(root.right, rollNumber,status);
	        } else {
	        	status[0]=0;
	            if (root.left == null)
	                return root.right;
	            else if (root.right == null)
	                return root.left;

	            root.data = minValue(root.right);
	            root.right = deleteRec(root.right, root.data.rollNumber,status);
	        }

	        return root;
	    }

	    private Student minValue(Node root) {
	        Student minv = root.data;
	        while (root.left != null) {
	            minv = root.left.data;
	            root = root.left;
	        }
	        return minv;
	    }

	    public void search(int rollNumber) {
	        Node result = searchRec(root, rollNumber);
	        if (result != null) {
	            System.out.println(" Record Found:");
	            result.data.display();
	        } else {
	            System.out.println(" Record not found with Roll Number: " + rollNumber);
	        }
	    }

	    private Node searchRec(Node root, int rollNumber) {
	        if (root == null || root.data.rollNumber == rollNumber)
	            return root;

	        if (rollNumber < root.data.rollNumber)
	            return searchRec(root.left, rollNumber);
	        return searchRec(root.right, rollNumber);
	    }

	    public void showAllRecords() {
	        if (root == null) {
	            System.out.println(" No records found.");
	        } else {
	        	System.out.println("Select print method: \n1. InOrder \n2. PreOrder \n3. PostOrder");
	        	int item = input.nextInt();
	            System.out.println(" All Student Records:");
	            if(item ==1) {
	            	inOrder(root);
	            }
	            else if(item==2) {
	            	preOrder(root);
	            }
	            else if(item == 3) {
	            	postOrder(root);
	            }
	            else {
	            	inOrder(root);
	            }
	            
	        }
	    }

	    private void inOrder(Node root) {
	        if (root != null) {
	            inOrder(root.left);
	            root.data.display();
	            inOrder(root.right);
	        }
	    }
	    private void preOrder(Node root) {
	        if (root != null) {
	            
	            root.data.display();
	            inOrder(root.left);
	            inOrder(root.right);
	        }
	    }
	    private void postOrder(Node root) {
	        if (root != null) {
	                     
	            inOrder(root.left);
	            inOrder(root.right);
	            root.data.display();
	        }
	    }

}
