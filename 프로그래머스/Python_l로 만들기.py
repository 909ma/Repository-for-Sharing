"""
문제 설명
알파벳 소문자로 이루어진 문자열 myString이 주어집니다.
알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
"""


def solution(myString):
    answer = ""
    for i in range(len(myString)):
        if myString[i] < "l":
            answer += "l"
        else:
            answer += myString[i]
    return answer


print(solution("abcdevwxyz"))
print(solution("jjnnllkkmm"))


"""
def solution(myString):
    return myString.translate(str.maketrans('abcdefghijk', 'lllllllllll'))


translate() 처음보네
maketrans() 도 처음봐
"""
