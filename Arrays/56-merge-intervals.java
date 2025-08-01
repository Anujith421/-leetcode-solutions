class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        int[] prev = intervals[0];
        List<int[]> merged = new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            int [] interval =intervals[i]; 
            if(interval[0]<= prev[1]){
                prev[1] = Math.max(interval[1],prev[1]);
            }
            else{
                merged.add(prev);
                prev = interval;
            }
        }
        merged.add(prev);
        return merged.toArray(new int[merged.size()] []);
    }
}
