package client.view.customer.singleRoom;

import client.core.ModelFactory;
import client.model.viewRooms.ViewRoomsModel;
import javafx.beans.property.*;
import javafx.beans.value.ObservableValue;
import org.xml.sax.SAXNotRecognizedException;
import shared.utils.room.RoomType;

import java.time.LocalDate;

public class SingleRoomViewModel {
    private ObjectProperty<LocalDate> dateFrom, dateTo;
    private StringProperty description;
    private StringProperty price;
    private ViewRoomsModel viewRoomsModel;

    public SingleRoomViewModel(ModelFactory modelFactory) {
        this.viewRoomsModel = modelFactory.getViewRoomsModel();
        initializeValues();
        getDescriptionByCategory();
        getPriceByCategory();
    }

    public ObjectProperty<LocalDate> getDateFrom() {
        return dateFrom;
    }

    public ObjectProperty<LocalDate> getDateTo() {
        return dateTo;
    }

    public void searchRooms() {
        System.out.println("single room view model");
        viewRoomsModel.searchRooms(dateFrom.get(), dateTo.get(), RoomType.SINGLE);
    }

    public StringProperty getPrice() {
        return price;
    }

    public void getDescriptionByCategory(){
        String description = viewRoomsModel.getDescriptionByCategory(RoomType.SINGLE);
        this.description.set(description);
    }
    public void getPriceByCategory(){
        String price = viewRoomsModel.getPriceByCategory(RoomType.SINGLE);
        this.price.set(price);
    }
    private void initializeValues() {
        dateFrom = new SimpleObjectProperty<>();
        dateFrom.set(LocalDate.now());
        dateTo = new SimpleObjectProperty<>();
        dateTo.set(LocalDate.now());
        description = new SimpleStringProperty();
        price = new SimpleStringProperty();
    }

    public StringProperty getDescription() {
        return description;
    }
}
