package foo;

public class FooPresenter extends DataPresenter {

    // @Inject
    private SomeUtil someUtil;

    // @AssistedInject
    FooPresenter(EventBus eventBus, MyView view, /* @Assisted */ String dataAsString) {
        this(eventBus, view, new DataDTO(dataAsString));
        getView().setTitle("Title");
    }

    // @AssistedInject
    FooPresenter(EventBus eventBus, MyView view, /* @Assisted */ DataDTO dataDTO) {
        super(eventBus, view);
        getView().edit(dataDTO);
        getEventBus().doSometing();
    }

    public void method1() {
        someUtil.doSometingElse();
    }
}
