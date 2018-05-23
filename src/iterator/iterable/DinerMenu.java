package iterator.iterable;

import iterator.iterator.Iterator;
import iterator.model.MenuItem;

import javax.naming.OperationNotSupportedException;

public class DinerMenu implements Iterable {

    private MenuItem[] menuItems;
    private int currMenuPos;

    public DinerMenu(int numMenuItems){
        menuItems = new MenuItem[numMenuItems];
        addItem("Burger with fries", false, 5.25f);
        addItem("Baby back ribs", false, 7.50f);
    }

    private void addItem(String name, boolean vegetarian, float price){
        menuItems[currMenuPos++] = (new MenuItem(name, vegetarian, price));
    }

    private static class DinerMenuIterator implements Iterator<MenuItem>{

        private MenuItem[] menuItems;
        private int currPos;

        private DinerMenuIterator(MenuItem[] menuItems){
            this.menuItems = menuItems;
        }

        @Override
        public boolean hasNext() {
            return currPos < menuItems.length && menuItems[currPos] != null;
        }

        @Override
        public MenuItem next() {
            return menuItems[currPos++];
        }

        @Override
        public void remove() {
            menuItems[currPos] = null;
        }
    }

    @Override
    public Iterator iterator() {
        return new DinerMenuIterator(menuItems);
    }
}
