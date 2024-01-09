package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Contact;

public class ContactDao {

	private Connection conn;

	public ContactDao(Connection conn) {
		super();
		this.conn = conn;
	};

	public boolean saveContact(Contact c) {

		boolean f = false;

		try {
			String sql = "insert into contact(name,email,phno,about,userid) values(?,?,?,?,?)";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c.getName());
			pstmt.setString(2, c.getEmail());
			pstmt.setString(3, c.getPhone());
			pstmt.setString(4, c.getAbout());
			pstmt.setInt(5, c.getUserId());

			int i = pstmt.executeUpdate();

			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public List<Contact> getAllcontact(int uid) {

		List<Contact> list = new ArrayList<Contact>();

		Contact c = null;

		try {
			String sql = "select * from contact where userid = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, uid);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				c = new Contact();
				c.setId(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setEmail(rs.getString(3));
				c.setPhone(rs.getString(4));
				c.setAbout(rs.getString(5));

				list.add(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public Contact getContectById(int cid) {

		Contact c = new Contact();

		try {
			PreparedStatement ps = conn.prepareStatement("select * from contact where id = ?");
			ps.setInt(1, cid);

			ps.executeQuery();

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				c.setId(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setEmail(rs.getString(3));
				c.setAbout(rs.getString(4));
			}
			

		} catch (Exception e) {
			// TODO: handle exception
		}
		return c;
	}
}
