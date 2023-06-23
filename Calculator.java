/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Arshi
 */
public class calculator extends javax.swing.JFrame {
    
    
    double number1,number2,result;
    String opr;
   
    public calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        textfield = new javax.swing.JTextField();
        tan = new javax.swing.JButton();
        tanh = new javax.swing.JButton();
        add = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        div = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        cosh = new javax.swing.JButton();
        BackSpace = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        three = new javax.swing.JButton();
        six = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        sinh = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        second = new javax.swing.JButton();
        five = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        exp = new javax.swing.JButton();
        log = new javax.swing.JButton();
        percenage = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        one = new javax.swing.JButton();
        four = new javax.swing.JButton();
        doublezero = new javax.swing.JButton();
        R = new javax.swing.JButton();
        inverse = new javax.swing.JButton();
        power = new javax.swing.JButton();
        cube = new javax.swing.JButton();
        factorial = new javax.swing.JButton();
        square = new javax.swing.JButton();
        zero = new javax.swing.JButton();

        jButton5.setText("jButton5");

        jButton7.setText("jButton2");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("jRadioButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator");
        setPreferredSize(new java.awt.Dimension(362, 483));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        textfield.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textfield.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldActionPerformed(evt);
            }
        });

        tan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tan.setText("tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        tanh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tanh.setText("tanh");
        tanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanhActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        sub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        div.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        mul.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mul.setText("*");
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });

        equal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        cos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cos.setText("cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        cosh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cosh.setText("cosh");
        cosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coshActionPerformed(evt);
            }
        });

        BackSpace.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackSpace.setText("B");
        BackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackSpaceActionPerformed(evt);
            }
        });

        nine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        three.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        six.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        sin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sin.setText("sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        sinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sinh.setText("sinh");
        sinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinhActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setText("clr");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        eight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        second.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        second.setText("2");
        second.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondActionPerformed(evt);
            }
        });

        five.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        dot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        exp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exp.setText("exp");
        exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expActionPerformed(evt);
            }
        });

        log.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        log.setText("log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        percenage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        percenage.setText("%");
        percenage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percenageActionPerformed(evt);
            }
        });

        seven.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        four.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        doublezero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doublezero.setText("00");
        doublezero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doublezeroActionPerformed(evt);
            }
        });

        R.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        R.setText("R");
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });

        inverse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inverse.setText("1/X");
        inverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inverseActionPerformed(evt);
            }
        });

        power.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        power.setText("x^4");
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });

        cube.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cube.setText("x^3");
        cube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubeActionPerformed(evt);
            }
        });

        factorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        factorial.setText("n!");
        factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialActionPerformed(evt);
            }
        });

        square.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        square.setText("x^2");
        square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inverse, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cube, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(doublezero, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percenage, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sinh, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cosh, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(div, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tanh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(equal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanh, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(inverse, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(power, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cube, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(square, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(percenage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(doublezero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sinh, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cosh, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
    }                                        

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {                                     
        textfield.setText(textfield.getText() + "5");
    }                                    

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {                                    
         number1 = Double.parseDouble(textfield.getText());
        
        textfield.setText("");
        
        opr = "*" ;
    }                                   

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {                                     
        textfield.setText(textfield.getText() + "0");
    }                                    

    private void doublezeroActionPerformed(java.awt.event.ActionEvent evt) {                                           
        textfield.setText(textfield.getText() + "00");
    }                                          

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {                                    
         textfield.setText(textfield.getText() + ".");
    }                                   

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {                                      
        number2 = Double.parseDouble(textfield.getText());
        
        if(opr == "+"){
           result = number1 + number2 ;
           textfield.setText(Double.toString(result));
        }
        else if(opr == "-"){
           result = number1 - number2 ;
           textfield.setText(Double.toString(result));
        }
        else if(opr == "*"){
            result = number2 * number2;
            textfield.setText(Double.toString(result));
        }
        else if(opr == "/"){
            result = number2 / number2;
            textfield.setText(Double.toString(result));
        }
        else if(opr == "%"){
            result = number2 % number2;
            textfield.setText(Double.toString(result));     
        }
    }                                     

    private void divActionPerformed(java.awt.event.ActionEvent evt) {                                    
         number1 = Double.parseDouble(textfield.getText());
        
        textfield.setText("");
        
        opr = "/" ;
    }                                   

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {                                      
        textfield.setText(textfield.getText() + "3");
    }                                     

    private void secondActionPerformed(java.awt.event.ActionEvent evt) {                                       
        textfield.setText(textfield.getText() + "2");
    }                                      

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {                                    
       textfield.setText(textfield.getText() + "1");
    }                                   
      
    private void factorialActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double t = Double.parseDouble(textfield.getText());
        
        double fact = 2 ;
        while(fact!=0){
            fact = fact*t;
            t--;
        
        }
        textfield.setText("");
        textfield.setText(textfield.getText() + fact);
    }                                         

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {                                    
        textfield.setText(textfield.getText() + "6");
    }                                   

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {                                     
        textfield.setText(textfield.getText() + "4");
    }                                    

    private void squareActionPerformed(java.awt.event.ActionEvent evt) {                                       
        double t = Double.parseDouble(textfield.getText());
        
        t = t*t ;
        textfield.setText("");
        textfield.setText(textfield.getText() + t);
        
    }                                      

    private void subActionPerformed(java.awt.event.ActionEvent evt) {                                    
         number1 = Double.parseDouble(textfield.getText());
        
        textfield.setText("");
        
        opr = "-" ;
    }                                   

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {                                     
       textfield.setText(textfield.getText() + "9");
    }                                    

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {                                      
        textfield.setText(textfield.getText() + "8");
    }                                     

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {                                      
        textfield.setText(textfield.getText() + "7");
    }                                     

    private void cubeActionPerformed(java.awt.event.ActionEvent evt) {                                     
         double t = Double.parseDouble(textfield.getText());
        
        t = t*t*t ;
        textfield.setText("");
        textfield.setText(textfield.getText() + t);
        
    }                                    

    private void addActionPerformed(java.awt.event.ActionEvent evt) {                                    
        number1 = Double.parseDouble(textfield.getText());
        
        textfield.setText("");
        
        opr = "+" ;
    }                                   

    private void BackSpaceActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String BackSpace = null;
        
        if(textfield.getText().length() > 0){
            StringBuilder s = new StringBuilder(textfield.getText());
            
            s.deleteCharAt(textfield.getText().length() - 1);
            BackSpace = s.toString();
            textfield.setText(BackSpace);
        
        }
    }                                         

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {                                      
       textfield.setText("");
    }                                     

    private void percenageActionPerformed(java.awt.event.ActionEvent evt) {                                          
        number1 = Double.parseDouble(textfield.getText());
        
        textfield.setText("");
        
        opr = "%" ;
    }                                         

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {                                      
          double t = Double.parseDouble(textfield.getText());
        
        t = t*t*t*t ;
        textfield.setText("");
        textfield.setText(textfield.getText() + t);      
               
    }                                     

    private void tanhActionPerformed(java.awt.event.ActionEvent evt) {                                     
         double t = Math.tanh(Double.parseDouble(textfield.getText()));
        
        textfield.setText("");
        textfield.setText(textfield.getText() + t);
    }                                    

    private void coshActionPerformed(java.awt.event.ActionEvent evt) {                                     
         double t = Math.cosh(Double.parseDouble(textfield.getText()));
        
        textfield.setText("");
        textfield.setText(textfield.getText() + t);
    }                                    

    private void sinhActionPerformed(java.awt.event.ActionEvent evt) {                                     
         double t = Math.sinh(Double.parseDouble(textfield.getText()));
        
        textfield.setText("");
        textfield.setText(textfield.getText() + t);
    }                                    

    private void logActionPerformed(java.awt.event.ActionEvent evt) {                                    
        double t = Math.log(Double.parseDouble(textfield.getText()));
        
        textfield.setText("");
        textfield.setText(textfield.getText() + t);
    }                                   

    private void inverseActionPerformed(java.awt.event.ActionEvent evt) {                                        
         double t = 1/(Double.parseDouble(textfield.getText()));
        
        textfield.setText("");
        textfield.setText(textfield.getText() + t);
    }                                       

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {                                    
         double t = Math.tan(Double.parseDouble(textfield.getText()));
        
        textfield.setText("");
        textfield.setText(textfield.getText() + t);
    }                                   

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {                                    
         double t = Math.cos(Double.parseDouble(textfield.getText()));
        
        textfield.setText("");
        textfield.setText(textfield.getText() + t);
    }                                   

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {                                    
        double t = Math.sin(Double.parseDouble(textfield.getText()));
        
        textfield.setText("");
        textfield.setText(textfield.getText() + t);
    }                                   

    private void expActionPerformed(java.awt.event.ActionEvent evt) {                                    
         double t = Math.exp(Double.parseDouble(textfield.getText()));
        
        textfield.setText("");
        textfield.setText(textfield.getText() + t);
    }                                   

    private void RActionPerformed(java.awt.event.ActionEvent evt) {                                  
         double t = Math.sqrt(Double.parseDouble(textfield.getText()));
        
        textfield.setText("");
        textfield.setText(textfield.getText() + t);
    }                                 

    private void textfieldActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BackSpace;
    private javax.swing.JButton R;
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JButton cos;
    private javax.swing.JButton cosh;
    private javax.swing.JButton cube;
    private javax.swing.JButton div;
    private javax.swing.JButton dot;
    private javax.swing.JButton doublezero;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton exp;
    private javax.swing.JButton factorial;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton inverse;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JButton log;
    private javax.swing.JButton mul;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton percenage;
    private javax.swing.JButton power;
    private javax.swing.JButton second;
    private javax.swing.JButton seven;
    private javax.swing.JButton sin;
    private javax.swing.JButton sinh;
    private javax.swing.JButton six;
    private javax.swing.JButton square;
    private javax.swing.JButton sub;
    private javax.swing.JButton tan;
    private javax.swing.JButton tanh;
    private javax.swing.JTextField textfield;
    private javax.swing.JButton three;
    private javax.swing.JButton zero;
    // End of variables declaration                   
}
