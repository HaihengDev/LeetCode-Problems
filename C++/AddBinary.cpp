#include<iostream>
#include<string>
#include<algorithm>

std::string addBinaryStrings(std::string a, std::string b) {
  std::string result = "";

  int i = a.length() - 1;
  int j = b.length() - 1;
  int carry = 0;

  while (i >= 0 || j >= 0 || carry) {
    int sum = carry;
    if (i >= 0) sum += a[i--] - '0';
    if (j >= 0) sum += b[j--] - '0';

    result += (sum % 2) + '0';
    carry = sum / 2;
  }

  std::reverse(result.begin(), result.end());
  return result;
}

int main() {
  std::cout<<addBinaryStrings("11", "1")<<std::endl;
  return 0;
}