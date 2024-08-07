#include <iostream>

using namespace std;

class Solution {
public:
    bool isAnagram(string s, string t) {
        int counter[28];
        for (int i = 0; i < 28; i++) {
			counter[i] = 0;
		}

        for (auto c : s) {
            counter[c - 'a']++;
        }
        for (auto c : t) {
            counter[c - 'a']--;
        }

        for (int i = 0; i < 28; i++) {
            if (counter[i] != 0) {
                return false;
            }
        }

        return true;
    }
};

int main() {
    Solution* solution = new Solution();

    cout << solution->isAnagram("racecar", "carrace") << endl;
    cout << solution->isAnagram("jam", "jar") << endl;

	delete solution;
}
