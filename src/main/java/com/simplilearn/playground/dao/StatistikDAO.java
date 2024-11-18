package com.simplilearn.playground.dao;

import com.simplilearn.playground.config.DatabaseConnection;
import com.simplilearn.playground.model.Statistik;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StatistikDAO {
    public List<Statistik> getAllStatistik() {
        List<Statistik> statistikList = new ArrayList<>();
        String sql = "SELECT * FROM statistik";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String bulan = resultSet.getString("bulan");
                int nilai = resultSet.getInt("nilai");

                statistikList.add(new Statistik(id, bulan, nilai));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return statistikList;
    }
    
    public void insertStatistik(String bulan, int nilai) {
        String sql = "INSERT INTO statistik (bulan, nilai) VALUES (?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, bulan);
            statement.setInt(2, nilai);
            statement.executeUpdate();

            System.out.println("Data berhasil ditambahkan: " + bulan + " - " + nilai);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Gagal menambahkan data.");
        }
    }

}
