package foo;

public class DataPresenter {

    private EventBus eventBus;

    private MyView view;

    protected DataPresenter(EventBus eventBus, MyView view) {
        this.eventBus = eventBus;
        this.view = view;
    }

    public MyView getView() {
        return view;
    }

    public EventBus getEventBus() {
        return eventBus;
    }
}
