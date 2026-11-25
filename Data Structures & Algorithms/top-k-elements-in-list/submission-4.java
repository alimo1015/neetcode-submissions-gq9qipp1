class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
         PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(int num : map.keySet()){
            pq.add(num);
        }
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = pq.poll();
        }
        return res;
    }
}
