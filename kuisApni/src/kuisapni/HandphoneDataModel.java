/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisapni;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import kuis.db.DBHelper;


public class HandphoneDataModel {
    
    private final Connection conn;

    public HandphoneDataModel() throws SQLException {
        this.conn =DBHelper.getConnection();
    }
    
    public void addHandphone(Handphone hp){
    String inserthp = "INSERT INTO handphone ( `tanggal_produksi`, `merek`, `harga`, `jenis`, `warna`)"
            + "VALUES ('"
            +hp.getTanggal_produksi()+"','"
            +hp.getMerek()+"','"
            +hp.getHarga()+"','"
            +hp.getJenis()+"','"
            +hp.getWarna()+"')";
    try {
    
    PreparedStatement phone = (PreparedStatement) conn.prepareStatement(inserthp);
    
    phone.execute();
    }
    catch(Exception e){
        System.out.println("eror "+e);
    }
    }
    
}
