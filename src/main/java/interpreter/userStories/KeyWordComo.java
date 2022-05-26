package interpreter.userStories;

public class KeyWordComo extends UserStory {

    public KeyWordComo(int length) {

        this.length = length;

    }

    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("C")) {

            context.output = context.output + "Given ";
            context.input = context.input.substring(this.length);

        }

    }
}