#include <iostream>
#include <unordered_map>
#include <vector>

using namespace std;

class Solution {
public:
vector<int> twoSum(vector<int>& nums, int target) {
    unordered_map<int, int> seens;
    for (int i = 0; i < nums.size(); ++i) {
        int diff = target - nums.at(i);
        if (seens.find(diff) != seens.end()) {
            return {seens[diff], i};
        }
        seens[nums[i]] = i;
    }

    return {};
}
};

int main() {
    Solution* solution = new Solution();

    vector<int> nums = {3, 4, 5, 6};
    vector<int> result = solution->twoSum(nums, 7);
	cout << "[" << result[0] << ", " << result[1] << "]" << endl;

    vector<int> nums2 = {4, 5, 6};
    result = solution->twoSum(nums2, 10);
	cout << "[" << result[0] << ", " << result[1] << "]" << endl;

	delete solution;
}
