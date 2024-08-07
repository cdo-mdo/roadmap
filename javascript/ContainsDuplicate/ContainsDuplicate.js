class Solution {
    hasDuplicate(nums) {
        let seens = new Set();
        for (let i = 0; i < nums.length; i++) {
            if (seens.has(nums[i])) {
                return true;
            }
            seens.add(nums[i]);
        }
        return false;
    }
}

const solution = new Solution();
document.getElementById("demo1").innerHTML = "check array [1, 2, 3, 3] has dulplicate: " + solution.hasDuplicate([1, 2, 3, 3]);
document.getElementById("demo2").innerHTML = "check array [1, 2, 3, 4] has dulplicate: " + solution.hasDuplicate([1, 2, 3, 4]);
