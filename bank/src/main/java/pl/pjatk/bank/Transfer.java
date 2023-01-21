package pl.pjatk.bank;

public class Transfer {
    private int idSatus, idUser;
    private double amount;

    private TransferStatus transferStatus;

    public Transfer(int idSatus, int idUser, double amount, TransferStatus transferStatus) {
        this.idSatus = idSatus;
        this.idUser = idUser;
        this.amount = amount;
        this.transferStatus = transferStatus;

    }

    public int getIdSatus() {
        return idSatus;
    }

    public void setIdSatus(int idSatus) {
        this.idSatus = idSatus;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransferStatus getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(TransferStatus transferStatus) {
        this.transferStatus = transferStatus;
    }



    @Override
    public String toString() {
        return "Transfer{" +
                "idSatus=" + idSatus +
                ", idUser=" + idUser +
                ", amount=" + amount +
                ", transferStatus=" + transferStatus +
                '}';
    }
}
