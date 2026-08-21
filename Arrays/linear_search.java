public class linear_search {
    static int linear__search(int nums[], int key){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }

    static int l_s_str(String menu[],String item) {
        for(int i=0;i<menu.length;i++){
            if(menu[i].equals(item)){    // special used to compare to array with strings
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
    int nums[] = {1,34,43,65,76,6,787,10} ;
    int key = 10;
    int idx = linear__search(nums,key);
    if(idx ==-1){
        System.out.println("Not found");
    }
    else {
        System.out.println("key found at : "+ idx);
    }


    //searching for an item 
    String menu[] = {"tea","copy","chapati","biriyani","samosa"};
    String item = "samosa"; 
    int index = l_s_str(menu,item);
    if(index ==-1) {
        System.out.println("item not in the canteen");
    }
    else{
        System.out.println("Item in "+ index +"th box"  );
    }
    }
}
