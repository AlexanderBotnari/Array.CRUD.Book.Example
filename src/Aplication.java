
public class Aplication {
     
	private static Book[] libraryBooks;
	
	public static void main(String[] args){
          
		libraryBooks = new Book[10];
		
		addBook(new Book("Java Development sucks"));
		addBook(new Book("Java Testing Basics"),1);
		addBook(new Book("Basics of OOP"),2);
		addBook(new Book("Python Basics"),true);
		//deleteBook(2);
		findByTitle("Basics of OOP");
		swapBook("Java Testing Basics", new Book("Hacking by Kali Linux"));
		updateTitle("Java Development is great!",0);
		readAll(true);
		
		
		}
	///////////CRUD//////////////
    public static void addBook(Book book) {
	libraryBooks[0] = book;
		
	}
	/////overload method addBook()
    public static void addBook(Book book, int index) {
    	libraryBooks[index] = book;
    }
    public static void addBook(Book book, boolean atTheEnd) {
         try {
    	 for(int i = libraryBooks.length-1; i <= libraryBooks.length - 1; i-- ) {
         if (libraryBooks[i] != null && atTheEnd == true) {
            libraryBooks[i + 1] = book;
            return;
                  }
               }
          }catch(Exception e){
    	        System.err.println("Enter 'true' to end the book ");
          }
    }
    public static void readAll() {
    	for(int i=0; i<libraryBooks.length; i++) {
    		System.out.println(libraryBooks[i]);
    	}
    }
    public static void readAll(boolean excludeEmpty) {
    	for(int i=0; i<libraryBooks.length; i++) {
    		if(libraryBooks[i] == null && excludeEmpty == true) {
				System.out.println();
    		}else {
    			System.out.println(libraryBooks[i]);
    		}
		}
    }
    public static void updateTitle(String newTitle, int index) {
    	try{
    		libraryBooks[index].setTitle(newTitle);
    	}catch(NullPointerException e) {
    		System.err.println("The shelf is empty!");
    	}
    }
    public static void deleteBook(int index) {
    	libraryBooks[index] = null;
    }
    public static int findByTitle(String title) {
    	for(int i = 0; i < libraryBooks.length; i++){
            if (libraryBooks[i] != null && libraryBooks[i].getTitle().equals(title)) {
            	System.out.println("The place is : "+ i);
            	return i;
            	}
        }
        System.err.println("Nothing was found!");
        return -1;
     }
	public static void swapBook(String title, Book newBook) {
		for (int i = 0; i < libraryBooks.length; i++) {
            if (libraryBooks[i] != null && title.equals(libraryBooks[i].getTitle())) {
            	System.out.println("You exchanged "+libraryBooks[i]+" with "+newBook);
            	libraryBooks[i] = newBook;
                    return;
		
	            }
             }
       }
}

    
    
    
    
    
    

