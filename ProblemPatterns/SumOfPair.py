class Solution:
    def search(self,arr,targetSum):
        left,right = 0,len(arr)-1
        while(left<right):
            currentSum = arr[left]+arr[right]
            if currentSum == targetSum:
                return [left,right]
            if targetSum > currentSum:
                left+=1
            else:
                right-=1
        return [-1,-1]
def main():
        sol = Solution()
        print(sol.search([1,2,3,4,6],6))
        print(sol.search([2,5,9,11],11))
    
main()