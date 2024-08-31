class Solution:
    def canJump(self, nums: List[int]) -> bool:
        gap=0
        for n in nums:
            if gap<0:
                return False
            elif n>gap:
                gap=n
            gap-=1
        return True