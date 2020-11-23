import sys

from CICOMparser import parser
from test import test_lexer

from pprint import pprint
import os

_CUR_DIR = os.getcwd()

testFile = os.path.join(_CUR_DIR, "Test")

def main():

    with open(testFile, 'r') as input_file:
        parser.parse(input_file.read())
        print("If only this line of text is printed, Parsing was successful!")

if __name__=='__main__':
    #In command line, run "python main.py -t Test" to view tokens in test file
    if '-t' in sys.argv:
        pprint(test_lexer())
    else:
        main()