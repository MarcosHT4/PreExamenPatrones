package interpreter.userStories;

public class KeyWordPara extends UserStory {

    public KeyWordPara(int length) {

        this.length = length;

    }

    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("P")) {

            context.output = context.output + "Then ";
            context.input = context.input.substring(this.length);

        }

    }
}