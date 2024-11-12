def ValidParenthesis(s):

    l=[]
    b={'}':'{',']':'[',')':'('}

    for i in s:
        if i in b:
            if not l or l[-1]!=b[i]:
                return False
            l.pop()
        else:
            l.append(i)
    return not l

s="()[]}"
print(ValidParenthesis(s))