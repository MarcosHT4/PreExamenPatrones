package interpreter.userStories;

import java.util.ArrayList;
import java.util.List;

public class Interpreter extends UserStory {

    private List<UserStory> grammar = new ArrayList<>();

    private Context context;

    public Interpreter(String messageToInterpret) {

        context = new Context(messageToInterpret.replace(" ", ""));

        for(String subString : messageToInterpret.split(" ")) {

            switch (subString) {

                case "Como":
                    grammar.add(new KeyWordComo(subString.length()));
                    break;

                case "Quiero":

                    grammar.add(new KeyWordQuiero(subString.length()));
                    break;

                case "Para":

                    grammar.add(new KeyWordPara(subString.length()));
                    break;

                default:

                    grammar.add(new UserActionsValueStory(subString.length()));
                    break;


            }


        }

    }

    public String evaluteMsg() {

        for(UserStory expression: grammar) {

            expression.interpreter(context);

        }

        return context.output;

    }


    @Override
    public void interpreter(Context context) {

    }
}
