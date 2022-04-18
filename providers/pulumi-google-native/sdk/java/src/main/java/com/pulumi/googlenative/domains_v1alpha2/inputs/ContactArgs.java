// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1alpha2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.domains_v1alpha2.inputs.PostalAddressArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details required for a contact associated with a `Registration`.
 * 
 */
public final class ContactArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContactArgs Empty = new ContactArgs();

    /**
     * Email address of the contact.
     * 
     */
    @Import(name="email", required=true)
      private final Output<String> email;

    public Output<String> email() {
        return this.email;
    }

    /**
     * Fax number of the contact in international format. For example, `"+1-800-555-0123"`.
     * 
     */
    @Import(name="faxNumber")
      private final @Nullable Output<String> faxNumber;

    public Output<String> faxNumber() {
        return this.faxNumber == null ? Codegen.empty() : this.faxNumber;
    }

    /**
     * Phone number of the contact in international format. For example, `"+1-800-555-0123"`.
     * 
     */
    @Import(name="phoneNumber", required=true)
      private final Output<String> phoneNumber;

    public Output<String> phoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Postal address of the contact.
     * 
     */
    @Import(name="postalAddress", required=true)
      private final Output<PostalAddressArgs> postalAddress;

    public Output<PostalAddressArgs> postalAddress() {
        return this.postalAddress;
    }

    public ContactArgs(
        Output<String> email,
        @Nullable Output<String> faxNumber,
        Output<String> phoneNumber,
        Output<PostalAddressArgs> postalAddress) {
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.faxNumber = faxNumber;
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
        this.postalAddress = Objects.requireNonNull(postalAddress, "expected parameter 'postalAddress' to be non-null");
    }

    private ContactArgs() {
        this.email = Codegen.empty();
        this.faxNumber = Codegen.empty();
        this.phoneNumber = Codegen.empty();
        this.postalAddress = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> email;
        private @Nullable Output<String> faxNumber;
        private Output<String> phoneNumber;
        private Output<PostalAddressArgs> postalAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.faxNumber = defaults.faxNumber;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.postalAddress = defaults.postalAddress;
        }

        public Builder email(Output<String> email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder email(String email) {
            this.email = Output.of(Objects.requireNonNull(email));
            return this;
        }
        public Builder faxNumber(@Nullable Output<String> faxNumber) {
            this.faxNumber = faxNumber;
            return this;
        }
        public Builder faxNumber(@Nullable String faxNumber) {
            this.faxNumber = Codegen.ofNullable(faxNumber);
            return this;
        }
        public Builder phoneNumber(Output<String> phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Output.of(Objects.requireNonNull(phoneNumber));
            return this;
        }
        public Builder postalAddress(Output<PostalAddressArgs> postalAddress) {
            this.postalAddress = Objects.requireNonNull(postalAddress);
            return this;
        }
        public Builder postalAddress(PostalAddressArgs postalAddress) {
            this.postalAddress = Output.of(Objects.requireNonNull(postalAddress));
            return this;
        }        public ContactArgs build() {
            return new ContactArgs(email, faxNumber, phoneNumber, postalAddress);
        }
    }
}
