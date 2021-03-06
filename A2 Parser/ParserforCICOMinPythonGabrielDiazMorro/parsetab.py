
# parsetab.py
# This file is automatically generated. Do not edit.
# pylint: disable=W,C,R
_tabversion = '3.10'

_lr_method = 'LALR'

_lr_signature = 'ARITY ASSIGN CB COMMA CONS CONS_1 CP ELSE EMPTY EMPTY_1 FALSE FIRST FUNCTION_1 IF IN INT Id LET LIST_1 MAP MINUS NUMBER_1 OB OP OPERATOR PLUS REST SEMICOLON THEN TILDE TO TRUE\n\n    Exp : Term \n        | Term PLUS Exp\n        | Term MINUS Exp\n        | Term OPERATOR Exp\n        | IF Exp THEN Exp ELSE Exp\n        | LET DefList IN Exp\n        | MAP IdList TO Exp\n        | MAP TO Exp\n\n    \n\n    Term : PLUS Term\n        | MINUS Term\n        | TILDE Term\n        | Factor \n        | Factor OP ExpList CP\n        | Factor OP CP\n        | Empty\n        | INT\n        | Bool\n\n    \n\n    Factor : OP Exp CP\n        | Prim\n        | Id\n\n    \n\n    ExpList : PropExpList\n\n    \n\n    PropExpList : Exp\n        | Exp COMMA PropExpList\n\n    \n\n    IdList : PropIdList\n\n    \n\n    PropIdList : Id\n        | Id COMMA PropIdList\n\n    \n\n    Def : Id ASSIGN Exp SEMICOLON\n    \n\n    DefList : Def DefList\n    | Def\n\n    \n\n    Empty : EMPTY\n\n    \n\n    Bool : TRUE\n        | FALSE\n\n    \n\n    Prim : NUMBER_1\n        | FUNCTION_1\n        | LIST_1\n        | EMPTY_1\n        | CONS_1\n        | CONS\n        | FIRST\n        | REST\n        | ARITY\n\n    '
    
_lr_action_items = {'IF':([0,5,10,28,29,30,38,42,47,48,50,51,65,66,],[5,5,5,5,5,5,5,5,5,5,5,5,5,5,]),'LET':([0,5,10,28,29,30,38,42,47,48,50,51,65,66,],[6,6,6,6,6,6,6,6,6,6,6,6,6,6,]),'MAP':([0,5,10,28,29,30,38,42,47,48,50,51,65,66,],[7,7,7,7,7,7,7,7,7,7,7,7,7,7,]),'PLUS':([0,2,3,4,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,38,41,42,47,48,50,51,55,58,64,65,66,],[3,28,3,3,3,3,-12,3,-15,-16,-17,-19,-20,-30,-31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,3,3,3,-9,-10,3,-11,3,3,3,3,3,-14,-18,-13,3,3,]),'MINUS':([0,2,3,4,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,38,41,42,47,48,50,51,55,58,64,65,66,],[4,29,4,4,4,4,-12,4,-15,-16,-17,-19,-20,-30,-31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,4,4,4,-9,-10,4,-11,4,4,4,4,4,-14,-18,-13,4,4,]),'TILDE':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,]),'INT':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,]),'OP':([0,3,4,5,8,9,10,14,15,19,20,21,22,23,24,25,26,27,28,29,30,38,42,47,48,50,51,58,65,66,],[10,10,10,10,10,42,10,-19,-20,-33,-34,-35,-36,-37,-38,-39,-40,-41,10,10,10,10,10,10,10,10,10,-18,10,10,]),'Id':([0,3,4,5,6,7,8,10,28,29,30,35,38,42,47,48,50,51,53,65,66,67,],[15,15,15,15,36,40,15,15,15,15,15,36,15,15,15,15,15,15,40,15,15,-27,]),'EMPTY':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,]),'TRUE':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,]),'FALSE':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,]),'NUMBER_1':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,]),'FUNCTION_1':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,]),'LIST_1':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,]),'EMPTY_1':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,]),'CONS_1':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,]),'CONS':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,]),'FIRST':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,]),'REST':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,]),'ARITY':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,]),'$end':([1,2,9,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,31,32,41,44,45,46,52,55,58,60,62,64,69,],[0,-1,-12,-15,-16,-17,-19,-20,-30,-31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,-9,-10,-11,-2,-3,-4,-8,-14,-18,-6,-7,-13,-5,]),'THEN':([2,9,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,31,32,33,41,44,45,46,52,55,58,60,62,64,69,],[-1,-12,-15,-16,-17,-19,-20,-30,-31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,-9,-10,47,-11,-2,-3,-4,-8,-14,-18,-6,-7,-13,-5,]),'CP':([2,9,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,31,32,41,42,43,44,45,46,52,54,55,56,57,58,60,62,64,68,69,],[-1,-12,-15,-16,-17,-19,-20,-30,-31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,-9,-10,-11,55,58,-2,-3,-4,-8,64,-14,-21,-22,-18,-6,-7,-13,-23,-5,]),'COMMA':([2,9,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,31,32,40,41,44,45,46,52,55,57,58,60,62,64,69,],[-1,-12,-15,-16,-17,-19,-20,-30,-31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,-9,-10,53,-11,-2,-3,-4,-8,-14,65,-18,-6,-7,-13,-5,]),'ELSE':([2,9,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,31,32,41,44,45,46,52,55,58,59,60,62,64,69,],[-1,-12,-15,-16,-17,-19,-20,-30,-31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,-9,-10,-11,-2,-3,-4,-8,-14,-18,66,-6,-7,-13,-5,]),'SEMICOLON':([2,9,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,31,32,41,44,45,46,52,55,58,60,61,62,64,69,],[-1,-12,-15,-16,-17,-19,-20,-30,-31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,-9,-10,-11,-2,-3,-4,-8,-14,-18,-6,67,-7,-13,-5,]),'OPERATOR':([2,9,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,31,32,41,55,58,64,],[30,-12,-15,-16,-17,-19,-20,-30,-31,-32,-33,-34,-35,-36,-37,-38,-39,-40,-41,-9,-10,-11,-14,-18,-13,]),'TO':([7,37,39,40,63,],[38,51,-24,-25,-26,]),'IN':([34,35,49,67,],[48,-29,-28,-27,]),'ASSIGN':([36,],[50,]),}

_lr_action = {}
for _k, _v in _lr_action_items.items():
   for _x,_y in zip(_v[0],_v[1]):
      if not _x in _lr_action:  _lr_action[_x] = {}
      _lr_action[_x][_k] = _y
del _lr_action_items

_lr_goto_items = {'Exp':([0,5,10,28,29,30,38,42,47,48,50,51,65,66,],[1,33,43,44,45,46,52,57,59,60,61,62,57,69,]),'Term':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[2,31,32,2,41,2,2,2,2,2,2,2,2,2,2,2,2,]),'Factor':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,]),'Empty':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,]),'Bool':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,]),'Prim':([0,3,4,5,8,10,28,29,30,38,42,47,48,50,51,65,66,],[14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,]),'DefList':([6,35,],[34,49,]),'Def':([6,35,],[35,35,]),'IdList':([7,],[37,]),'PropIdList':([7,53,],[39,63,]),'ExpList':([42,],[54,]),'PropExpList':([42,65,],[56,68,]),}

_lr_goto = {}
for _k, _v in _lr_goto_items.items():
   for _x, _y in zip(_v[0], _v[1]):
       if not _x in _lr_goto: _lr_goto[_x] = {}
       _lr_goto[_x][_k] = _y
del _lr_goto_items
_lr_productions = [
  ("S' -> Exp","S'",1,None,None,None),
  ('Exp -> Term','Exp',1,'p_Exp','CICOMparser.py',12),
  ('Exp -> Term PLUS Exp','Exp',3,'p_Exp','CICOMparser.py',13),
  ('Exp -> Term MINUS Exp','Exp',3,'p_Exp','CICOMparser.py',14),
  ('Exp -> Term OPERATOR Exp','Exp',3,'p_Exp','CICOMparser.py',15),
  ('Exp -> IF Exp THEN Exp ELSE Exp','Exp',6,'p_Exp','CICOMparser.py',16),
  ('Exp -> LET DefList IN Exp','Exp',4,'p_Exp','CICOMparser.py',17),
  ('Exp -> MAP IdList TO Exp','Exp',4,'p_Exp','CICOMparser.py',18),
  ('Exp -> MAP TO Exp','Exp',3,'p_Exp','CICOMparser.py',19),
  ('Term -> PLUS Term','Term',2,'p_Term','CICOMparser.py',27),
  ('Term -> MINUS Term','Term',2,'p_Term','CICOMparser.py',28),
  ('Term -> TILDE Term','Term',2,'p_Term','CICOMparser.py',29),
  ('Term -> Factor','Term',1,'p_Term','CICOMparser.py',30),
  ('Term -> Factor OP ExpList CP','Term',4,'p_Term','CICOMparser.py',31),
  ('Term -> Factor OP CP','Term',3,'p_Term','CICOMparser.py',32),
  ('Term -> Empty','Term',1,'p_Term','CICOMparser.py',33),
  ('Term -> INT','Term',1,'p_Term','CICOMparser.py',34),
  ('Term -> Bool','Term',1,'p_Term','CICOMparser.py',35),
  ('Factor -> OP Exp CP','Factor',3,'p_Factor','CICOMparser.py',42),
  ('Factor -> Prim','Factor',1,'p_Factor','CICOMparser.py',43),
  ('Factor -> Id','Factor',1,'p_Factor','CICOMparser.py',44),
  ('ExpList -> PropExpList','ExpList',1,'p_ExpList','CICOMparser.py',51),
  ('PropExpList -> Exp','PropExpList',1,'p_PropExpList','CICOMparser.py',58),
  ('PropExpList -> Exp COMMA PropExpList','PropExpList',3,'p_PropExpList','CICOMparser.py',59),
  ('IdList -> PropIdList','IdList',1,'p_IdList','CICOMparser.py',66),
  ('PropIdList -> Id','PropIdList',1,'p_PropIdList','CICOMparser.py',73),
  ('PropIdList -> Id COMMA PropIdList','PropIdList',3,'p_PropIdList','CICOMparser.py',74),
  ('Def -> Id ASSIGN Exp SEMICOLON','Def',4,'p_Def','CICOMparser.py',81),
  ('DefList -> Def DefList','DefList',2,'p_DefList','CICOMparser.py',87),
  ('DefList -> Def','DefList',1,'p_DefList','CICOMparser.py',88),
  ('Empty -> EMPTY','Empty',1,'p_Empty','CICOMparser.py',95),
  ('Bool -> TRUE','Bool',1,'p_Bool','CICOMparser.py',102),
  ('Bool -> FALSE','Bool',1,'p_Bool','CICOMparser.py',103),
  ('Prim -> NUMBER_1','Prim',1,'p_Prim','CICOMparser.py',113),
  ('Prim -> FUNCTION_1','Prim',1,'p_Prim','CICOMparser.py',114),
  ('Prim -> LIST_1','Prim',1,'p_Prim','CICOMparser.py',115),
  ('Prim -> EMPTY_1','Prim',1,'p_Prim','CICOMparser.py',116),
  ('Prim -> CONS_1','Prim',1,'p_Prim','CICOMparser.py',117),
  ('Prim -> CONS','Prim',1,'p_Prim','CICOMparser.py',118),
  ('Prim -> FIRST','Prim',1,'p_Prim','CICOMparser.py',119),
  ('Prim -> REST','Prim',1,'p_Prim','CICOMparser.py',120),
  ('Prim -> ARITY','Prim',1,'p_Prim','CICOMparser.py',121),
]
