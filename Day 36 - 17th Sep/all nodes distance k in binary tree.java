class Solution:
    def distanceK(self, root: TreeNode, target: TreeNode, k: int) -> List[int]:
        starts = [(target, k)]

        def find_starts(node):
            if node is None:
                return None
            if node == target:
                return 1
            left_dist = find_starts(node.left)
            right_dist = find_starts(node.right)
            dist = left_dist or right_dist
            if dist:
                if k - dist >= 0:
                    starts.append((node, k-dist))
                return dist+1
            return None
        
        find_starts(root)

        visited = set()
        ans = []
        def find_nodes(node, dist):
            if node is None or dist < 0 or node in visited:
                return
            visited.add(node)
            if dist == 0:
                ans.append(node.val)
                return
            find_nodes(node.left, dist-1)
            find_nodes(node.right, dist-1)

        for start, dist in starts:
            find_nodes(start, dist)
        return ans