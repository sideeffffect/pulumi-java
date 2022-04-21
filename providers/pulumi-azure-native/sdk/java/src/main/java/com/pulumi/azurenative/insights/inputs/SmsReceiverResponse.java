// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An SMS receiver.
 * 
 */
public final class SmsReceiverResponse extends com.pulumi.resources.InvokeArgs {

    public static final SmsReceiverResponse Empty = new SmsReceiverResponse();

    /**
     * The country code of the SMS receiver.
     * 
     */
    @Import(name="countryCode", required=true)
    private String countryCode;

    public String countryCode() {
        return this.countryCode;
    }

    /**
     * The name of the SMS receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The phone number of the SMS receiver.
     * 
     */
    @Import(name="phoneNumber", required=true)
    private String phoneNumber;

    public String phoneNumber() {
        return this.phoneNumber;
    }

    /**
     * The status of the receiver.
     * 
     */
    @Import(name="status", required=true)
    private String status;

    public String status() {
        return this.status;
    }

    private SmsReceiverResponse() {}

    private SmsReceiverResponse(SmsReceiverResponse $) {
        this.countryCode = $.countryCode;
        this.name = $.name;
        this.phoneNumber = $.phoneNumber;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SmsReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SmsReceiverResponse $;

        public Builder() {
            $ = new SmsReceiverResponse();
        }

        public Builder(SmsReceiverResponse defaults) {
            $ = new SmsReceiverResponse(Objects.requireNonNull(defaults));
        }

        public Builder countryCode(String countryCode) {
            $.countryCode = countryCode;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            $.phoneNumber = phoneNumber;
            return this;
        }

        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public SmsReceiverResponse build() {
            $.countryCode = Objects.requireNonNull($.countryCode, "expected parameter 'countryCode' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.phoneNumber = Objects.requireNonNull($.phoneNumber, "expected parameter 'phoneNumber' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
