package CA224;

public class ArrayStack<T> {
    private Boolean Duplicate(ArrayStack list , T element){

        for (int i = 0; i < list.size(); i++){
            if (list.stack[i].equals(element))
                return true;
        }

        return false;
    }

    public void merge(ArrayStack<T> list1 , ArrayStack<T> list2){

        // how many elements are in the lists :
        int size = list1.size() + list2.size();

//      checking if stack is less than the size
        if (stack.length < size)
            stack = Arrays.copyOf(stack,size);

//      check if list 1 is in duplicates values

        for (int i = 0; i < list1.size(); i++){
//          check if Duplicate is in the list 1
            if (!Duplicate(this, list1.stack[i]))
                this.push(list1.stack[i]);

        }

//        checking if list 2 is in duplicates values

        for (int i = 0; i < list2.size(); i++){
//            check if duplicate is in the list 2
            if (!Duplicate(this,list2.stack[i]))
                this.push(list2.stack[i]);
        }

}
