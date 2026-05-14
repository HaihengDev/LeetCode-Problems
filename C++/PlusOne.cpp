#include<iostream>

std::vector<int> plusOne(std::vector<int>& digits) {
  int n = digits.size();

  for (int i = n - 1; i >= 0; i--) {
    if(digits[i] < 9) {
      digits[i]++;
      return digits;
    }

    digits[i] = 0;
  }

  digits.insert(digits.begin(), 1);

  return digits;
}

void printAll(std::vector<int> numbers) {
  std::cout<<"[";
  for (int i = 0; i < numbers.size(); i++) {
    if (i == numbers.size() - 1) {
      std::cout<<numbers[i]<<"]"<<std::endl;
    }
    std::cout<<numbers[i]<<", ";
  }
}

int main() {
  std::vector<int> numbers1 = {1, 2, 4};
  std::vector<int> numbers2 = {9};

  std::vector<int> result1 = plusOne(numbers1);
  std::vector<int> result2 = plusOne(numbers2);

  printAll(result1);
  printAll(result2);

  return 0;
}