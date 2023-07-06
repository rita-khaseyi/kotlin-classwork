fun main(){
var q=Queue(5)
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)
    q.display()
    q.dequeue()
    q.enqueue(45)
    q.enqueue(32)
    q.enqueue(64)
    q.enqueue(32)
    q.display()


}

class Queue(var capacity:Int){

    var data=IntArray(capacity)  // we are creating an integer array of size capacity
    //always keep track of the front and rear

    var front=0 //declaring that the front of the queue is at index zero
    var rear =0//when elements join our queue they join from the rear hence
    // when you add a new element the rear becomes zero as well

    fun enqueue(value:Int){//adds an element to the queue
        if (isfull()){
            println("queue is full") //if its full we exit
            return
        }
        data[rear]=value//adding a new value to the data set
        rear++



    }
    fun dequeue():Int?{//return the element that has been removed fromthe queue
        if (isempty()){
            println("Queue is empty")
            return  null
        }

        var removed=data[front]
        for (i in front until rear -1){
            data[i]=data[i +1]


        }
        rear -- //decrementing rear
        return  removed



    }
    fun peek():Int?{//gives you the element that is infront of the queue if the queue is not empty
        if (isempty()){ // checking if its empty
            return  null
        }


        return data[front] //return the elemnt at the front of our data array set

    }
    fun isfull():Boolean{

        return rear==capacity//if they have the same value it means our queue is full it can't acess any elements

    }
    fun isempty():Boolean{
        return front==rear//if they have the same indices value it means its empty

    }
    fun display(){
        if (isempty()){
            return // same as exit
        }
        for (i in front until rear){ //we use until to exclude the first and last element
            println(data[i])
        }


    }


}