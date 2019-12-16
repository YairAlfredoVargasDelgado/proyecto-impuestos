package com.poo.impuestovehicular.presentacion;

import com.poo.impuestovehicular.entidades.Administrador;
import com.poo.impuestovehicular.entidades.Cliente;
import com.poo.impuestovehicular.entidades.Usuario;

public class Principal {

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IniciarSesiónDlg iniciarSesiónDlg = new IniciarSesiónDlg(null, true);
                iniciarSesiónDlg.setVisible(true);

                if (iniciarSesiónDlg.getUsuario() instanceof Cliente) {
                    new ClienteFrm(null, true, (Cliente) iniciarSesiónDlg.getUsuario()).setVisible(true);
                    return;
                }

                if (iniciarSesiónDlg.getUsuario() instanceof Administrador) {
                    new PrincipalFrm((Administrador) iniciarSesiónDlg.getUsuario()).setVisible(true);
                    return;
                }

            }
        });
    }

}
