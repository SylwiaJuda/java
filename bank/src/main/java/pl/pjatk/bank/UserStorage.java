package pl.pjatk.bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserStorage {
    private User user;
    private ArrayList<User> userArrayList = new ArrayList<>();

    public UserStorage(){
        userArrayList.add( new User(1,"Adam",22.00));
        userArrayList.add((new User(2,"David", 2000.00)));

    }

    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }

    public User findUser(int id) {
        for(User user: userArrayList){
            if(user.getId() == id){
                return user;
            }
        }
        return null;

    }
}
