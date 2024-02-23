package servises;

import java.util.List;

public class CheckingEnteredValues {
    /**
     * Проверка строки на возможность преобразования ее в дабл
     * @param string строка которая будет проверяться
     * @return true если можно превратить и false если нельзя
     * @throws NumberFormatException
     */
    public boolean isDigit(String string) throws NumberFormatException {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Проверка строки на соответствие математическим символам
     * @param str строка которая будет проверяться
     * @return true если соответствует и false если нет
     */
    public boolean isCorrectCharacter(String str){
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("=")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Проверка строки на соответствие значению "="
     * @param listCommands эррейлист в котором проверяется наличие символа
     * @return true если есть = и false если нет
     */
    public boolean isEnd(List<String> listCommands){
        if (listCommands.contains("=")) {
            return true;
        } else {
            return false;
        }

    }





}
