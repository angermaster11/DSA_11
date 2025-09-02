# Binary Tree 
- It is a hierarchical data structure in which each node has atmost two children
- Root Node (top of tree)
- Leave Node (bottom of tree)

### Basic Code of Binary Tree
```java 
class Node{
    int val;
    Node left;
    Node right;
}
```
## Creating Tree 
- Let given input be like 
- 10 True 30 True 50 False False False True 20 False True 70 False False
- It means 10 is root node.
- True (2nd Index) mean Left part is available and value is 30.
- True (4th Index )mean Left part is available and value is 50.
- False (6th Index) mean Left is not available.
- False (7th Index) mean Right is not available.
- and So on....

```java
private Node CreateTree(){
    int item = sc.nextInt();
    Node nn = new Node();
    nn.val = item;
    boolean hlc = sc.nextBoolean();
    if(hlc){
        nn.left = CreateTree();
    }
    boolean hrc = sc.nextBoolean();
    if(hrc){
        nn.right = CreateTree();
    }
    return nn;
}
```
### Display Binary Tree 
```java
 private void Display(Node nn){
    if(nn == null){
        return;
    }
    String str = "<--"+nn.val+"-->";
    if(nn.left!=null){
        str = nn.left.val+str;
    }else {
        str = "."+str;
    }
    if(nn.right!=null){
        str = str + nn.right.val;
    }else {
        str = str+".";
    }
    System.out.println(str);
    Display(nn.left);
    Display(nn.right);
}
 ```