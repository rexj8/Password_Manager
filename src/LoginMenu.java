public class LoginMenu {

    private String id;
    private String pswrd;
    private int count;

    public boolean checkID(String id) {
        this.id = id;
        boolean response = false;

        String countstr = Encryption.MD5(id);
        if (countstr.equals("63a9f0ea7bb98050796b649e85481845")) {
            this.count = 0;
            response = true;
        } else if (countstr.equals("93f725a07423fe1c889f448b33d21f46")) {
            count = 1;
            response = true;
        }

        return response;
    }

    public boolean checkPswrd(String pswrd) {
        this.pswrd = pswrd;
        boolean response = false;
        String countstr = Encryption.SHA1(pswrd);

        if (countstr.equals("dc76e9f0c0006e8f919e0c515c66dbba3982f785") && count == 0) response = true;

        else if (countstr.equals("23524be9dba14bc2f1975b37f95c3381771595c8") && count == 1) response = true;

        return response;
    }

}
