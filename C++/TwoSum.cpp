#include<iostream>
#include<vector>

std::vector<int> twoSum(std::vector<int>& nums, int target) {
  for (int i = 0; i < nums.size(); i++) {
    for (int j = i + 1; j < nums.size(); j++) {
      if (nums[i] + nums[j] == target) {
        return {i, j};
      }
    }
  }

  return {};
}

int main() {
  std::vector<int> numbers = {3, 6, 9, 12, 17};
  std::vector<int> result = twoSum(numbers, 9);
  
  for(int i = 0; i < result.size(); i++) {
    std::cout<<result[i]<<std::endl;
  }

  return 0;
}