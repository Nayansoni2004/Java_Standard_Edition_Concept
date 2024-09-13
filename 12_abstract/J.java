abstract final class J {


}
/* J.java:1: error: illegal combination of modifiers: abstract and final
abstract final class J {
               ^
1 error

REASON 1:---
error aai kyuki class ko abstract or final dono keywords se ek sath mark nhi kr sakte,kyuki abstract mark kia h
matlab class ko koi instantiation k through access nhi kr sakta,abstract class ka object nhi bana sakte,
kewal inheritance k through hi access kr sakte h, or final class ko inheritance k through access nhi kr sakte,
matlab final class ko parent nhi bana skate,or modification kewal child class ko allowed h,or instantiation k 
through final class k members ko ik ik krke access kr sakte h..isley final or abstract modifiers ik sath class 
m mark nhi kr sakte.

REASON 2: class abstract mark h matlab class adhuri(incomplete)h or final mark h matlab class poori(complete)h,
          or class final or abstract mark h matlab class complete or incomplete h,ye kese ho sakta h,ki class
          complete bhi h or incomplete bhi h,isley class ko final abstract dono ik sath mark nhi kr salte.
*/