package pl.lhsystems.successFactors.Utils.CustomAnnotations;

import java.lang.reflect.Field;
import java.util.Map;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import pl.lhsystems.successFactors.Utils.MyExcelReader;

public class AjaxCustomElementLocatorFactory implements ElementLocatorFactory {
  private final SearchContext searchContext;
  private final int timeOutInSeconds;
  private final Map<String,String> substitutions;

  public AjaxCustomElementLocatorFactory(SearchContext searchContext, int timeOutInSeconds, Object thisClassObject) {
    this.searchContext = searchContext;
    this.timeOutInSeconds = timeOutInSeconds;
    this.substitutions = new MyExcelReader(thisClassObject.getClass().getName(),thisClassObject.getClass().getSimpleName()).fillSubstitutionsMap();
  }

  public ElementLocator createLocator(Field field) {
	AjaxCustomAnnotations annotations = new AjaxCustomAnnotations(field, substitutions);
    return new AjaxElementLocator(searchContext, timeOutInSeconds, annotations);
  }
}
