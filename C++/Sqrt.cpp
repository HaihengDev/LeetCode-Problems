#include<iostream>
#include<cmath>

int mySqrt(int n) {
  if (n < 0) return -1;
  if (n == 0) return 0;

  int left = 1;
  int right = n;
  int ans = 0;

  while (left <= right) {
    int mid = left + (right - left) / 2;

    long long square = 1LL * mid * mid;

    if(square == n) {
      return mid;
    }
    else if (square < n) {
      ans = mid;
      left = mid + 1;
    } else {
      right = mid - 1;
    }
  }

  return ans;
}

int main() {
  std::cout<<mySqrt(8)<<std::endl;

  return 0;
}