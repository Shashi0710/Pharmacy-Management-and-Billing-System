/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author ss
 */
public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            //          st.executeUpdate("CREATE TABLE IF NOT EXISTS appuser(appuser_pk INT AUTO_INCREMENT PRIMARY KEY,userRole varchar(200),name varchar(200),dob varchar(50),mobilenumber varchar(50),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
            //st.executeUpdate("INSERT INTO appuser(userRole,name,dob,mobileNumber,email,username,password,address) values('Admin','Admin','6-12-2024','0000111122','admin@email.com','admin','admin','Sri Lanka')");

            //st.executeUpdate("CREATE TABLE IF NOT EXISTS medicine(medicine_pk INT AUTO_INCREMENT PRIMARY KEY,uniqueId varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)");
            st.executeUpdate("create table bill(bill_pk int AUTO_INCREMENT primary key,billId varchar(200),billDate varchar(50),totalPaid bigint,generatedBy varchar(50))");
            JOptionPane.showMessageDialog(null, "Table created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    } 

}
