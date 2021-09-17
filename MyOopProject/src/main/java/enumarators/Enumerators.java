package enumarators;

public class Enumerators{

    enum GirlNames
    {
        ANNA, MARIA, ALLA;

        private GirlNames () {
            System.out.println("Names: " + this.toString());
        }

         public void nameInfo () {
             System.out.println("All names are nice!!!");
         }
    }

    public static void main(String[] args) {
        GirlNames name1 = GirlNames.ANNA;
        GirlNames name2 = GirlNames.MARIA;
        GirlNames name3 = GirlNames.ALLA;
        GirlNames[] arr = GirlNames.values();
        String name = "ANNA";
        Test t1 = new Test (GirlNames.valueOf(name));

        // realisation
        System.out.println(name1+"\n"+name2+"\n"+name3);
        System.out.println(GirlNames.valueOf(name));
        t1.nameIsLike();
        for(GirlNames gn: arr){
            System.out.println(gn + " at index " + gn.ordinal());
        }
        name1.nameInfo();

    }

    public static class Test {
        GirlNames names;

        public Test (GirlNames names){
            this.names=names;
        }
        public void nameIsLike (){
            switch (names){
                case ANNA:
                    System.out.println("Anna is generous");
                    break;
                default:
                    System.out.println("All names mean something");
                    break;

            }
        }

    }


}
