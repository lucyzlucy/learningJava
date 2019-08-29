package schildt;

class Help4 {
    void helpOn(char what) {
        switch (what) {
            case '1':
                System.out.println("The if:\n\nif(condition) statement; \nelse statement;");
                break;
            case '2':
                System.out.println("The switch:\n\nswitch(expression) {\ncase constant:\n\tstatement sequence;\n\tbreak;\n // ... \n}");
                break;
            case '3':
                System.out.println("The for:\n\nfor(init;condition;iteration)\n\tstatement;");
                break;
            case '4':
                System.out.println("The while:\n\nwhile(condition) statement;");
                break;
            case '5':
                System.out.println("The do-while:\n\ndo {\n\tstatement;\n} while (condition);");
                break;
            case '6':
                System.out.println("The break:\n\nbreak; or break label;");
                break;
            case '7':
                System.out.println("The continue:\n\ncontinue; or continue label;");
                break;
        }
    }
    void showMenu() {
        System.out.println("Help on:\n\t1.if\n\t2.switch\n\t3.for\n\t4.while\n\t5.do-while\n\t6.break;\n\t7.continue;\nChoose one: (q to quit: ) ");
    }

    boolean isInvalid(int ch) {
        return ch < '1' || ch > '7' & ch != 'q';
    }

}
