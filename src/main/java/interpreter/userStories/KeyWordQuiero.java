package interpreter.userStories;

public class KeyWordQuiero extends UserStory {

    public KeyWordQuiero(int length) {

        this.length = length;

    }

    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("Q")) {

            context.output = context.output + "When ";
            context.input = context.input.substring(this.length);

        }

    }
}