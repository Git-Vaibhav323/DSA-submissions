class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Logic: take the array creat a hashmap with key and freq
        Hashmap<Integer,Integer> map = new Hashmap<>();
        //now taking out the oth index element from array store its frequency and take out further and go like that...store out the frequency and then considering the input of k check which key's freq >= k then print all those as there element 
        for(int i =0;i<nums.Length();i++){
            int key = arr[i];
            i++;
            if(!map.containsKey(key)){
                return 
            }
        }

    }
}
