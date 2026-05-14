#include<iostream>

bool isPalindrome(int num) {
  if (num < 0) return false;

  int reversedNum = 0;
  int original = num;

  while (original > 0) {
    int digit = original % 10;
    reversedNum = reversedNum * 10 + digit;
    original /= 10;
  }

  return num == reversedNum;
}

int main() {
  return 0;
}