package interpreter.userStories;

public class UserActionsValueStory extends UserStory {

    public UserActionsValueStory(int length) {

        this.length = length;

    }

    @Override
    public void interpreter(Context context) {

        context.output = context.output + context.input.substring(0, this.length) + " ";
        context.input = context.input.substring(this.length);

    }
}
