class Main {
  public static void main(String[] args) {
    int len = 41;
    Tree tree = new Tree(len);
    tree.triangle(0);
    tree.triangle(len / 8);
    tree.log(3);
  }
}

class Tree {
  int len;

  public Tree(int len) {
    this.len = len;
  }

  void triangle(int start) {
    for (int i = start; i < len / 2; i++) {
      for (int j = 0; j < len; j++) {
        if (j == len / 2 - i || j == len / 2 + i) {
          System.out.print("0");
        } else
          System.out.print(".");
      }
      System.out.println("");
    }

    for (int i = 0; i < len / 2; i++) {
      System.out.print("0.");
    }
    System.out.print("0");
    System.out.println("");
  }

  void log(int height) {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < len; j++) {
        if (j == len / 2 - len / 10 || j == len / 2 + len / 10) {
          System.out.print("0");
        } else
          System.out.print(".");
      }
      System.out.println("");
    }
  }
}
