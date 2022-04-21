// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDomainAssociationCertificateValidationRecordGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomDomainAssociationCertificateValidationRecordGetArgs Empty = new CustomDomainAssociationCertificateValidationRecordGetArgs();

    /**
     * The certificate CNAME record name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The current state of the certificate CNAME record validation. It should change to `SUCCESS` after App Runner completes validation with your DNS.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The record type, always `CNAME`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The certificate CNAME record value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private CustomDomainAssociationCertificateValidationRecordGetArgs() {}

    private CustomDomainAssociationCertificateValidationRecordGetArgs(CustomDomainAssociationCertificateValidationRecordGetArgs $) {
        this.name = $.name;
        this.status = $.status;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDomainAssociationCertificateValidationRecordGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDomainAssociationCertificateValidationRecordGetArgs $;

        public Builder() {
            $ = new CustomDomainAssociationCertificateValidationRecordGetArgs();
        }

        public Builder(CustomDomainAssociationCertificateValidationRecordGetArgs defaults) {
            $ = new CustomDomainAssociationCertificateValidationRecordGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CustomDomainAssociationCertificateValidationRecordGetArgs build() {
            return $;
        }
    }

}
