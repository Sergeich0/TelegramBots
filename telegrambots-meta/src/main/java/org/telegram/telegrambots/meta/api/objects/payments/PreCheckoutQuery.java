package org.telegram.telegrambots.meta.api.objects.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;
import org.telegram.telegrambots.meta.api.objects.User;

/**
 * @author Ruben Bermudez
 * @version 1.0
 *
 * This object contains information about incoming pre-checkout query.
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PreCheckoutQuery implements BotApiObject {
    private static final String ID_FIELD = "id";
    private static final String FROM_FIELD = "from";
    private static final String CURRENCY_FIELD = "currency";
    private static final String TOTAL_AMOUNT_FIELD = "total_amount";
    private static final String INVOICE_PAYLOAD_FIELD = "invoice_payload";
    private static final String SHIPPING_OPTION_ID_FIELD = "shipping_option_id";
    private static final String ORDER_INFO_FIELD = "order_info";

    /**
     * Unique query identifier
     */
    @JsonProperty(ID_FIELD)
    private String id;
    /**
     * User who sent the query
     */
    @JsonProperty(FROM_FIELD)
    private User from;
    /**
     * Three-letter ISO 4217 currency code, or “XTR” for payments in Telegram Stars
     */
    @JsonProperty(CURRENCY_FIELD)
    private String currency;
    /**
     * Total price in the smallest units of the currency (integer, not float/double).
     * For example, for a price of US$ 1.45 pass amount = 145.
     */
    @JsonProperty(TOTAL_AMOUNT_FIELD)
    private Integer totalAmount;
    /**
     * Bot specified invoice payload
     */
    @JsonProperty(INVOICE_PAYLOAD_FIELD)
    private String invoicePayload;
    /**
     * Optional.
     * Identifier of a chosen by user shipping option
     */
    @JsonProperty(SHIPPING_OPTION_ID_FIELD)
    private String shippingOptionId;
    /**
     * Optional.
     * Order info provided by the user
     */
    @JsonProperty(ORDER_INFO_FIELD)
    private OrderInfo orderInfo;
}
