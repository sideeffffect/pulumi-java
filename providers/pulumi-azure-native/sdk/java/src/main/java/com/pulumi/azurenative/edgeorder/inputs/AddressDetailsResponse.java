// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.azurenative.edgeorder.inputs.AddressPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Address details for an order item.
 * 
 */
public final class AddressDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AddressDetailsResponse Empty = new AddressDetailsResponse();

    /**
     * Customer address and contact details. It should be address resource
     * 
     */
    @Import(name="forwardAddress", required=true)
    private AddressPropertiesResponse forwardAddress;

    public AddressPropertiesResponse forwardAddress() {
        return this.forwardAddress;
    }

    /**
     * Return shipping address
     * 
     */
    @Import(name="returnAddress", required=true)
    private AddressPropertiesResponse returnAddress;

    public AddressPropertiesResponse returnAddress() {
        return this.returnAddress;
    }

    private AddressDetailsResponse() {}

    private AddressDetailsResponse(AddressDetailsResponse $) {
        this.forwardAddress = $.forwardAddress;
        this.returnAddress = $.returnAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddressDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddressDetailsResponse $;

        public Builder() {
            $ = new AddressDetailsResponse();
        }

        public Builder(AddressDetailsResponse defaults) {
            $ = new AddressDetailsResponse(Objects.requireNonNull(defaults));
        }

        public Builder forwardAddress(AddressPropertiesResponse forwardAddress) {
            $.forwardAddress = forwardAddress;
            return this;
        }

        public Builder returnAddress(AddressPropertiesResponse returnAddress) {
            $.returnAddress = returnAddress;
            return this;
        }

        public AddressDetailsResponse build() {
            $.forwardAddress = Objects.requireNonNull($.forwardAddress, "expected parameter 'forwardAddress' to be non-null");
            $.returnAddress = Objects.requireNonNull($.returnAddress, "expected parameter 'returnAddress' to be non-null");
            return $;
        }
    }

}
