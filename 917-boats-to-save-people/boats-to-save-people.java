class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int i = 0;
        int j = n-1;
        Arrays.sort(people);
        int boat = 0;
        while(i<=j){
            int k = people[i]+people[j]; 
            if(k<=limit){
                i++;
            }
                boat++;
                j--;
            }
        
        return boat;

    }
}