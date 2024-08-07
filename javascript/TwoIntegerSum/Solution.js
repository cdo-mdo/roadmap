class Solution {
    twoSum(nums, target) {
        const seens = new Map();
        for (let i = 0; i < nums.length; i++) {
            let diff = target - nums[i];
            if (seens.has(diff)) {
                return [seens.get(diff), i];
            }
            seens.set(nums[i], i);
        }

        return [];
    }
}

const solution = new Solution();

document.getElementById("demo").innerHTML = "check [3, 4, 5, 6] against target 7 " + solution.twoSum([3, 4, 5, 6], 7);
