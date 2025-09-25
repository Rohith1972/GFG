#User function Template for python3

def reverseString(s):
    #Write your code below to reverse s and return it
    ch = list(s)
    left, right = 0, len(ch) - 1
    while left < right:
        ch[left], ch[right] = ch[right], ch[left]
        left += 1
        right -= 1
    return ''.join(ch)