// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains.v1alpha2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.domains.v1alpha2.outputs.PostalAddressResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContactResponse {
    /**
     * @return Email address of the contact.
     * 
     */
    private final String email;
    /**
     * @return Fax number of the contact in international format. For example, `&#34;+1-800-555-0123&#34;`.
     * 
     */
    private final String faxNumber;
    /**
     * @return Phone number of the contact in international format. For example, `&#34;+1-800-555-0123&#34;`.
     * 
     */
    private final String phoneNumber;
    /**
     * @return Postal address of the contact.
     * 
     */
    private final PostalAddressResponse postalAddress;

    @CustomType.Constructor
    private ContactResponse(
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("faxNumber") String faxNumber,
        @CustomType.Parameter("phoneNumber") String phoneNumber,
        @CustomType.Parameter("postalAddress") PostalAddressResponse postalAddress) {
        this.email = email;
        this.faxNumber = faxNumber;
        this.phoneNumber = phoneNumber;
        this.postalAddress = postalAddress;
    }

    /**
     * @return Email address of the contact.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return Fax number of the contact in international format. For example, `&#34;+1-800-555-0123&#34;`.
     * 
     */
    public String faxNumber() {
        return this.faxNumber;
    }
    /**
     * @return Phone number of the contact in international format. For example, `&#34;+1-800-555-0123&#34;`.
     * 
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }
    /**
     * @return Postal address of the contact.
     * 
     */
    public PostalAddressResponse postalAddress() {
        return this.postalAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String faxNumber;
        private String phoneNumber;
        private PostalAddressResponse postalAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.faxNumber = defaults.faxNumber;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.postalAddress = defaults.postalAddress;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder faxNumber(String faxNumber) {
            this.faxNumber = Objects.requireNonNull(faxNumber);
            return this;
        }
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }
        public Builder postalAddress(PostalAddressResponse postalAddress) {
            this.postalAddress = Objects.requireNonNull(postalAddress);
            return this;
        }        public ContactResponse build() {
            return new ContactResponse(email, faxNumber, phoneNumber, postalAddress);
        }
    }
}
