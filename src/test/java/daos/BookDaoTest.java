package daos;

import business.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class BookDaoTest {




    @BeforeEach
    public void setUp() {

    }




    /**
     * Tests the DisplayAllBook() method.
     */
    @Test
    void testDisplayAllBook() {
        BookDao bookDao= new BookDao("testlibrary");
        ArrayList<Book> books = bookDao.DisplayAllBook();
        assertNotNull(books);
        assertFalse(books.isEmpty());
    }

    /**
     * Tests the removeBook(int) method.
     */
    @Test
    void testRemoveBook() {
        BookDao bookDao= new BookDao("testlibrary");
        int rowsAffected = bookDao.removeBook(1);
        assertEquals(1, rowsAffected);
    }

    /**
     * Tests the addBook(int, int, String, String, int) method.
     */
    @Test
    void testAddBook() {
        BookDao bookDao= new BookDao("testlibrary");
        int newId = bookDao.addBook(4, 2, "New Book", "New Author", 10);
        assertTrue(newId > 0);
    }

    /**
     * Tests the borrowBook(int, int) method.
     */
    @Test
    void testBorrowBook() {
        BookDao bookDao= new BookDao("testlibrary");
        int rowsAffected = bookDao.borrowBook(1, 1);
        assertEquals(1, rowsAffected);
    }

    /**
     * Tests the returnBook(int, int) method.
     */
    @Test
    void testReturnBook() {
        BookDao bookDao= new BookDao("testlibrary");
        int rowsAffected = bookDao.returnBook(1, 1);
        assertEquals(1, rowsAffected);
    }

    /**
     * Tests the UpdateNumberOfCopies(int, int) method.
     */
    @Test
    void testUpdateNumberOfCopies() {
        BookDao bookDao= new BookDao("testlibrary");
        int rowsAffected = bookDao.UpdateNumberOfCopies(1, 15);
        assertEquals(1, rowsAffected);
    }
}

