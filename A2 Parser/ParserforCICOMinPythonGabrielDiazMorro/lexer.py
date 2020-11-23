import ply.lex as lex
from ply.lex import TOKEN

class lexerCICOM():
    # List of keywords.
    reservedwords = {
            "if": "IF",
            "else": "ELSE",
            "then": "THEN",
            "to": "TO",
            "map": "MAP",
            "in": "IN",
            "let": "LET",
            "true": "TRUE",
            "false": "FALSE",
            "empty": "EMPTY",
            "number?": "NUMBER_1",
            "function?": "FUNCTION_1",
            "list?": "LIST_1",
            "empty?": "EMPTY_1",
            "cons?": "CONS_1",
            "cons": "CONS",
            "first": "FIRST",
            "rest": "REST",
            "arity": "ARITY"
        }

    # List of token names.   This is always required

    tokens = (""
        'OPERATOR',
        'COMMA',
        'Id',
        'PLUS',
        'MINUS',
        'OP',
        'CP',
        'SEMICOLON',
        'INT',
        'ASSIGN',
        'TILDE',
        'OB',
        'CB',
    ) + tuple(reservedwords.values())

    # Regular expression rules for simple tokens
    CHARACTER = r'([a-zA-Z]|\?|_)'
    DIGIT = r'[0-9]'
    IDENTIFIER = rf'{CHARACTER} ({CHARACTER}|{DIGIT})*'


    t_INT = DIGIT + r'+'


    #DELIMITER
    t_OP = r'\('
    t_CP = r'\)'
    t_OB = r'\['
    t_CB = r'\]'
    t_COMMA = r'\,'
    t_SEMICOLON = r'\;'
    t_ASSIGN = r'\:='
    t_OPERATOR = r'( \* | \/ | \= | \!= | \<= | \>= | \< | \> | \& )'

    t_TILDE = r'\~'
    t_PLUS = r'\+'
    t_MINUS = r'\-'



    # Define a rule so we can track line numbers
    def t_newline(self, t):
        r'\n+'
        t.lexer.lineno += len(t.value)


    # A string containing ignored characters (spaces and tabs)
    t_ignore = ' | \t'

    @TOKEN(IDENTIFIER)
    def t_Id(self, t):
        t.type = self.reservedwords.get(t.value, "Id")
        return t

    # Error handling rule
    def t_error(self, t):
        print("Illegal character '%s'" % t.value[0])
        t.lexer.skip(1)


    def buildLexer(self):
        return lex.lex(module=self)


