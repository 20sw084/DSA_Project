public class HashTable {
	private static final HashTable.Entry NIL = null;
	private Entry[] entries;
	private int size;
	public HashTable (int capacity){
		entries=new Entry[capacity];
	}
	private class Entry{
		Object key,value;
		Entry next;
		Entry(Object key,Object value,Entry next){
			this.key=key;
			this.next=next;
			this.value=value;
		}
		public String toString() {
			return key+" = "+(Password)value;
		}
	}
	private int hash(Object key) {
		return (key.hashCode() & 0x7FFFFFFF) % entries.length;
	}
	public int size() {
		return size;
	}
	public Object put(Object key, Object value) {
		int h=hash(key);
		value=encrypt(value,15);
		for(Entry i=entries[h];i!=null;i=i.next) {			
			if(i.key.equals(key)) {
				Object oldValue=i.value;
				i.value=value;
				return oldValue;
			}
		}
		entries[h]=new Entry(key,value,entries[h]);
		++size;
		return null;
	}
	public Object get(Object key) {
		int h=hash(key);
		for(Entry i=entries[h];i!=null;i=i.next) {			
			if(i.key.equals(key)) {
				return i.value;
			}
		}	
		return null;
	}
	public Object getDecrypted(Object key) {
		int h=hash(key);
		Object value = null;
		for(Entry i=entries[h];i!=null;i=i.next) {			
			if(i.key.equals(key)) {
				value = i.value;
			}
		}	
		if(value!=null) {
			return decrypt(value,15);
		}
		else
		return null;
	}
	public Object remove(Object key)
	{
		int h=hash(key);
		for(Entry i=entries[h],prev=null;i!=null;prev=i,i=i.next) {			
			Object oldValue=null;
			if(i.key.equals(key)) {
				 oldValue=i.value;
			}
			else {
				prev.next=i.next;
			}
			--size;
			return oldValue;
		}
		return null;
	}
	private void rehash() {
		Entry[] oldEntries=entries;
		entries=new Entry[2*oldEntries.length+1];
		for(int k=0;k<oldEntries.length;k++) {
			Entry entry=oldEntries[k];
			if(entry==null || entry==NIL) {
				continue;
			}
			int h=hash(entry.key);
			for(int i=0;i<entries.length;i++) {
				int j=(h+i)%entries.length;
				if(entries[j]==null) {
					entries[j]=entry;
					break;
				}
			}
		}
	}
	public Object encrypt(Object value,int secretKey) {
		String encrypted="";
		for(int i=0;i<((String) value).length();i++) {
			char ch=((String) value).charAt(i);
			ch+=secretKey;
			encrypted+=ch;
		}
		return encrypted;
	}
	public Object decrypt(Object value, int secretKey) {
		String decrypted="";
		for(int i=0;i<((String) value).length();i++) {
			char ch=((String) value).charAt(i);
			ch-=secretKey;
			decrypted+=ch;
		}
		return decrypted;
	}
}