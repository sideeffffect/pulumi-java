// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.azurenative.edgeorder.enums.AddressType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Shipping address where customer wishes to receive the device.
 * 
 */
public final class ShippingAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShippingAddressArgs Empty = new ShippingAddressArgs();

    /**
     * Type of address.
     * 
     */
    @Import(name="addressType")
    private @Nullable Output<Either<String,AddressType>> addressType;

    public Optional<Output<Either<String,AddressType>>> addressType() {
        return Optional.ofNullable(this.addressType);
    }

    /**
     * Name of the City.
     * 
     */
    @Import(name="city")
    private @Nullable Output<String> city;

    public Optional<Output<String>> city() {
        return Optional.ofNullable(this.city);
    }

    /**
     * Name of the company.
     * 
     */
    @Import(name="companyName")
    private @Nullable Output<String> companyName;

    public Optional<Output<String>> companyName() {
        return Optional.ofNullable(this.companyName);
    }

    /**
     * Name of the Country.
     * 
     */
    @Import(name="country", required=true)
    private Output<String> country;

    public Output<String> country() {
        return this.country;
    }

    /**
     * Postal code.
     * 
     */
    @Import(name="postalCode")
    private @Nullable Output<String> postalCode;

    public Optional<Output<String>> postalCode() {
        return Optional.ofNullable(this.postalCode);
    }

    /**
     * Name of the State or Province.
     * 
     */
    @Import(name="stateOrProvince")
    private @Nullable Output<String> stateOrProvince;

    public Optional<Output<String>> stateOrProvince() {
        return Optional.ofNullable(this.stateOrProvince);
    }

    /**
     * Street Address line 1.
     * 
     */
    @Import(name="streetAddress1", required=true)
    private Output<String> streetAddress1;

    public Output<String> streetAddress1() {
        return this.streetAddress1;
    }

    /**
     * Street Address line 2.
     * 
     */
    @Import(name="streetAddress2")
    private @Nullable Output<String> streetAddress2;

    public Optional<Output<String>> streetAddress2() {
        return Optional.ofNullable(this.streetAddress2);
    }

    /**
     * Street Address line 3.
     * 
     */
    @Import(name="streetAddress3")
    private @Nullable Output<String> streetAddress3;

    public Optional<Output<String>> streetAddress3() {
        return Optional.ofNullable(this.streetAddress3);
    }

    /**
     * Extended Zip Code.
     * 
     */
    @Import(name="zipExtendedCode")
    private @Nullable Output<String> zipExtendedCode;

    public Optional<Output<String>> zipExtendedCode() {
        return Optional.ofNullable(this.zipExtendedCode);
    }

    private ShippingAddressArgs() {}

    private ShippingAddressArgs(ShippingAddressArgs $) {
        this.addressType = $.addressType;
        this.city = $.city;
        this.companyName = $.companyName;
        this.country = $.country;
        this.postalCode = $.postalCode;
        this.stateOrProvince = $.stateOrProvince;
        this.streetAddress1 = $.streetAddress1;
        this.streetAddress2 = $.streetAddress2;
        this.streetAddress3 = $.streetAddress3;
        this.zipExtendedCode = $.zipExtendedCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShippingAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShippingAddressArgs $;

        public Builder() {
            $ = new ShippingAddressArgs();
        }

        public Builder(ShippingAddressArgs defaults) {
            $ = new ShippingAddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder addressType(@Nullable Output<Either<String,AddressType>> addressType) {
            $.addressType = addressType;
            return this;
        }

        public Builder addressType(Either<String,AddressType> addressType) {
            return addressType(Output.of(addressType));
        }

        public Builder city(@Nullable Output<String> city) {
            $.city = city;
            return this;
        }

        public Builder city(String city) {
            return city(Output.of(city));
        }

        public Builder companyName(@Nullable Output<String> companyName) {
            $.companyName = companyName;
            return this;
        }

        public Builder companyName(String companyName) {
            return companyName(Output.of(companyName));
        }

        public Builder country(Output<String> country) {
            $.country = country;
            return this;
        }

        public Builder country(String country) {
            return country(Output.of(country));
        }

        public Builder postalCode(@Nullable Output<String> postalCode) {
            $.postalCode = postalCode;
            return this;
        }

        public Builder postalCode(String postalCode) {
            return postalCode(Output.of(postalCode));
        }

        public Builder stateOrProvince(@Nullable Output<String> stateOrProvince) {
            $.stateOrProvince = stateOrProvince;
            return this;
        }

        public Builder stateOrProvince(String stateOrProvince) {
            return stateOrProvince(Output.of(stateOrProvince));
        }

        public Builder streetAddress1(Output<String> streetAddress1) {
            $.streetAddress1 = streetAddress1;
            return this;
        }

        public Builder streetAddress1(String streetAddress1) {
            return streetAddress1(Output.of(streetAddress1));
        }

        public Builder streetAddress2(@Nullable Output<String> streetAddress2) {
            $.streetAddress2 = streetAddress2;
            return this;
        }

        public Builder streetAddress2(String streetAddress2) {
            return streetAddress2(Output.of(streetAddress2));
        }

        public Builder streetAddress3(@Nullable Output<String> streetAddress3) {
            $.streetAddress3 = streetAddress3;
            return this;
        }

        public Builder streetAddress3(String streetAddress3) {
            return streetAddress3(Output.of(streetAddress3));
        }

        public Builder zipExtendedCode(@Nullable Output<String> zipExtendedCode) {
            $.zipExtendedCode = zipExtendedCode;
            return this;
        }

        public Builder zipExtendedCode(String zipExtendedCode) {
            return zipExtendedCode(Output.of(zipExtendedCode));
        }

        public ShippingAddressArgs build() {
            $.country = Objects.requireNonNull($.country, "expected parameter 'country' to be non-null");
            $.streetAddress1 = Objects.requireNonNull($.streetAddress1, "expected parameter 'streetAddress1' to be non-null");
            return $;
        }
    }

}
