//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.io.PrintStream;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//
//
//
//public class ClientHttp {
//    private HttpURLConnection connexion;
//    private String ligne;
//
//    public ClientHttp() {
//
//    }
//    public boolean se_connecter(String adresse)
//    {
//        URL url = null;
//        try {
//            url = new URL("http://"+adresse);
//            System.out.println("ConnectionReussite1");
//        } catch (MalformedURLException ex) {
//            System.out.println("Connection non Reussite1");
//            return false;
//        }
//        try {
//            url.getPort();
//            connexion = (HttpURLConnection) url.openConnection();
//            connexion.setDoOutput(true);
//            connexion.setDoInput(true);
//            connexion.setRequestMethod("POST");
//            connexion.connect();
//            System.out.println("ConnectionReussite");
//        } catch (IOException ex) {
//            System.out.println("ConnectionNonReussite");
//            System.out.println(ex.toString());
//            return false;
//        }
//        return true;
//    }
//
//    public boolean envoyer(String valeur)
//    {
//        System.out.println(valeur);
//        OutputStream out;
//        try {
//            out = connexion.getOutputStream();
//            PrintStream pr = new PrintStream(out);
//            pr.print(valeur);
//        } catch (IOException ex) {
//            return false;
//        }
//        return true;
//    }
//
//    public boolean recevoir()
//    {
//        InputStream inp = null;
//
//        try {
//            inp = connexion.getInputStream();
//        } catch (IOException ex) {
//            System.out.println("erreur inp");
//            return false;
//        }
//        try{
//            BufferedReader in  = new BufferedReader(new InputStreamReader(inp));
//            in.readLine();in.readLine();in.readLine();
//            ligne= in.readLine();
//            in.readLine();
//            System.out.println("ligne : "+ligne);
//
//
//        } catch (IOException ex) {
//            System.out.println("erreur reception");
//            return false;
//        }
//        return true;
//    }
//
//    public String getPage()
//    {
//        return ligne;
//
//    }
//
//}