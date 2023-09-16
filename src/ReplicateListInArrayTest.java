import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplicateListInArrayTest {
    ReplicateListInArray.List<Integer> list;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        list = new ReplicateListInArray.ArrayList<>();
    }

    void initialize() {
        list.add(1);
    }

    @Test
    public void shouldCheckEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    public void shouldAddElement() {
        list.add(3);
        assertTrue(list.contains(3));
    }

    @Test
    public void shouldCheckIfContainsElement() {
        initialize();
        assertAll("contains", () -> assertTrue(list.contains(1)), () -> assertFalse(list.contains(0)));
    }

    @Test
    public void shouldRemoveElement() {
        initialize();
        assertAll("remove",
                () -> {
                    list.remove(1);
                    assertTrue(list.isEmpty());
                }
        );
    }

    @Test
    public void shouldSetElement() {
        initialize();
        assertAll(
                "set-element",
                () -> {
                    list.set(0, 6);
                    assertEquals(6, (int) list.get(0));
                }
        );
    }

    @Test
    public void shouldThrowException() {
        assertAll(
                "exception",
                () -> assertThrows(IndexOutOfBoundsException.class, () -> list.get(6)),
                () -> assertThrows(IndexOutOfBoundsException.class, () -> list.set(6, 2))
        );
    }

    @Test
    public void shouldClearList() {
        initialize();
        assertAll(
                "clear",
                () -> {
                    list.clear();
                    assertTrue(list.isEmpty());
                }
        );
    }
}