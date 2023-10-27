package com.Avananta.controller;

import com.jcraft.jsch.*;

public class SshService {
	String host = "ip-172-31-24-170"; // Replace with your server's hostname or IP address
	String username = "ec2-user"; // Replace with your SSH username
	String privateKeyPath = "/Downloads/aiplint2.pem"; // Replace with the path to your private key file

    public void sshToServer(String host, String username, String privateKeyPath) {
        JSch jsch = new JSch();
        Session session = null;

        try {
            jsch.addIdentity(privateKeyPath);
            session = jsch.getSession(username, host, 22);
            session.setConfig("StrictHostKeyChecking", "no"); // Disable strict host key checking

            session.connect();

            // Perform SSH actions (e.g., execute commands, transfer files, etc.)

        } catch (JSchException e) {
            // Handle exceptions
        } finally {
            if (session != null && session.isConnected()) {
                session.disconnect();
            }
        }
    }
}
