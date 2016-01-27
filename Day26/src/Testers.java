public class Testers {
    public static void checkIsEmpty(Tree t) throws Exception {
        //If the tree t is instance of EmptyBST - return true
        //if the tree is a an isn

        if (t instanceof EmptyBST) {
            if (!t.isEmpty()) {
                throw new Exception("All is good, the tree is empty");
            }
        } else if (t instanceof NonEmptyBST) {
            if (t.isEmpty()) {
                throw new Exception("All is good, non-empty");
            }
        }
    }

    public static void main(String[] args) {

    }
}
