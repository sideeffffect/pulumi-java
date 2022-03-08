// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AddressResponse {
    /**
     * The address line1.
     * 
     */
    private final @Nullable String addressLine1;
    /**
     * The address line2.
     * 
     */
    private final @Nullable String addressLine2;
    /**
     * The address line3.
     * 
     */
    private final @Nullable String addressLine3;
    /**
     * The city name.
     * 
     */
    private final @Nullable String city;
    /**
     * The country name.
     * 
     */
    private final String country;
    /**
     * The postal code.
     * 
     */
    private final @Nullable String postalCode;
    /**
     * The state name.
     * 
     */
    private final @Nullable String state;

    @OutputCustomType.Constructor({"addressLine1","addressLine2","addressLine3","city","country","postalCode","state"})
    private AddressResponse(
        @Nullable String addressLine1,
        @Nullable String addressLine2,
        @Nullable String addressLine3,
        @Nullable String city,
        String country,
        @Nullable String postalCode,
        @Nullable String state) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.state = state;
    }

    /**
     * The address line1.
     * 
    */
    public Optional<String> getAddressLine1() {
        return Optional.ofNullable(this.addressLine1);
    }
    /**
     * The address line2.
     * 
    */
    public Optional<String> getAddressLine2() {
        return Optional.ofNullable(this.addressLine2);
    }
    /**
     * The address line3.
     * 
    */
    public Optional<String> getAddressLine3() {
        return Optional.ofNullable(this.addressLine3);
    }
    /**
     * The city name.
     * 
    */
    public Optional<String> getCity() {
        return Optional.ofNullable(this.city);
    }
    /**
     * The country name.
     * 
    */
    public String getCountry() {
        return this.country;
    }
    /**
     * The postal code.
     * 
    */
    public Optional<String> getPostalCode() {
        return Optional.ofNullable(this.postalCode);
    }
    /**
     * The state name.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressLine1;
        private @Nullable String addressLine2;
        private @Nullable String addressLine3;
        private @Nullable String city;
        private String country;
        private @Nullable String postalCode;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressLine1 = defaults.addressLine1;
    	      this.addressLine2 = defaults.addressLine2;
    	      this.addressLine3 = defaults.addressLine3;
    	      this.city = defaults.city;
    	      this.country = defaults.country;
    	      this.postalCode = defaults.postalCode;
    	      this.state = defaults.state;
        }

        public Builder setAddressLine1(@Nullable String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        public Builder setAddressLine2(@Nullable String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        public Builder setAddressLine3(@Nullable String addressLine3) {
            this.addressLine3 = addressLine3;
            return this;
        }

        public Builder setCity(@Nullable String city) {
            this.city = city;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = Objects.requireNonNull(country);
            return this;
        }

        public Builder setPostalCode(@Nullable String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }
        public AddressResponse build() {
            return new AddressResponse(addressLine1, addressLine2, addressLine3, city, country, postalCode, state);
        }
    }
}
