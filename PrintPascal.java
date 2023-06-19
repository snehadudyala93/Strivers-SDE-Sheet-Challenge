public class Solution {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> pascal = new ArrayList<>();
        pascal.add(new ArrayList<>());
        pascal.get(0).add(Long.valueOf(1));

        for(int i = 1; i < n; i++){
            ArrayList<Long> current = new ArrayList<>();
            ArrayList<Long> previous = pascal.get(i-1);
            current.add(Long.valueOf(1));
            for(int j = 1; j < previous.size();j++){
                current.add(previous.get(j-1)+previous.get(j));
            }
            current.add(Long.valueOf(1));
            pascal.add(current);
        }
        return pascal;
    }
}
