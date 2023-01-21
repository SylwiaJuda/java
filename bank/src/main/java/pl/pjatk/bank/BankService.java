package pl.pjatk.bank;

import org.springframework.stereotype.Component;

@Component
public class BankService {

    private UserStorage userStorage;
    private  TransferStorage transferStorage;

    public BankService(UserStorage userStorage, TransferStorage transferStorage) {
        this.userStorage = userStorage;
        this.transferStorage = transferStorage;
    }

    //rejestracja
    public User createUser(int id, String name, double saldo){
        if (id<=0 || name == null ){
            System.out.printf("You give me wrong infos");
            return null;
        }
        if (userStorage.findUser(id) == null){
            User user = new User(id, name, saldo);
            userStorage.getUserArrayList().add(user);
            return user;
        }
        System.out.printf("User with this id already exists");
        return null;
    }
    //dodanie
    public TransferStatus addTransfer(int id, double amount, double saldo, int idUser, TransferStatus transferStatus, UserStorage userStorage ){
     if (id<=0 ){
            System.out.printf("You give me wrong infos");
            return null;
        }
        if (userStorage.findUser(id) == null){
            System.out.printf("Id cant be null");
            return null;
        }
        if(amount>saldo){
            return TransferStatus.DECLINED;
        }
        if(amount<saldo){
            double sum = userStorage.findUser(id).getSaldo()+amount;
             userStorage.findUser(id).setSaldo(sum);
            return TransferStatus.ACCEPTED;
        }
        return null;

    }





}
