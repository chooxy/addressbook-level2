package seedu.addressbook.data.person;

public class Contact {
    
    public boolean isPrivate;
    public final String value;
        
    public Contact(String contact, boolean isPrivate) {
        this.isPrivate = isPrivate;
        this.value = contact;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
    
    public boolean isPrivate() {
        return isPrivate;
    }
}
