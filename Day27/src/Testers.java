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

    public static void checkAddMemberCardinality(Tree t, int x) throws Exception {
        int nT = (t.add(x)).cardinality();
        if (nT ==t.cardinality()+1){
            if (t.member(x)){
                throw new Exception("The cardinality increased but");
            }
        }
        // 1.Either something was added and cord increased by 1
        // 2. OR the thing was added was already there -
    }

    public static void main(String[] args) {

    }
}
