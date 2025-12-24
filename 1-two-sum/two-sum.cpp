class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> answer;
        int length = nums.size();
        for(int i = 0; i < length; i++){
            for(int j = i + 1; j<length;j++){
                if(nums[i]+nums[j]==target){
                    answer.push_back(i);
                    answer.push_back(j);
                }
            }
        }
        return answer;
    }
};