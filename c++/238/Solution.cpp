#include <vector>
using namespace std;


class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> results(n, 1);

        // left product
        int left = 1;
        for (int i =0; i < nums.size(); i++) {
            results[i] = left;
            left *= nums[i];
        }

        // right product
        int right = 1;
        for (int i = n - 1; i > -1; i--) {
            results[i] *= right;
            right *= nums[i];
        }

        return results;
    }
};
