/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.isEmpty()){
            return 0;
        }
        Collections.sort(intervals, (a,b) -> a.start - b.start);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
    

        for(Interval i : intervals){
            if(!pq.isEmpty() && pq.peek() <= i.start){
                pq.poll();
            } 
            pq.add(i.end);
            
        }
        return pq.size();
    }
}

