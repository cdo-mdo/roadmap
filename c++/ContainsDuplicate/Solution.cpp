#include <iostream>
#include <vector>
#include <unordered_set>

using namespace std;

class Solution {
public:
bool hasDuplicate(vector<int>& nums) {
    unordered_set<int> checks;
    for (int num: nums) {
        auto it = checks.find(num);
        if (it != checks.end()) {
            return true;
        }
        checks.insert(num);
    }
    return false;
}
};

int main() {
    Solution solution;

    vector<int> nums{1, 2, 3, 3};
    cout << solution.hasDuplicate(nums) << endl;
    vector<int> nums1{1, 2, 3, 4};
    cout << solution.hasDuplicate(nums1) << endl;
}

