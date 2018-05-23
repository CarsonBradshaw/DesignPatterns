package iterator.iterable;

import iterator.iterator.Iterator;
import iterator.model.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenu implements Iterable {

    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<>();
        addItem("Maple Syrup Pancakes", true, 3.25f);
        addItem("Bacon Pancakes", false, 4.35f);
    }

    private void addItem(String name, boolean vegetarian, float price){
        menuItems.add(new MenuItem(name, vegetarian, price));
    }

    private static class PancakeHouseIterator implements Iterator<MenuItem> {

        private java.util.Iterator iterator;

        private PancakeHouseIterator(ArrayList<MenuItem> menuItems){
            iterator = menuItems.iterator();
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public MenuItem next() {
            return (MenuItem)iterator.next();
        }

        @Override
        public void remove() {
            iterator.remove();
        }
    }

    @Override
    public Iterator iterator() {
        return new PancakeHouseIterator(menuItems);
    }
}
