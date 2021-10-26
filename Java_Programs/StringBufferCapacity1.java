

class StringBufferCapacity1{
    public static void main(String args[]){
    StringBuffer sb=new StringBuffer();
    System.out.println(sb.capacity());//default 16
    sb.append("Hello");
    System.out.println(sb.capacity());//now 16
    sb.append("java is my favourite language");
    System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2

     sb.append("Hello,java is my favourite language and it is used to create web ");
    System.out.println(sb.capacity());//now  99
    }
    }
