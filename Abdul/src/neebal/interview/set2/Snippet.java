//Note this is python program

//package neebal.interview.set2;
//
//public class Snippet {
//	def patt(n):
//	    for r in range(n):
//	        for c in range(n):
//	            
//	            if ((c == 0 or c == n-1) or r + c == (n - 1) and r < n/2 or r == c and r < n/2):
//	                print("X", end=" ")
//	            else:
//	                print(" ", end=" ")
//	        print()
//	
//	
//	n = int(input("Enter matrix size: "))
//	
//	patt(n)
//}
//


///Leap year check in python

//def leap(Y):
//    if (Y % 4) == 0:
//        if (Y % 100) == 0:
//            if (Y % 400) == 0:
//                return 0
//            else:
//                return 1
//        else:
//             return 0
//    else:
//        return 1
// 
//print("Enter a Year: ")
//Y = int(input())
//if(leap(Y)==0):
//    print("Its a Leap Year")
//else:
//    print("It is not a Leap Year")