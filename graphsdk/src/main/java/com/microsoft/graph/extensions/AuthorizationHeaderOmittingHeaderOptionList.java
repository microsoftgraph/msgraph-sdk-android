package com.microsoft.graph.extensions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.microsoft.graph.options.HeaderOption;

class AuthorizationHeaderOmittingHeaderOptionList implements List<HeaderOption> {

	/**
	 * Authorization header name.
	 */
	private static final String AUTHORIZATION_HEADER_NAME = "Authorization";

	private final List<HeaderOption> delegate;

	public AuthorizationHeaderOmittingHeaderOptionList(List<HeaderOption> delegate) {
		this.delegate = delegate;
	}

	@Override
	public void add(int i, HeaderOption headerOption) {
		if (isAuthenticationHeader(headerOption)) {
			return;
		}
		delegate.add(i, headerOption);
	}

	@Override
	public boolean add(HeaderOption headerOption) {
		if (isAuthenticationHeader(headerOption)) {
			return false;
		}
		return delegate.add(headerOption);
	}

	@Override
	public boolean addAll(int i, Collection<? extends HeaderOption> collection) {
		return delegate.addAll(i, copyWithoutAuthorziationHeader(collection));
	}

	@Override
	public boolean addAll(Collection<? extends HeaderOption> collection) {
		return delegate.addAll(copyWithoutAuthorziationHeader(collection));
	}

	@Override
	public void clear() {
		delegate.clear();
	}

	@Override
	public boolean contains(Object o) {
		return delegate.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> collection) {
		return delegate.containsAll(collection);
	}

	@Override
	public boolean equals(Object o) {
		return delegate.equals(o);
	}

	@Override
	public HeaderOption get(int i) {
		return delegate.get(i);
	}

	@Override
	public int hashCode() {
		return delegate.hashCode();
	}

	@Override
	public int indexOf(Object o) {
		return delegate.indexOf(o);
	}

	@Override
	public boolean isEmpty() {
		return delegate.isEmpty();
	}

	@Override
	public Iterator<HeaderOption> iterator() {
		return delegate.iterator();
	}

	@Override
	public int lastIndexOf(Object o) {
		return delegate.lastIndexOf(o);
	}

	@Override
	public ListIterator<HeaderOption> listIterator() {
		return delegate.listIterator();
	}

	@Override
	public ListIterator<HeaderOption> listIterator(int i) {
		return delegate.listIterator(i);
	}

	@Override
	public HeaderOption remove(int i) {
		return delegate.remove(i);
	}

	@Override
	public boolean remove(Object o) {
		return delegate.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> collection) {
		return delegate.removeAll(collection);
	}

	@Override
	public boolean retainAll(Collection<?> collection) {
		return delegate.retainAll(collection);
	}

	@Override
	public HeaderOption set(int i, HeaderOption headerOption) {
		if (isAuthenticationHeader(headerOption)) {
			return delegate.get(i);
		}
		return delegate.set(i, headerOption);
	}

	@Override
	public int size() {
		return delegate.size();
	}

	@Override
	public List<HeaderOption> subList(int i, int i1) {
		return new AuthorizationHeaderOmittingHeaderOptionList(delegate.subList(i, i1));
	}

	@Override
	public Object[] toArray() {
		return delegate.toArray();
	}

	@Override
	public <T> T[] toArray(T[] ts) {
		return delegate.toArray(ts);
	}

	private Collection<? extends HeaderOption> copyWithoutAuthorziationHeader(Collection<? extends HeaderOption> collection) {
		List<HeaderOption> collectionWithoutAuthorizationHeader = new ArrayList<>(collection.size());
		for (HeaderOption option : collection) {
			if (!isAuthenticationHeader(option)) {
				collectionWithoutAuthorizationHeader.add(option);
			}
		}
		return collectionWithoutAuthorizationHeader;
	}

	private boolean isAuthenticationHeader(HeaderOption headerOption) {
		return isAuthorizationHeaderName(headerOption.getName());
	}

	public static boolean isAuthorizationHeaderName(String headerName) {
		return AUTHORIZATION_HEADER_NAME.equalsIgnoreCase(headerName);
	}

}
