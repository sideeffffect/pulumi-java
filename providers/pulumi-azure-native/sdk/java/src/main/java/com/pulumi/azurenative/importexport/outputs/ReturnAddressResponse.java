// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.importexport.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReturnAddressResponse {
    /**
     * The city name to use when returning the drives.
     * 
     */
    private final String city;
    /**
     * The country or region to use when returning the drives.
     * 
     */
    private final String countryOrRegion;
    /**
     * Email address of the recipient of the returned drives.
     * 
     */
    private final String email;
    /**
     * Phone number of the recipient of the returned drives.
     * 
     */
    private final String phone;
    /**
     * The postal code to use when returning the drives.
     * 
     */
    private final String postalCode;
    /**
     * The name of the recipient who will receive the hard drives when they are returned.
     * 
     */
    private final String recipientName;
    /**
     * The state or province to use when returning the drives.
     * 
     */
    private final @Nullable String stateOrProvince;
    /**
     * The first line of the street address to use when returning the drives.
     * 
     */
    private final String streetAddress1;
    /**
     * The second line of the street address to use when returning the drives.
     * 
     */
    private final @Nullable String streetAddress2;

    @CustomType.Constructor
    private ReturnAddressResponse(
        @CustomType.Parameter("city") String city,
        @CustomType.Parameter("countryOrRegion") String countryOrRegion,
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("phone") String phone,
        @CustomType.Parameter("postalCode") String postalCode,
        @CustomType.Parameter("recipientName") String recipientName,
        @CustomType.Parameter("stateOrProvince") @Nullable String stateOrProvince,
        @CustomType.Parameter("streetAddress1") String streetAddress1,
        @CustomType.Parameter("streetAddress2") @Nullable String streetAddress2) {
        this.city = city;
        this.countryOrRegion = countryOrRegion;
        this.email = email;
        this.phone = phone;
        this.postalCode = postalCode;
        this.recipientName = recipientName;
        this.stateOrProvince = stateOrProvince;
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
    }

    /**
     * The city name to use when returning the drives.
     * 
    */
    public String city() {
        return this.city;
    }
    /**
     * The country or region to use when returning the drives.
     * 
    */
    public String countryOrRegion() {
        return this.countryOrRegion;
    }
    /**
     * Email address of the recipient of the returned drives.
     * 
    */
    public String email() {
        return this.email;
    }
    /**
     * Phone number of the recipient of the returned drives.
     * 
    */
    public String phone() {
        return this.phone;
    }
    /**
     * The postal code to use when returning the drives.
     * 
    */
    public String postalCode() {
        return this.postalCode;
    }
    /**
     * The name of the recipient who will receive the hard drives when they are returned.
     * 
    */
    public String recipientName() {
        return this.recipientName;
    }
    /**
     * The state or province to use when returning the drives.
     * 
    */
    public Optional<String> stateOrProvince() {
        return Optional.ofNullable(this.stateOrProvince);
    }
    /**
     * The first line of the street address to use when returning the drives.
     * 
    */
    public String streetAddress1() {
        return this.streetAddress1;
    }
    /**
     * The second line of the street address to use when returning the drives.
     * 
    */
    public Optional<String> streetAddress2() {
        return Optional.ofNullable(this.streetAddress2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReturnAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String city;
        private String countryOrRegion;
        private String email;
        private String phone;
        private String postalCode;
        private String recipientName;
        private @Nullable String stateOrProvince;
        private String streetAddress1;
        private @Nullable String streetAddress2;

        public Builder() {
    	      // Empty
        }

        public Builder(ReturnAddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.city = defaults.city;
    	      this.countryOrRegion = defaults.countryOrRegion;
    	      this.email = defaults.email;
    	      this.phone = defaults.phone;
    	      this.postalCode = defaults.postalCode;
    	      this.recipientName = defaults.recipientName;
    	      this.stateOrProvince = defaults.stateOrProvince;
    	      this.streetAddress1 = defaults.streetAddress1;
    	      this.streetAddress2 = defaults.streetAddress2;
        }

        public Builder city(String city) {
            this.city = Objects.requireNonNull(city);
            return this;
        }
        public Builder countryOrRegion(String countryOrRegion) {
            this.countryOrRegion = Objects.requireNonNull(countryOrRegion);
            return this;
        }
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder phone(String phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }
        public Builder postalCode(String postalCode) {
            this.postalCode = Objects.requireNonNull(postalCode);
            return this;
        }
        public Builder recipientName(String recipientName) {
            this.recipientName = Objects.requireNonNull(recipientName);
            return this;
        }
        public Builder stateOrProvince(@Nullable String stateOrProvince) {
            this.stateOrProvince = stateOrProvince;
            return this;
        }
        public Builder streetAddress1(String streetAddress1) {
            this.streetAddress1 = Objects.requireNonNull(streetAddress1);
            return this;
        }
        public Builder streetAddress2(@Nullable String streetAddress2) {
            this.streetAddress2 = streetAddress2;
            return this;
        }        public ReturnAddressResponse build() {
            return new ReturnAddressResponse(city, countryOrRegion, email, phone, postalCode, recipientName, stateOrProvince, streetAddress1, streetAddress2);
        }
    }
}
