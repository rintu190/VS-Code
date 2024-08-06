using namespace std;
#include <iostream>
#include <vector>

class Solution{

    int main(int argc,char *argv[]){
        Solution sol;
        auto result = sol.search(vector<int>{1,2,3,4,6}, 6);
        cout << "Pair with target:[" << result[0] << "," <<result[1] << "]"<<endl;
    }
    vector<int> search(const vector<int> &arr, int targetSum){
        vector<int> res(2,-1);
        int left = 0, right = arr.size() -1;
        while(left < right){
            int currentSum = arr[left] +arr[right];
            if(currentSum == targetSum){
                res[0] = left;
                res[1] = right;
                return res;
            }
            if(targetSum > currentSum)
            left++;
            else
            right--;
        }
    return res;
    }
};