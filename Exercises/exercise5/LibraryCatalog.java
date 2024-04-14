// Iterator Pattern

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private List<LibraryItem> items;

    public LibraryCatalog() {
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public LibraryIterator createIterator() {
        return new LibraryListIterator();
    }

    private class LibraryListIterator implements LibraryIterator {
        private int position;

        public LibraryListIterator() {
            this.position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < items.size();
        }

        @Override
        public LibraryItem next() {
            if (!hasNext()) {
                return null;
            }
            return items.get(position++);
        }
    }
}
