/* 

*** Length Of Last Word ***

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

*/

#include<iostream>
#include<sstream>
#include<vector>
#include<string>

int lengthOfLastWord(std::string s) {
  std::stringstream ss(s);
  std::string word;
  std::vector<std::string> words;

  while (ss >> word) {
    words.push_back(word);
  }

  int index = words.size() - 1;

  std::string lastWord = words[index];

  size_t length = lastWord.length();

  return length;
}

int main() {
  std::string text = "Hello,  World";

  std::cout<<lengthOfLastWord(text)<<std::endl;

  return 0;
}