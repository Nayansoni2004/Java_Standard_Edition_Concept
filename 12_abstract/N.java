abstract class V {


}

class N extends V {


}
/* OUTPUT:  happily compiled 
abstract class V parent class h N class ka ,or N class child class h V class ka,V abstract class h,lekin uske 
andar 1 bhi method nhi h,isley child class ko abstract mark nhi krna padega,kyuki V class m kuch adhura h hi nhi
to child class N kya complete krega,isley child class ko abstract mark nhi krna pada, or V class ko bs isley 
abstract mark kia h,taki koi V class ka object na bana le.
*/