using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace C_
{
    class Program
    {
        static void Main(string[] args)
        {
            //Create queue
            Queue<string> myqueue = new Queue<string>();

            //insert objects in queue
            myqueue.Enqueue("First object");
            myqueue.Enqueue("Second object");
            myqueue.Enqueue("Third object");
            myqueue.Enqueue("Forth object");
            
            //Remove objects in queue
            myqueue.Dequeue();

            foreach(string element in myqueue){
                Console.WriteLine(element);
            }
            Console.ReadLine();
        }
    }
}
