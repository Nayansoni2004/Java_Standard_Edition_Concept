import java.util.HashMap;
class E {
    //main method
    public static void main(String[] args) {
        HashMap map = new HashMap();

        System.out.println(map.put("mohan" , 78));
        System.out.println(map.put("rohan" , 89));
        System.out.println(map.put("sohan" , 62));
        System.out.println(map.put("ganesh" , 100));
        System.out.println(map.put("vikram" , 56));
        System.out.println(map.put("sohan" , 34));

        System.out.println(map);
    }
}
/*OUTPUT: put()<-value return krti h,or kyuki sohan ko chod ko sare records already exists nhi krte h,isley un
          records ki previous value null assign hui hogi un k obj. m lekin jub sohan second time repeated key 
          di to previous value 62 thi isley put()<-ne 62 return kia or update kr di sohan key ki value 34 se.
null
null
null
null
null
62
{sohan=34, rohan=89, vikram=56, mohan=78, ganesh=100} */