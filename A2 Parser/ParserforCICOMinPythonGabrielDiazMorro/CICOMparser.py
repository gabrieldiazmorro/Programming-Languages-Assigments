# Parser Starts Here
import ply.yacc as yacc
from lexer import lexerCICOM as lexer


tokens = lexer.tokens
lexer = lexer().buildLexer()

def p_Exp(p):
    '''

    Exp : Term 
        | Term PLUS Exp
        | Term MINUS Exp
        | Term OPERATOR Exp
        | IF Exp THEN Exp ELSE Exp
        | LET DefList IN Exp
        | MAP IdList TO Exp
        | MAP TO Exp

    '''

# missing empty and Bool
def p_Term(p):
    '''

    Term : PLUS Term
        | MINUS Term
        | TILDE Term
        | Factor 
        | Factor OP ExpList CP
        | Factor OP CP
        | Empty
        | INT
        | Bool

    '''

def p_Factor(p):
    '''

    Factor : OP Exp CP
        | Prim
        | Id

    '''

def p_ExpList(p):
    '''

    ExpList : PropExpList

    '''

def p_PropExpList(p):
    '''

    PropExpList : Exp
        | Exp COMMA PropExpList

    '''

def p_IdList(p):
    '''

    IdList : PropIdList

    '''

def p_PropIdList(p):
    '''

    PropIdList : Id
        | Id COMMA PropIdList

    '''

def p_Def(p):
    '''

    Def : Id ASSIGN Exp SEMICOLON
    '''

def p_DefList(p):
    '''

    DefList : Def DefList
    | Def

    '''

def p_Empty(p):
    '''

    Empty : EMPTY

    '''

def p_Bool(p):
    '''

    Bool : TRUE
        | FALSE

    '''

# Unop & Binop se mamaron ya los define en exp y term


def p_Prim(p):
    '''

    Prim : NUMBER_1
        | FUNCTION_1
        | LIST_1
        | EMPTY_1
        | CONS_1
        | CONS
        | FIRST
        | REST
        | ARITY

    '''

# Error rule for syntax errors
def p_error(p):
    print("Syntax error at token", p, "line:", p.lexer.lineno)


parser = yacc.yacc()



