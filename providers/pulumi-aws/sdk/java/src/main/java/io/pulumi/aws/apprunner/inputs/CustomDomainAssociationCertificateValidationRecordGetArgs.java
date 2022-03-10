// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomDomainAssociationCertificateValidationRecordGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomDomainAssociationCertificateValidationRecordGetArgs Empty = new CustomDomainAssociationCertificateValidationRecordGetArgs();

    /**
     * The certificate CNAME record name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The current state of the certificate CNAME record validation. It should change to `SUCCESS` after App Runner completes validation with your DNS.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The record type, always `CNAME`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The certificate CNAME record value.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public CustomDomainAssociationCertificateValidationRecordGetArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> status,
        @Nullable Input<String> type,
        @Nullable Input<String> value) {
        this.name = name;
        this.status = status;
        this.type = type;
        this.value = value;
    }

    private CustomDomainAssociationCertificateValidationRecordGetArgs() {
        this.name = Input.empty();
        this.status = Input.empty();
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDomainAssociationCertificateValidationRecordGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> status;
        private @Nullable Input<String> type;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDomainAssociationCertificateValidationRecordGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder status(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder value(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public CustomDomainAssociationCertificateValidationRecordGetArgs build() {
            return new CustomDomainAssociationCertificateValidationRecordGetArgs(name, status, type, value);
        }
    }
}
