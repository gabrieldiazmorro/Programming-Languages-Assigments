from lexer import lexerCICOM
import os

_CUR_DIR = os.curdir

def test_lexer():
    with open(os.path.join(_CUR_DIR,"Test"), 'r') as testDoc:
        string = testDoc.read()
        lexer = lexerCICOM().buildLexer()
        lexer.input(string)

    tokens = []

    while True:
        token = lexer.token()
        if not token:
            break
        tokens.append(token)

    return tokens