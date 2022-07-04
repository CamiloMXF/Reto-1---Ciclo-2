
package com.mycompany.reto1;

import javax.swing.JOptionPane;

public class Calculadora {

    public static boolean comprobar(String x) {
        boolean isNumeric = x.matches("[+-]?\\d*(\\.\\d+)?");
        return isNumeric;
    }

    public static void main(String[] args) {
        int x = 0;
        while (x == 0) {
            String seleccion1 = JOptionPane.showInputDialog(
                    "Seleccione una opcion" + "\n" + "\n" + "1.Realizar una operación" + "\n" + "2.Salir");
            if (comprobar(seleccion1)) {
                int principal = Integer.parseInt(seleccion1);
                if (principal == 1) {
                    int y = 0;
                    while (y == 0) {
                        String seleccion2 = JOptionPane.showInputDialog("Seleccione una opcion" + "\n" + "\n" + "1.Suma"
                                + "\n" + "2.Resta" + "\n" + "3.Multiplicacion" + "\n" + "4.Division" + "\n"
                                + "5.Potencia" + "\n" + "6.Raiz cuadrada" + "\n" + "7.Salir");
                        if (comprobar(seleccion2)) {
                            int num111 = Integer.parseInt(seleccion2);
                            if (num111 == 1) {
                                while (y == 0) {
                                    String num1 = JOptionPane.showInputDialog("ingrese el primer numero");
                                    if (comprobar(num1)) {
                                        int a = 0;
                                        while (a == 0) {
                                            String num2 = JOptionPane.showInputDialog("ingrese el segundo numero");
                                            if (comprobar(num2)) {
                                                int num11 = Integer.parseInt(num1);
                                                int num22 = Integer.parseInt(num2);
                                                CalculadoraNew calculadora = new CalculadoraNew(num11, num22);
                                                int resultado = calculadora.sumar();
                                                int c = 0;
                                                while (c == 0) {
                                                    String denuevo = JOptionPane.showInputDialog(
                                                            "El resultado de la operacion es" + "\n" + resultado + "\n"
                                                                    + "1.Salir" + "\n" + "2.Realizar otra operacion");
                                                    if (comprobar(denuevo)) {
                                                        int denuevo1 = Integer.parseInt(denuevo);
                                                        if (denuevo1 == 1) {
                                                            System.exit(0);
                                                        } else if (denuevo1 == 2) {
                                                            main(null);
                                                        }
                                                    } else {
                                                        JOptionPane.showConfirmDialog(null,
                                                                "Solo puedes ingresar numeros");
                                                    }
                                                }
                                            } else {
                                                JOptionPane.showConfirmDialog(null, "Solo puedes ingresar numeros");
                                            }

                                        }
                                    } else {
                                        JOptionPane.showConfirmDialog(null, "Solo puedes ingresar numeros");
                                    }
                                }
                            } else if ((comprobar(seleccion2)) && num111 == 2) {
                                while (y == 0) {
                                    String num1 = JOptionPane.showInputDialog("ingrese el primer numero");
                                    if (comprobar(num1)) {
                                        int a = 0;
                                        while (a == 0) {
                                            String num2 = JOptionPane.showInputDialog("ingrese el segundo numero");
                                            if (comprobar(num2)) {
                                                int num11 = Integer.parseInt(num1);
                                                int num22 = Integer.parseInt(num2);
                                                CalculadoraNew calculadora = new CalculadoraNew(num11, num22);
                                                int resultado = calculadora.restar();
                                                int b = 0;
                                                while (b == 0) {
                                                    String denuevo = JOptionPane.showInputDialog(
                                                            "El resultado de la operacion es" + "\n" + resultado + "\n"
                                                                    + "1.Salir" + "\n" + "2.Realizar otra operacion");
                                                    if (comprobar(denuevo)) {
                                                        int denuevo1 = Integer.parseInt(denuevo);
                                                        if (denuevo1 == 1) {
                                                            System.exit(0);
                                                        } else if (denuevo1 == 2) {
                                                            main(null);
                                                        }
                                                    } else {
                                                        JOptionPane.showConfirmDialog(null,
                                                                "Solo puedes ingresar numeros");
                                                    }

                                                }
                                            } else {
                                                JOptionPane.showConfirmDialog(null, "Solo puedes ingresar numeros");
                                            }

                                        }
                                    } else {
                                        JOptionPane.showConfirmDialog(null, "Solo puedes ingresar numeros");
                                    }
                                }

                            } else if ((comprobar(seleccion2)) && num111 == 3) {
                                while (y == 0) {
                                    String num1 = JOptionPane.showInputDialog("ingrese el primer numero");
                                    if (comprobar(num1)) {
                                        int a = 0;
                                        while (a == 0) {
                                            String num2 = JOptionPane.showInputDialog("ingrese el segundo numero");
                                            if (comprobar(num2)) {
                                                int num11 = Integer.parseInt(num1);
                                                int num22 = Integer.parseInt(num2);
                                                CalculadoraNew calculadora = new CalculadoraNew(num11, num22);
                                                int resultado = calculadora.multiplicacion();
                                                int b = 0;
                                                while (b == 0) {
                                                    String denuevo = JOptionPane.showInputDialog(
                                                            "El resultado de la operacion es" + "\n" + resultado + "\n"
                                                                    + "1.Salir" + "\n" + "2.Realizar otra operacion");
                                                    if (comprobar(denuevo)) {
                                                        int denuevo1 = Integer.parseInt(denuevo);
                                                        if (denuevo1 == 1) {
                                                            System.exit(0);
                                                        } else if (denuevo1 == 2) {
                                                            main(null);
                                                        }
                                                    } else {
                                                        JOptionPane.showConfirmDialog(null,
                                                                "Solo puedes ingresar numeros");
                                                    }

                                                }
                                            } else {
                                                JOptionPane.showConfirmDialog(null, "Solo puedes ingresar numeros");
                                            }

                                        }
                                    } else {
                                        JOptionPane.showConfirmDialog(null, "Solo puedes ingresar numeros");
                                    }
                                }

                            } else if ((comprobar(seleccion2)) && num111 == 4) {
                                while (y == 0) {
                                    String num1 = JOptionPane.showInputDialog("ingrese el primer numero");
                                    if (comprobar(num1)) {
                                        int a = 0;
                                        while (a == 0) {
                                            String num2 = JOptionPane.showInputDialog("ingrese el segundo numero");
                                            int num223 = Integer.parseInt(num2);
                                            if (comprobar(num2) && num223 != 0) {
                                                int num11 = Integer.parseInt(num1);
                                                int num22 = Integer.parseInt(num2);
                                                CalculadoraNew calculadora = new CalculadoraNew(num11, num22);
                                                double resultado = calculadora.division();
                                                int b = 0;
                                                while (b == 0) {
                                                    String denuevo = JOptionPane.showInputDialog(
                                                            "El resultado de la operacion es" + "\n" + resultado + "\n"
                                                                    + "1.Salir" + "\n" + "2.Realizar otra operacion");
                                                    if (comprobar(denuevo)) {
                                                        int denuevo1 = Integer.parseInt(denuevo);
                                                        if (denuevo1 == 1) {
                                                            System.exit(0);
                                                        } else if (denuevo1 == 2) {
                                                            main(null);
                                                        }
                                                    } else {
                                                        JOptionPane.showConfirmDialog(null,
                                                                "Solo se pueden ingresar numeros");
                                                    }

                                                }
                                            } else {
                                                JOptionPane.showConfirmDialog(null,
                                                        "Solo puedes ingresar numeros, y tienen que ser diferentes de 0");
                                            }

                                        }
                                    } else {
                                        JOptionPane.showConfirmDialog(null, "Solo puedes ingresar numeros");
                                    }
                                }

                            } else if ((comprobar(seleccion2)) && num111 == 5) {
                                while (y == 0) {
                                    String num1 = JOptionPane.showInputDialog("ingrese el primer numero");
                                    if (comprobar(num1)) {
                                        int a = 0;
                                        while (a == 0) {
                                            String num2 = JOptionPane.showInputDialog("ingrese el segundo numero");
                                            if (comprobar(num2)) {
                                                int num11 = Integer.parseInt(num1);
                                                int num22 = Integer.parseInt(num2);
                                                CalculadoraNew calculadora = new CalculadoraNew(num11, num22);
                                                double resultado = calculadora.potencia();
                                                int b = 0;
                                                while (b == 0) {
                                                    String denuevo = JOptionPane.showInputDialog(
                                                            "El resultado de la operacion es" + "\n" + resultado + "\n"
                                                                    + "1.Salir" + "\n" + "2.Realizar otra operacion");
                                                    if (comprobar(denuevo)) {
                                                        int denuevo1 = Integer.parseInt(denuevo);
                                                        if (denuevo1 == 1) {
                                                            System.exit(0);
                                                        } else if (denuevo1 == 2) {
                                                            main(null);
                                                        }
                                                    } else {
                                                        JOptionPane.showConfirmDialog(null,
                                                                "Solo puedes ingresar numeros");
                                                    }

                                                }
                                            } else {
                                                JOptionPane.showConfirmDialog(null, "Solo puedes ingresar numeros");
                                            }

                                        }
                                    } else {
                                        JOptionPane.showConfirmDialog(null, "Solo puedes ingresar numeros");
                                    }
                                }

                            } else if ((comprobar(seleccion2)) && num111 == 6) {
                                while (y == 0) {
                                    String num1 = JOptionPane.showInputDialog("ingrese el numero");
                                    if (comprobar(num1)) {
                                        int a = 0;
                                        while (a == 0) {
                                            int num11 = Integer.parseInt(num1);
                                            CalculadoraNew calculadora = new CalculadoraNew(num11, num11);
                                            double resultado = calculadora.raiz_cuadrada();
                                            int b = 0;
                                            while (b == 0) {
                                                String denuevo = JOptionPane.showInputDialog(
                                                        "El resultado de la operacion es" + "\n" + resultado + "\n"
                                                                + "1.Salir" + "\n" + "2.Realizar otra operacion");
                                                if (comprobar(denuevo)) {
                                                    int denuevo1 = Integer.parseInt(denuevo);
                                                    if (denuevo1 == 1) {
                                                        System.exit(0);
                                                    } else if (denuevo1 == 2) {
                                                        main(null);
                                                    }
                                                } else {
                                                    JOptionPane.showConfirmDialog(null, "Solo puedes ingresar numeros");
                                                }

                                            }

                                        }
                                    } else {
                                        JOptionPane.showConfirmDialog(null, "Solo puedes ingresar numeros");
                                    }
                                }

                            } else if ((comprobar(seleccion2)) && num111 == 7) {
                                System.exit(0);

                            }

                        } else {
                            JOptionPane.showConfirmDialog(null, "Solo puedes ingresar numeros");

                        }
                    }

                } else if ((comprobar(seleccion1) == true) && principal == 2) {
                    System.exit(0);
                }

            } else {
                JOptionPane.showConfirmDialog(null, "Solo puedes ingresar numeros");

            }
        }
    }
}
