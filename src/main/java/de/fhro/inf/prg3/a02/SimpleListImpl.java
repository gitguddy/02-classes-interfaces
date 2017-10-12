package de.fhro.inf.prg3.a02;

/**
 * @author Peter Kurfer
 *         Created on 10/6/17.
 */
public class SimpleListImpl implements SimpleList {

    Element head;

    private static class Element {

        private Element next;
        private Object item;

        public Element() {

        }

    }

    @Override
    public void add(Element e) {
        do {
            if (head.next == null) {
                head.next = e;
                e.next = null;
                head = e;
            } else {
                head = head.next;
            }
        } while (head.next != null);
    }

    @Override
    public int size() {
        int count = 0;
        do {
            if (head.next == null) {
                count++;
                return count;
            } else {
                count++;
                head = head.next;
            }
        } while (head.next != null);
    }

    @Override
    public SimpleList filter(SimpleFilter filter) {
        return null;
    }


    // TODO: Implement the required methods.

}
