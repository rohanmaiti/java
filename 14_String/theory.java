 // * String in java is immutable.

 // * what does it means by immutable ?
 // >> onece memory is allocated, after that memory space content can't be changed 

 // * How to create/store strings in java ? 
 // >> there is two way of creating a string in java 
 // 1. using new Keywork like --> String str = new String("abc");
 // 2. using normal string literals like --> String str = "abc"; 

 // * what is literal ? 
 // >> in short when you write this String str = "abc";  or  String str = new String("abc"); here "abc" is called string literals 
 // similarly there are int literals, float literals etc. Ex- 10, -10 / 2.3, 4.5

 // * what is the difference between creating strings in the above 2 ways ? 
 // >> 1. String str = "abc";
 // when we write this lets understand how this get's memory allocation ? 
 // as String is a object, it will get space in heap area;
 // now inside the heap area there is a space called // * String constant pool (SCP) 

 // when we create a String variable without using new keyword like// * String str = "abc";
 // the str variable get space in the stack, next the JVM search "abc" in the SCP, if not found, creates a record of "abc" and store the address in str. 
 // * so next time you create a same string like --> String s2 = "abc", JVM do not create a another object in the heap area SCP
 // * it checks weather the exact string exists in SCP or not as in this case "abc" is already created so it returns the address of "abc" from SCP 
 // * so now both s2 and str is pointing to a single object .... this way java manage memory efficiently 

 // now if you change any string like -> // *  str = "xyz" what happens ? 
 // as str was pointing to the memory location of "abc",  now you might think that "abc" got changed to "xyz"
 // but that now happens...
 // everytime you modify the string variable like this ...
 // 1. 1st it checks for SCP weather the new updated string is present in the SCP or not 
 // 2. if not present then creates a record and update the new address at str variable else points to the previously existing address 

 // * Now what happens when we write // * String str = new String("abc");
 // 1st it checks the SCP for pre-existance, if +nt then do not created another record in SCP // * but creates a record outside the SCP, that is in outer heap
 // everytime you create a string using new keyword ... each time a record got created at outer heap memory after creating a record in SCP ... inspite of if they are same string ...
 // ex --> 
 // what happes when we execute the below program ?
 // `String s1 = new String("abc");
 // `String s2 = new String("abc");
 // `String s3 = "abc";
 // `String s4 = "abc"; 

// step 1: when s1 is about to created, it checks in the SCP for existance of "abc", and as no existance, it creates a record/object (lets say address 1001) inside the SCP.
// step 2: as this is created using new keyword, one record/obect is created (lets say address 2001) in the outer heap area...
// step 3: s1 variable got memory in stack and it points to 2001

// step 4: now for s2 JVM will found the literal in SCP and will not create a record in SCP again, but will create a record/object in the outer heap area (lets say address 2004)
// step 5: then s2 will get memory in stack and will points to 2004

// so if you do (s1 === s2) you will get false as they points to different addresses...
// now for s3, s4 will get memory in stack and will point to previously created "abc" in SCP that is address 1001; same for s4
// now if you do (s1 == s3) still it will give false as they are pointing to different addresses
// but if you do (s3 == s4) you will get true as they are pointing to the same address at SCP ie 1001

// * what happens when we take input string 
// like String str = sc.next();

// as SCP is for compile time memory management, when we take input as a string, it gets only memory in heap area.. not in SCP 
// even it is not present in SCP 
// when taking input as a string and storing it, JVM does not look at SCP, there is not relation with SCP at that time 




