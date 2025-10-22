package ar.edu.unlp.info.oo1.ejercicio18;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EvenNumberSet implements Set<Integer>{
    private Set<Integer> numbers;

    public EvenNumberSet(){
        this.numbers = new HashSet<>();
    }

    public Set<Integer> getNumbers(){
        return this.numbers;
    }


    @Override
    public int size() {
        return this.getNumbers().size();
    }

    @Override
    public boolean isEmpty() {
        return this.getNumbers().isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.getNumbers().contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return this.getNumbers().iterator();
    }

    @Override
    public Object[] toArray() {
        return this.getNumbers().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.getNumbers().toArray(a);
    }

    @Override
    public boolean add(Integer number) {
        if((number % 2 == 0)&&(this.getNumbers().contains(number))){
            this.getNumbers().add(number);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return this.getNumbers().remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.getNumbers().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        boolean listo = false;
        for (Integer i : c) {
                listo |= this.getNumbers().add(i);
        }
        return listo;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.getNumbers().retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.getNumbers().removeAll(c);
    }

    @Override
    public void clear() {
        this.getNumbers().clear();
    }
}
