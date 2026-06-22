class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> nonDupIntegers = new HashSet<>();
        
        for (int num : nums) {
            if (!nonDupIntegers.add(num)) {
                return true;
            }
        }

        return false;
        
    }
}