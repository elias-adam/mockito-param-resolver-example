package foo;

import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

//@ExtendWith(MockitoExtension.class)
public class FooPresenterTest {

    private MyView myView;

    @Mock
    private SomeUtil someUtil;

    @InjectMocks
    private FooPresenter fooPresenter;

    @BeforeEach
    void setUp() {
        myView = mock(MyView.class);
        fooPresenter = new FooPresenter(mock(EventBus.class), myView, "data");
        initMocks(this);
    }

    @Test
    void example() {
        // given

        // when
        fooPresenter.method1();

        // then
        then(myView).should().setTitle("Title");
        then(someUtil).should().doSometingElse();
    }
}
