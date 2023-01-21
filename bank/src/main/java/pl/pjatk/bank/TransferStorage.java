package pl.pjatk.bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class TransferStorage {

        private Transfer transfer;

        private ArrayList<Transfer> transferArrayList = new ArrayList<>();

        public TransferStorage(){
            transferArrayList.add(new Transfer(1,1,2,TransferStatus.ACCEPTED));
            transferArrayList.add(new Transfer(2,1,13,TransferStatus.DECLINED));
        }

    public void setTransfer(Transfer transfer) {
        this.transfer = transfer;
    }

    public ArrayList<Transfer> getTransferArrayList() {
        return transferArrayList;
    }

    public void setTransferArrayList(ArrayList<Transfer> transferArrayList) {
        this.transferArrayList = transferArrayList;
    }

    public Transfer getTransfer() {
        return transfer;
    }

    public Transfer findTransfer(int idStatus){
            for (Transfer transfer1: transferArrayList){
                if (transfer.getIdSatus() == idStatus){
                    return transfer;
                }
            }
            return null;
    }


}
